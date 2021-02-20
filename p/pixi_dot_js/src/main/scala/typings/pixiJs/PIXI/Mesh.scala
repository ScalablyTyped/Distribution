package typings.pixiJs.PIXI

import typings.pixiJs.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base mesh class.
  *
  * This class empowers you to have maximum flexibility to render any kind of WebGL visuals you can think of.
  * This class assumes a certain level of WebGL knowledge.
  * If you know a bit this should abstract enough away to make you life easier!
  *
  * Pretty much ALL WebGL can be broken down into the following:
  * - Geometry - The structure and data for the mesh. This can include anything from positions, uvs, normals, colors etc..
  * - Shader - This is the shader that PixiJS will render the geometry with (attributes in the shader must match the geometry)
  * - State - This is the state of WebGL required to render the mesh.
  *
  * Through a combination of the above elements you can render anything you want, 2D or 3D!
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@js.native
trait Mesh extends Container {
  
  /**
    * Standard non-batching way of rendering.
    * @protected
    * @param {PIXI.Renderer} renderer - Instance to renderer.
    */
  /* protected */ def _renderDefault(renderer: Renderer): Unit = js.native
  
  /**
    * Rendering by using the Batch system.
    * @protected
    * @param {PIXI.Renderer} renderer - Instance to renderer.
    */
  /* protected */ def _renderToBatch(renderer: Renderer): Unit = js.native
  
  /**
    * The blend mode to be applied to the Mesh. Apply a value of
    * `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
    *
    * @member {number}
    * @default PIXI.BLEND_MODES.NORMAL;
    * @see PIXI.BLEND_MODES
    */
  var blendMode: Double = js.native
  
  /**
    * Updates uv field based on from geometry uv's or batchUvs
    */
  def calculateUvs(): Unit = js.native
  
  /**
    * Updates vertexData field based on transform and vertices
    */
  def calculateVertices(): Unit = js.native
  
  /**
    * Tests if a point is inside this mesh. Works only for PIXI.DRAW_MODES.TRIANGLES.
    *
    * @param {PIXI.IPointData} point - the point to test
    * @return {boolean} the result of the test
    */
  def containsPoint(point: IPointData): Boolean = js.native
  
  def destroy(options: Children): Unit = js.native
  
  /**
    * The way the Mesh should be drawn, can be any of the {@link PIXI.DRAW_MODES} constants.
    *
    * @member {number} PIXI.Mesh#drawMode
    * @see PIXI.DRAW_MODES
    */
  var drawMode: Double = js.native
  
  /**
    * Includes vertex positions, face indices, normals, colors, UVs, and
    * custom attributes within buffers, reducing the cost of passing all
    * this data to the GPU. Can be shared between multiple Mesh objects.
    * @member {PIXI.Geometry} PIXI.Mesh#geometry
    * @readonly
    */
  val geometry: Geometry = js.native
  
  /**
    * Alias for {@link PIXI.Mesh#shader}.
    * @member {PIXI.MeshMaterial}
    */
  var material: MeshMaterial = js.native
  
  /**
    * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
    * Advantages can include sharper image quality (like text) and faster rendering on canvas.
    * The main disadvantage is movement of objects may appear less smooth.
    * To set the global default, change {@link PIXI.settings.ROUND_PIXELS}
    *
    * @member {boolean}
    * @default false
    */
  var roundPixels: Boolean = js.native
  
  /**
    * Represents the vertex and fragment shaders that processes the geometry and runs on the GPU.
    * Can be shared between multiple Mesh objects.
    * @member {PIXI.Shader|PIXI.MeshMaterial} PIXI.Mesh#shader
    */
  var shader: Shader | MeshMaterial = js.native
  
  /**
    * How much of the geometry to draw, by default `0` renders everything.
    * @member {number} PIXI.Mesh#size
    * @default 0
    */
  var size: Double = js.native
  
  /**
    * Typically the index of the IndexBuffer where to start drawing.
    * @member {number} PIXI.Mesh#start
    * @default 0
    */
  var start: Double = js.native
  
  /**
    * Represents the WebGL state the Mesh required to render, excludes shader and geometry. E.g.,
    * blend mode, culling, depth testing, direction of rendering triangles, backface, etc.
    * @member {PIXI.State} PIXI.Mesh#state
    */
  var state: State = js.native
  
  /**
    * The texture that the Mesh uses.
    *
    * @member {PIXI.Texture}
    */
  var texture: Texture = js.native
  
  /**
    * The multiply tint applied to the Mesh. This is a hex value. A value of
    * `0xFFFFFF` will remove any tint effect.
    *
    * @member {number}
    * @default 0xFFFFFF
    */
  var tint: Double = js.native
  
  /**
    * To change mesh uv's, change its uvBuffer data and increment its _updateID.
    * @member {PIXI.Buffer}
    * @readonly
    */
  val uvBuffer: Buffer = js.native
  
  /**
    * To change mesh vertices, change its uvBuffer data and increment its _updateID.
    * Incrementing _updateID is optional because most of Mesh objects do it anyway.
    * @member {PIXI.Buffer}
    * @readonly
    */
  val verticesBuffer: Buffer = js.native
}
