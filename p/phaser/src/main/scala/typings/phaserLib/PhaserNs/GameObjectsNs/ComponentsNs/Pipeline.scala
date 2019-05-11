package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

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
  var defaultPipeline: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLPipeline = js.native
  /**
    * The current WebGL pipeline of this Game Object.
    */
  var pipeline: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLPipeline = js.native
  /**
    * Gets the name of the WebGL Pipeline this Game Object is currently using.
    */
  def getPipelineName(): java.lang.String = js.native
  /**
    * Sets the initial WebGL Pipeline of this Game Object.
    * This should only be called during the instantiation of the Game Object.
    * @param pipelineName The name of the pipeline to set on this Game Object. Defaults to the Texture Tint Pipeline. Default TextureTintPipeline.
    */
  def initPipeline(): scala.Boolean = js.native
  def initPipeline(pipelineName: java.lang.String): scala.Boolean = js.native
  /**
    * Resets the WebGL Pipeline of this Game Object back to the default it was created with.
    */
  def resetPipeline(): scala.Boolean = js.native
  /**
    * Sets the active WebGL Pipeline of this Game Object.
    * @param pipelineName The name of the pipeline to set on this Game Object.
    */
  def setPipeline(pipelineName: java.lang.String): this.type = js.native
}

