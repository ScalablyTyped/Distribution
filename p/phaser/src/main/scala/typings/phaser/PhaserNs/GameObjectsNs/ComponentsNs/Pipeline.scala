package typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs

import typings.phaser.PhaserNs.RendererNs.WebGLNs.WebGLPipeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the WebGL rendering pipeline of a Game Object.
  */
@js.native
trait Pipeline extends js.Object {
  /**
    * The initial WebGL pipeline of this Game Object.
    */
  var defaultPipeline: WebGLPipeline = js.native
  /**
    * The current WebGL pipeline of this Game Object.
    */
  var pipeline: WebGLPipeline = js.native
  /**
    * Gets the name of the WebGL Pipeline this Game Object is currently using.
    */
  def getPipelineName(): String = js.native
  /**
    * Sets the initial WebGL Pipeline of this Game Object.
    * This should only be called during the instantiation of the Game Object.
    * @param pipelineName The name of the pipeline to set on this Game Object. Defaults to the Texture Tint Pipeline. Default TextureTintPipeline.
    */
  def initPipeline(): Boolean = js.native
  def initPipeline(pipelineName: String): Boolean = js.native
  /**
    * Resets the WebGL Pipeline of this Game Object back to the default it was created with.
    */
  def resetPipeline(): Boolean = js.native
  /**
    * Sets the active WebGL Pipeline of this Game Object.
    * @param pipelineName The name of the pipeline to set on this Game Object.
    */
  def setPipeline(pipelineName: String): this.type = js.native
}

