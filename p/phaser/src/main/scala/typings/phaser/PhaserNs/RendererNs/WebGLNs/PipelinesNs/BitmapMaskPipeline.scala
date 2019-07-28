package typings.phaser.PhaserNs.RendererNs.WebGLNs.PipelinesNs

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.RendererNs.WebGLNs.WebGLPipeline
import typings.std.Float32Array
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
@JSGlobal("Phaser.Renderer.WebGL.Pipelines.BitmapMaskPipeline")
@js.native
class BitmapMaskPipeline protected () extends WebGLPipeline {
  /**
    * 
    * @param config Used for overriding shader an pipeline properties if extending this pipeline.
    */
  def this(config: js.Object) = this()
  /**
    * Size of the batch.
    */
  var maxQuads: Double = js.native
  /**
    * Dirty flag to check if resolution properties need to be updated on the 
    * masking shader.
    */
  var resolutionDirty: Boolean = js.native
  /**
    * Float32 view of the array buffer containing the pipeline's vertices.
    */
  var vertexViewF32: Float32Array = js.native
  /**
    * Binds necessary resources and renders the mask to a separated framebuffer.
    * The framebuffer for the masked object is also bound for further use.
    * @param mask GameObject used as mask.
    * @param maskedObject GameObject masked by the mask GameObject.
    * @param camera [description]
    */
  def beginMask(mask: GameObject, maskedObject: GameObject, camera: Camera): Unit = js.native
  /**
    * The masked game objects framebuffer is unbound and its texture 
    * is bound together with the mask texture and the mask shader and 
    * a draw call with a single quad is processed. Here is where the
    * masking effect is applied.
    * @param mask GameObject used as a mask.
    */
  def endMask(mask: GameObject): Unit = js.native
}

