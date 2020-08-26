package typings.phaser.Phaser.Renderer.WebGL.Pipelines

import typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline
import typings.phaser.integer
import typings.std.Float32Array
import typings.std.Uint32Array
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextureTintStripPipeline implements the rendering infrastructure
  * for displaying textured objects
  * The config properties are:
  * - game: Current game instance.
  * - renderer: Current WebGL renderer.
  * - vertShader: Source for vertex shader as a string.
  * - fragShader: Source for fragment shader as a string.
  * - vertexCapacity: The amount of vertices that shall be allocated
  * - vertexSize: The size of a single vertex in bytes.
  */
@js.native
trait TextureTintStripPipeline extends WebGLPipeline {
  /**
    * Collection of batch information
    */
  var batches: js.Array[_] = js.native
  /**
    * Size of the batch.
    */
  var maxQuads: integer = js.native
  /**
    * Float32 view of the array buffer containing the pipeline's vertices.
    */
  var vertexViewF32: Float32Array = js.native
  /**
    * Uint32 view of the array buffer containing the pipeline's vertices.
    */
  var vertexViewU32: Uint32Array = js.native
  /**
    * Creates a new batch object and pushes it to a batch array.
    * The batch object contains information relevant to the current 
    * vertex batch like the offset in the vertex buffer, vertex count and 
    * the textures used by that batch.
    * @param texture Optional WebGLTexture that will be assigned to the created batch.
    * @param unit Texture unit to which the texture needs to be bound.
    */
  def pushBatch(texture: WebGLTexture, unit: integer): Unit = js.native
  /**
    * Checks if the current batch has the same texture and texture unit, or if we need to create a new batch.
    * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
    * @param unit Texture unit to which the texture needs to be bound.
    */
  def requireTextureBatch(texture: WebGLTexture, unit: integer): Boolean = js.native
  /**
    * Assigns a texture to the current batch. If a different texture is already set it creates a new batch object.
    * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
    * @param unit Texture unit to which the texture needs to be bound. Default 0.
    */
  def setTexture2D(): TextureTintStripPipeline = js.native
  def setTexture2D(texture: js.UndefOr[scala.Nothing], unit: integer): TextureTintStripPipeline = js.native
  def setTexture2D(texture: WebGLTexture): TextureTintStripPipeline = js.native
  def setTexture2D(texture: WebGLTexture, unit: integer): TextureTintStripPipeline = js.native
}

