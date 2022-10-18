package typings.phaser.mod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Textures.Texture
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
@JSImport("phaser", "GameObjects.Mesh")
@js.native
open class Mesh protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Mesh {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    * @param vertices The vertices array. Either `xy` pairs, or `xyz` if the `containsZ` parameter is `true` (but see note).
    * @param uvs The UVs pairs array.
    * @param indicies Optional vertex indicies array. If you don't have one, pass `null` or an empty array.
    * @param containsZ Does the vertices data include a `z` component? Note: If not, it will be assumed `z=0`, see method `panZ` or `setOrtho`. Default false.
    * @param normals Optional vertex normals array. If you don't have one, pass `null` or an empty array.
    * @param colors An array of colors, one per vertex, or a single color value applied to all vertices. Default 0xffffff.
    * @param alphas An array of alpha values, one per vertex, or a single alpha value applied to all vertices. Default 1.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    texture: js.UndefOr[String | Texture],
    frame: js.UndefOr[String | Double],
    vertices: js.UndefOr[js.Array[Double]],
    uvs: js.UndefOr[js.Array[Double]],
    indicies: js.UndefOr[js.Array[Double]],
    containsZ: js.UndefOr[Boolean],
    normals: js.UndefOr[js.Array[Double]],
    colors: js.UndefOr[Double | js.Array[Double]],
    alphas: js.UndefOr[Double | js.Array[Double]]
  ) = this()
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  var displayHeight: Double = js.native
  
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  var displayWidth: Double = js.native
  
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: Double): this.type = js.native
  
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setSize(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the size of this Game Object to be that of the given Frame.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param frame The frame to base the size of this Game Object on.
    */
  /* CompleteClass */
  override def setSizeToFrame(frame: Frame): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
  
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  var width: Double = js.native
}
