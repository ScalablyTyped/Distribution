package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.AlphaSingle
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Geom.Mesh.Face
import typings.phaser.Phaser.Geom.Mesh.Vertex
import typings.phaser.Phaser.Math.Matrix4
import typings.phaser.Phaser.Math.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Mesh Game Object.
  * 
  * The Mesh Game Object allows you to render a group of textured vertices and manipulate
  * the view of those vertices, such as rotation, translation or scaling.
  * 
  * Support for generating mesh data from grids, model data or Wavefront OBJ Files is included.
  * 
  * Although you can use this to render 3D objects, its primary use is for displaying more complex
  * Sprites, or Sprites where you need fine-grained control over the vertex positions in order to
  * achieve special effects in your games. Note that rendering still takes place using Phaser's
  * orthographic camera (after being transformed via `projectionMesh`, see `setPerspective`,
  * `setOrtho`, and `panZ` methods). As a result, all depth and face tests are done in an eventually
  * orthographic space.
  * 
  * The rendering process will iterate through the faces of this Mesh and render out each face
  * that is considered as being in view of the camera. No depth buffer is used, and because of this,
  * you should be careful not to use model data with too many vertices, or overlapping geometry,
  * or you'll probably encounter z-depth fighting. The Mesh was designed to allow for more advanced
  * 2D layouts, rather than displaying 3D objects, even though it can do this to a degree.
  * 
  * In short, if you want to remake Crysis, use a 3D engine, not a Mesh. However, if you want
  * to easily add some small fun 3D elements into your game, or create some special effects involving
  * vertex warping, this is the right object for you. Mesh data becomes part of the WebGL batch,
  * just like standard Sprites, so doesn't introduce any additional shader overhead. Because
  * the Mesh just generates vertices into the WebGL batch, like any other Sprite, you can use all of
  * the common Game Object components on a Mesh too, such as a custom pipeline, mask, blend mode
  * or texture.
  * 
  * Note that the Mesh object is WebGL only and does not have a Canvas counterpart.
  * 
  * The Mesh origin is always 0.5 x 0.5 and cannot be changed.
  */
@js.native
trait Mesh
  extends StObject
     with GameObject
     with AlphaSingle
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with Size
     with Texture
     with Transform
     with Visible
     with ScrollFactor {
  
  /**
    * Adds a new Face into the faces array of this Mesh.
    * 
    * A Face consists of references to 3 Vertex instances, which must be provided.
    * @param vertex1 The first vertex of the Face.
    * @param vertex2 The second vertex of the Face.
    * @param vertex3 The third vertex of the Face.
    */
  def addFace(vertex1: Vertex, vertex2: Vertex, vertex3: Vertex): this.type = js.native
  
  /**
    * Adds a new Vertex into the vertices array of this Mesh.
    * 
    * Just adding a vertex isn't enough to render it. You need to also
    * make it part of a Face, with 3 Vertex instances per Face.
    * @param x The x position of the vertex.
    * @param y The y position of the vertex.
    * @param z The z position of the vertex.
    * @param u The UV u coordinate of the vertex.
    * @param v The UV v coordinate of the vertex.
    * @param color The color value of the vertex. Default 0xffffff.
    * @param alpha The alpha value of the vertex. Default 1.
    */
  def addVertex(x: Double, y: Double, z: Double, u: Double, v: Double): this.type = js.native
  def addVertex(x: Double, y: Double, z: Double, u: Double, v: Double, color: Double): this.type = js.native
  def addVertex(x: Double, y: Double, z: Double, u: Double, v: Double, color: Double, alpha: Double): this.type = js.native
  def addVertex(x: Double, y: Double, z: Double, u: Double, v: Double, color: Unit, alpha: Double): this.type = js.native
  
  /**
    * Adds new vertices to this Mesh by parsing the given data.
    * 
    * This method will take vertex data in one of two formats, based on the `containsZ` parameter.
    * 
    * If your vertex data are `x`, `y` pairs, then `containsZ` should be `false` (this is the default, and will result in `z=0` for each vertex).
    * 
    * If your vertex data is groups of `x`, `y` and `z` values, then the `containsZ` parameter must be true.
    * 
    * The `uvs` parameter is a numeric array consisting of `u` and `v` pairs.
    * 
    * The `normals` parameter is a numeric array consisting of `x`, `y` vertex normal values and, if `containsZ` is true, `z` values as well.
    * 
    * The `indicies` parameter is an optional array that, if given, is an indexed list of vertices to be added.
    * 
    * The `colors` parameter is an optional array, or single value, that if given sets the color of each vertex created.
    * 
    * The `alphas` parameter is an optional array, or single value, that if given sets the alpha of each vertex created.
    * 
    * When providing indexed data it is assumed that _all_ of the arrays are indexed, not just the vertices.
    * 
    * The following example will create a 256 x 256 sized quad using an index array:
    * 
    * ```javascript
    * let mesh = new Mesh(this);  // Assuming `this` is a scene!
    * const vertices = [
    *   -128, 128,
    *   128, 128,
    *   -128, -128,
    *   128, -128
    * ];
    * 
    * const uvs = [
    *   0, 1,
    *   1, 1,
    *   0, 0,
    *   1, 0
    * ];
    * 
    * const indices = [ 0, 2, 1, 2, 3, 1 ];
    * 
    * mesh.addVertices(vertices, uvs, indicies);
    * // Note: Otherwise the added points will be "behind" the camera! This value will project vertex `x` & `y` values 1:1 to pixel values.
    * mesh.hideCCW = false;
    * mesh.setOrtho(mesh.width, mesh.height);
    * ```
    * 
    * If the data is not indexed, it's assumed that the arrays all contain sequential data.
    * @param vertices The vertices array. Either `xy` pairs, or `xyz` if the `containsZ` parameter is `true`.
    * @param uvs The UVs pairs array.
    * @param indicies Optional vertex indicies array. If you don't have one, pass `null` or an empty array.
    * @param containsZ Does the vertices data include a `z` component? If not, it will be assumed `z=0`, see methods `panZ` or `setOrtho`. Default false.
    * @param normals Optional vertex normals array. If you don't have one, pass `null` or an empty array.
    * @param colors An array of colors, one per vertex, or a single color value applied to all vertices. Default 0xffffff.
    * @param alphas An array of alpha values, one per vertex, or a single alpha value applied to all vertices. Default 1.
    */
  def addVertices(
    vertices: js.Array[Double],
    uvs: js.Array[Double],
    indicies: js.UndefOr[js.Array[Double]],
    containsZ: js.UndefOr[Boolean],
    normals: js.UndefOr[js.Array[Double]],
    colors: js.UndefOr[Double | js.Array[Double]],
    alphas: js.UndefOr[Double | js.Array[Double]]
  ): this.type = js.native
  
  /**
    * This method will add the data from a triangulated Wavefront OBJ model file to this Mesh.
    * 
    * The data should have been loaded via the OBJFile:
    * 
    * ```javascript
    * this.load.obj(key, url);
    * ```
    * 
    * Then use the same `key` as the first parameter to this method.
    * 
    * Multiple Mesh Game Objects can use the same model data without impacting on each other.
    * 
    * Make sure your 3D package has triangulated the model data prior to exporting it.
    * 
    * You can add multiple models to a single Mesh, although they will act as one when
    * moved or rotated. You can scale the model data, should it be too small, or too large, to see.
    * You can also offset the vertices of the model via the `x`, `y` and `z` parameters.
    * @param key The key of the model data in the OBJ Cache to add to this Mesh.
    * @param scale An amount to scale the model data by. Use this if the model has exported too small, or large, to see. Default 1.
    * @param x Translate the model x position by this amount. Default 0.
    * @param y Translate the model y position by this amount. Default 0.
    * @param z Translate the model z position by this amount. Default 0.
    * @param rotateX Rotate the model on the x axis by this amount, in radians. Default 0.
    * @param rotateY Rotate the model on the y axis by this amount, in radians. Default 0.
    * @param rotateZ Rotate the model on the z axis by this amount, in radians. Default 0.
    * @param zIsUp Is the z axis up (true), or is y axis up (false)? Default true.
    */
  def addVerticesFromObj(
    key: String,
    scale: js.UndefOr[Double],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    z: js.UndefOr[Double],
    rotateX: js.UndefOr[Double],
    rotateY: js.UndefOr[Double],
    rotateZ: js.UndefOr[Double],
    zIsUp: js.UndefOr[Boolean]
  ): this.type = js.native
  
  /**
    * Iterates and destroys all current Faces in this Mesh, then resets the
    * `faces` and `vertices` arrays.
    */
  def clear(): this.type = js.native
  
  /**
    * You can optionally choose to render the vertices of this Mesh to a Graphics instance.
    * 
    * Achieve this by setting the `debugCallback` and the `debugGraphic` properties.
    * 
    * You can do this in a single call via the `Mesh.setDebug` method, which will use the
    * built-in debug function. You can also set it to your own callback. The callback
    * will be invoked _once per render_ and sent the following parameters:
    * 
    * `debugCallback(src, meshLength, verts)`
    * 
    * `src` is the Mesh instance being debugged.
    * `meshLength` is the number of mesh vertices in total.
    * `verts` is an array of the translated vertex coordinates.
    * 
    * To disable rendering, set this property back to `null`.
    * 
    * Please note that high vertex count Meshes will struggle to debug properly.
    */
  var debugCallback: js.Function = js.native
  
  /**
    * The Graphics instance that the debug vertices will be drawn to, if `setDebug` has
    * been called.
    */
  var debugGraphic: Graphics = js.native
  
  /**
    * Runs a depth sort across all Faces in this Mesh, comparing their averaged depth.
    * 
    * This is called automatically if you use any of the `rotate` methods, but you can
    * also invoke it to sort the Faces should you manually position them.
    */
  def depthSort(): this.type = js.native
  
  /**
    * An array containing the Face instances belonging to this Mesh.
    * 
    * A Face consists of 3 Vertex objects.
    * 
    * This array is populated during calls such as `addVertices` or `addOBJ`.
    */
  var faces: js.Array[Face] = js.native
  
  /**
    * Returns the Face at the given index in this Mesh Game Object.
    * @param index The index of the Face to get.
    */
  def getFace(index: Double): Face = js.native
  
  /**
    * Return an array of Face objects from this Mesh that intersect with the given coordinates.
    * 
    * The given position is translated through the matrix of this Mesh and the given Camera,
    * before being compared against the vertices.
    * 
    * If more than one Face intersects, they will all be returned in the array, but the array will
    * be depth sorted first, so the first element will always be that closest to the camera.
    * @param x The x position to check against.
    * @param y The y position to check against.
    * @param camera The camera to pass the coordinates through. If not give, the default Scene Camera is used.
    */
  def getFaceAt(x: Double, y: Double): js.Array[Face] = js.native
  def getFaceAt(x: Double, y: Double, camera: Camera): js.Array[Face] = js.native
  
  /**
    * Returns the total number of Faces in this Mesh Game Object.
    */
  def getFaceCount(): Double = js.native
  
  /**
    * Returns the total number of Vertices in this Mesh Game Object.
    */
  def getVertexCount(): Double = js.native
  
  /**
    * When rendering, skip any Face that isn't counter clockwise?
    * 
    * Enable this to hide backward-facing Faces during rendering.
    * 
    * Disable it to render all Faces.
    */
  var hideCCW: Boolean = js.native
  
  /**
    * By default, the Mesh will check to see if its model or view transform has
    * changed each frame and only recalculate the vertex positions if they have.
    * 
    * This avoids lots of additional math in the `preUpdate` step when not required.
    * 
    * However, if you are performing per-Face or per-Vertex manipulation on this Mesh,
    * such as tweening a Face, or moving it without moving the rest of the Mesh,
    * then you may need to disable the dirty cache in order for the Mesh to re-render
    * correctly. You can toggle this property to do that. Please note that leaving
    * this set to `true` will cause the Mesh to recalculate the position of every single
    * vertex in it, every single frame. So only really do this if you know you
    * need it.
    */
  var ignoreDirtyCache: Boolean = js.native
  
  /**
    * Checks if the transformation data in this mesh is dirty.
    * 
    * This is used internally by the `preUpdate` step to determine if the vertices should
    * be recalculated or not.
    */
  def isDirty(): Boolean = js.native
  
  /**
    * A Vector3 containing the 3D position of the vertices in this Mesh.
    * 
    * Modifying the components of this property will allow you to reposition where
    * the vertices are rendered within the Mesh. This happens in the `preUpdate` phase,
    * where each vertex is transformed using the view and projection matrices.
    * 
    * Changing this property will impact all vertices being rendered by this Mesh.
    * 
    * You can also adjust the 'view' by using the `pan` methods.
    */
  var modelPosition: Vector3 = js.native
  
  /**
    * A Vector3 containing the 3D rotation of the vertices in this Mesh.
    * 
    * The values should be given in radians, i.e. to rotate the vertices by 90
    * degrees you can use `modelRotation.x = Phaser.Math.DegToRad(90)`.
    * 
    * Modifying the components of this property will allow you to rotate
    * the vertices within the Mesh. This happens in the `preUpdate` phase,
    * where each vertex is transformed using the view and projection matrices.
    * 
    * Changing this property will impact all vertices being rendered by this Mesh.
    */
  var modelRotation: Vector3 = js.native
  
  /**
    * A Vector3 containing the 3D scale of the vertices in this Mesh.
    * 
    * Modifying the components of this property will allow you to scale
    * the vertices within the Mesh. This happens in the `preUpdate` phase,
    * where each vertex is transformed using the view and projection matrices.
    * 
    * Changing this property will impact all vertices being rendered by this Mesh.
    */
  var modelScale: Vector3 = js.native
  
  /**
    * Translates the view position of this Mesh on the x axis by the given amount.
    * @param v The amount to pan by.
    */
  def panX(v: Double): Unit = js.native
  
  /**
    * Translates the view position of this Mesh on the y axis by the given amount.
    * @param v The amount to pan by.
    */
  def panY(v: Double): Unit = js.native
  
  /**
    * Translates the view position of this Mesh on the z axis by the given amount.
    * 
    * As the default `panZ` value is 0, vertices with `z=0` (the default) need special care or else they will not display as they are behind the camera.
    * Consider using `mesh.panZ(mesh.height / (2 * Math.tan(Math.PI / 16)))`, which will interpret vertex geometry 1:1 with pixel geometry (or see `setOrtho`).
    * @param v The amount to pan by.
    */
  def panZ(v: Double): Unit = js.native
  
  /**
    * The Mesh update loop. The following takes place in this method:
    * 
    * First, the `totalRendered` and `totalFrame` properties are set.
    * 
    * If the view matrix of this Mesh isn't dirty, and the model position, rotate or scale properties are
    * all clean, then the method returns at this point.
    * 
    * Otherwise, if the viewPosition is dirty (i.e. from calling a method like `panZ`), then it will
    * refresh the viewMatrix.
    * 
    * After this, a new transformMatrix is built and it then iterates through all Faces in this
    * Mesh, calling `transformCoordinatesLocal` on all of them. Internally, this updates every
    * vertex, calculating its new transformed position, based on the new transform matrix.
    * 
    * Finally, the faces are depth sorted.
    * @param time The current timestamp.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def preUpdate(time: Double, delta: Double): Unit = js.native
  
  /**
    * The projection matrix for this Mesh.
    * 
    * Update it with the `setPerspective` or `setOrtho` methods.
    */
  var projectionMatrix: Matrix4 = js.native
  
  /**
    * The built-in Mesh debug rendering method.
    * 
    * See `Mesh.setDebug` for more details.
    * @param src The Mesh object being rendered.
    * @param faces An array of Faces.
    */
  def renderDebug(src: Mesh, faces: js.Array[Face]): Unit = js.native
  
  /**
    * This method enables rendering of the Mesh vertices to the given Graphics instance.
    * 
    * If you enable this feature, you **must** call `Graphics.clear()` in your Scene `update`,
    * otherwise the Graphics instance you provide to debug will fill-up with draw calls,
    * eventually crashing the browser. This is not done automatically to allow you to debug
    * draw multiple Mesh objects to a single Graphics instance.
    * 
    * The Mesh class has a built-in debug rendering callback `Mesh.renderDebug`, however
    * you can also provide your own callback to be used instead. Do this by setting the `callback` parameter.
    * 
    * The callback is invoked _once per render_ and sent the following parameters:
    * 
    * `callback(src, faces)`
    * 
    * `src` is the Mesh instance being debugged.
    * `faces` is an array of the Faces that were rendered.
    * 
    * You can get the final drawn vertex position from a Face object like this:
    * 
    * ```javascript
    * let face = faces[i];
    * 
    * let x0 = face.vertex1.tx;
    * let y0 = face.vertex1.ty;
    * let x1 = face.vertex2.tx;
    * let y1 = face.vertex2.ty;
    * let x2 = face.vertex3.tx;
    * let y2 = face.vertex3.ty;
    * 
    * graphic.strokeTriangle(x0, y0, x1, y1, x2, y2);
    * ```
    * 
    * If using your own callback you do not have to provide a Graphics instance to this method.
    * 
    * To disable debug rendering, to either your own callback or the built-in one, call this method
    * with no arguments.
    * @param graphic The Graphic instance to render to if using the built-in callback.
    * @param callback The callback to invoke during debug render. Leave as undefined to use the built-in callback.
    */
  def setDebug(): this.type = js.native
  def setDebug(graphic: Unit, callback: js.Function): this.type = js.native
  def setDebug(graphic: Graphics): this.type = js.native
  def setDebug(graphic: Graphics, callback: js.Function): this.type = js.native
  
  /**
    * Builds a new orthographic projection matrix from the given values.
    * 
    * If using this mode you will often need to set `Mesh.hideCCW` to `false` as well.
    * 
    * By default, calling this method with no parameters will set the scaleX value to
    * match the renderer's aspect ratio. If you would like to render vertex positions 1:1
    * to pixel positions, consider calling as `mesh.setOrtho(mesh.width, mesh.height)`.
    * 
    * See also `setPerspective`.
    * @param scaleX The default horizontal scale in relation to the Mesh / Renderer dimensions. Default 1.
    * @param scaleY The default vertical scale in relation to the Mesh / Renderer dimensions. Default 1.
    * @param near The near value of the view. Default -1000.
    * @param far The far value of the view. Default 1000.
    */
  def setOrtho(): Unit = js.native
  def setOrtho(scaleX: Double): Unit = js.native
  def setOrtho(scaleX: Double, scaleY: Double): Unit = js.native
  def setOrtho(scaleX: Double, scaleY: Double, near: Double): Unit = js.native
  def setOrtho(scaleX: Double, scaleY: Double, near: Double, far: Double): Unit = js.native
  def setOrtho(scaleX: Double, scaleY: Double, near: Unit, far: Double): Unit = js.native
  def setOrtho(scaleX: Double, scaleY: Unit, near: Double): Unit = js.native
  def setOrtho(scaleX: Double, scaleY: Unit, near: Double, far: Double): Unit = js.native
  def setOrtho(scaleX: Double, scaleY: Unit, near: Unit, far: Double): Unit = js.native
  def setOrtho(scaleX: Unit, scaleY: Double): Unit = js.native
  def setOrtho(scaleX: Unit, scaleY: Double, near: Double): Unit = js.native
  def setOrtho(scaleX: Unit, scaleY: Double, near: Double, far: Double): Unit = js.native
  def setOrtho(scaleX: Unit, scaleY: Double, near: Unit, far: Double): Unit = js.native
  def setOrtho(scaleX: Unit, scaleY: Unit, near: Double): Unit = js.native
  def setOrtho(scaleX: Unit, scaleY: Unit, near: Double, far: Double): Unit = js.native
  def setOrtho(scaleX: Unit, scaleY: Unit, near: Unit, far: Double): Unit = js.native
  
  /**
    * Builds a new perspective projection matrix from the given values.
    * 
    * These are also the initial projection matrix & parameters for `Mesh` (and see `panZ` for more discussion).
    * 
    * See also `setOrtho`.
    * @param width The width of the projection matrix. Typically the same as the Mesh and/or Renderer.
    * @param height The height of the projection matrix. Typically the same as the Mesh and/or Renderer.
    * @param fov The field of view, in degrees. Default 45.
    * @param near The near value of the view. Default 0.01.
    * @param far The far value of the view. Default 1000.
    */
  def setPerspective(width: Double, height: Double): Unit = js.native
  def setPerspective(width: Double, height: Double, fov: Double): Unit = js.native
  def setPerspective(width: Double, height: Double, fov: Double, near: Double): Unit = js.native
  def setPerspective(width: Double, height: Double, fov: Double, near: Double, far: Double): Unit = js.native
  def setPerspective(width: Double, height: Double, fov: Double, near: Unit, far: Double): Unit = js.native
  def setPerspective(width: Double, height: Double, fov: Unit, near: Double): Unit = js.native
  def setPerspective(width: Double, height: Double, fov: Unit, near: Double, far: Double): Unit = js.native
  def setPerspective(width: Double, height: Double, fov: Unit, near: Unit, far: Double): Unit = js.native
  
  /**
    * Compare the depth of two Faces.
    * @param faceA The first Face.
    * @param faceB The second Face.
    */
  def sortByDepth(faceA: Face, faceB: Face): Double = js.native
  
  /**
    * The tint fill mode.
    * 
    * `false` = An additive tint (the default), where vertices colors are blended with the texture.
    * `true` = A fill tint, where the vertex colors replace the texture, but respects texture alpha.
    */
  var tintFill: Boolean = js.native
  
  /**
    * How many faces were rendered by this Mesh Game Object in the last
    * draw? This is reset in the `preUpdate` method and then incremented
    * each time a face is drawn. Note that in multi-camera Scenes this
    * value may exceed that found in `Mesh.getFaceCount` due to
    * cameras drawing the same faces more than once.
    */
  val totalRendered: Double = js.native
  
  /**
    * The transformation matrix for this Mesh.
    */
  var transformMatrix: Matrix4 = js.native
  
  /**
    * An array containing Vertex instances. One instance per vertex in this Mesh.
    * 
    * This array is populated during calls such as `addVertex` or `addOBJ`.
    */
  var vertices: js.Array[Vertex] = js.native
  
  /**
    * The view matrix for this Mesh.
    */
  var viewMatrix: Matrix4 = js.native
  
  /**
    * The view position for this Mesh.
    * 
    * Use the methods`panX`, `panY` and `panZ` to adjust the view.
    */
  var viewPosition: Vector3 = js.native
}
