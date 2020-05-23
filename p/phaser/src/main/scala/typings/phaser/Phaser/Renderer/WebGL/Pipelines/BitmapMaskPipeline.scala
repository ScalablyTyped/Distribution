package typings.phaser.Phaser.Renderer.WebGL.Pipelines

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Game
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Scene
import typings.phaser.integer
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.Uint8Array
import typings.std.WebGLBuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BitmapMaskPipeline handles all bitmap masking rendering in WebGL. It works by using 
  * sampling two texture on the fragment shader and using the fragment's alpha to clip the region.
  * The config properties are:
  * - game: Current game instance.
  * - renderer: Current WebGL renderer.
  * - topology: This indicates how the primitives are rendered. The default value is GL_TRIANGLES.
  *              Here is the full list of rendering primitives (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
  * - vertShader: Source for vertex shader as a string.
  * - fragShader: Source for fragment shader as a string.
  * - vertexCapacity: The amount of vertices that shall be allocated
  * - vertexSize: The size of a single vertex in bytes.
  */
trait BitmapMaskPipeline extends WebGLPipeline {
  /**
    * Size of the batch.
    */
  var maxQuads: Double
  /**
    * Dirty flag to check if resolution properties need to be updated on the 
    * masking shader.
    */
  var resolutionDirty: Boolean
  /**
    * Float32 view of the array buffer containing the pipeline's vertices.
    */
  var vertexViewF32: Float32Array
  /**
    * Binds necessary resources and renders the mask to a separated framebuffer.
    * The framebuffer for the masked object is also bound for further use.
    * @param mask GameObject used as mask.
    * @param maskedObject GameObject masked by the mask GameObject.
    * @param camera The camera rendering the current mask.
    */
  def beginMask(mask: GameObject, maskedObject: GameObject, camera: Camera): Unit
  /**
    * The masked game objects framebuffer is unbound and its texture 
    * is bound together with the mask texture and the mask shader and 
    * a draw call with a single quad is processed. Here is where the
    * masking effect is applied.
    * @param mask GameObject used as a mask.
    */
  def endMask(mask: GameObject): Unit
}

object BitmapMaskPipeline {
  @scala.inline
  def apply(
    active: Boolean,
    addAttribute: (String, integer, integer, Boolean, integer) => BitmapMaskPipeline,
    attributes: js.Object,
    beginMask: (GameObject, GameObject, Camera) => Unit,
    bind: () => BitmapMaskPipeline,
    boot: () => Unit,
    bytes: Uint8Array,
    destroy: () => BitmapMaskPipeline,
    endMask: GameObject => Unit,
    flush: () => BitmapMaskPipeline,
    flushLocked: Boolean,
    game: Game,
    gl: WebGLRenderingContext,
    height: Double,
    maxQuads: Double,
    name: String,
    onBind: () => BitmapMaskPipeline,
    onPostRender: () => BitmapMaskPipeline,
    onPreRender: () => BitmapMaskPipeline,
    onRender: (Scene, Camera) => BitmapMaskPipeline,
    program: WebGLProgram,
    renderer: WebGLRenderer,
    resize: (Double, Double, Double) => BitmapMaskPipeline,
    resolution: Double,
    resolutionDirty: Boolean,
    setFloat1: (String, Double) => BitmapMaskPipeline,
    setFloat1v: (String, Float32Array) => BitmapMaskPipeline,
    setFloat2: (String, Double, Double) => BitmapMaskPipeline,
    setFloat2v: (String, Float32Array) => BitmapMaskPipeline,
    setFloat3: (String, Double, Double, Double) => BitmapMaskPipeline,
    setFloat3v: (String, Float32Array) => BitmapMaskPipeline,
    setFloat4: (String, Double, Double, Double, Double) => BitmapMaskPipeline,
    setFloat4v: (String, Float32Array) => BitmapMaskPipeline,
    setInt1: (String, integer) => BitmapMaskPipeline,
    setInt2: (String, integer, integer) => BitmapMaskPipeline,
    setInt3: (String, integer, integer, integer) => BitmapMaskPipeline,
    setInt4: (String, integer, integer, integer, integer) => BitmapMaskPipeline,
    setMatrix2: (String, Boolean, Float32Array) => BitmapMaskPipeline,
    setMatrix3: (String, Boolean, Float32Array) => BitmapMaskPipeline,
    setMatrix4: (String, Boolean, Float32Array) => BitmapMaskPipeline,
    shouldFlush: () => Boolean,
    topology: integer,
    vertexBuffer: WebGLBuffer,
    vertexCapacity: integer,
    vertexComponentCount: integer,
    vertexCount: Double,
    vertexData: ArrayBuffer,
    vertexSize: integer,
    vertexViewF32: Float32Array,
    view: HTMLCanvasElement,
    width: Double
  ): BitmapMaskPipeline = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAttribute = js.Any.fromFunction5(addAttribute), attributes = attributes.asInstanceOf[js.Any], beginMask = js.Any.fromFunction3(beginMask), bind = js.Any.fromFunction0(bind), boot = js.Any.fromFunction0(boot), bytes = bytes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), endMask = js.Any.fromFunction1(endMask), flush = js.Any.fromFunction0(flush), flushLocked = flushLocked.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxQuads = maxQuads.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onBind = js.Any.fromFunction0(onBind), onPostRender = js.Any.fromFunction0(onPostRender), onPreRender = js.Any.fromFunction0(onPreRender), onRender = js.Any.fromFunction2(onRender), program = program.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], resize = js.Any.fromFunction3(resize), resolution = resolution.asInstanceOf[js.Any], resolutionDirty = resolutionDirty.asInstanceOf[js.Any], setFloat1 = js.Any.fromFunction2(setFloat1), setFloat1v = js.Any.fromFunction2(setFloat1v), setFloat2 = js.Any.fromFunction3(setFloat2), setFloat2v = js.Any.fromFunction2(setFloat2v), setFloat3 = js.Any.fromFunction4(setFloat3), setFloat3v = js.Any.fromFunction2(setFloat3v), setFloat4 = js.Any.fromFunction5(setFloat4), setFloat4v = js.Any.fromFunction2(setFloat4v), setInt1 = js.Any.fromFunction2(setInt1), setInt2 = js.Any.fromFunction3(setInt2), setInt3 = js.Any.fromFunction4(setInt3), setInt4 = js.Any.fromFunction5(setInt4), setMatrix2 = js.Any.fromFunction3(setMatrix2), setMatrix3 = js.Any.fromFunction3(setMatrix3), setMatrix4 = js.Any.fromFunction3(setMatrix4), shouldFlush = js.Any.fromFunction0(shouldFlush), topology = topology.asInstanceOf[js.Any], vertexBuffer = vertexBuffer.asInstanceOf[js.Any], vertexCapacity = vertexCapacity.asInstanceOf[js.Any], vertexComponentCount = vertexComponentCount.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], vertexSize = vertexSize.asInstanceOf[js.Any], vertexViewF32 = vertexViewF32.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapMaskPipeline]
  }
}

