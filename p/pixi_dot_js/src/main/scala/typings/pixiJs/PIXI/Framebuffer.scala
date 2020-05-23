package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Frame buffer used by the BaseRenderTexture
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Framebuffer extends js.Object {
  /**
    * Reference to the colorTexture.
    *
    * @member {PIXI.Texture[]}
    * @readonly
    */
  val colorTexture: js.Array[Texture] = js.native
  /**
    * Add texture to the colorTexture array
    *
    * @param {number} [index=0] - Index of the array to add the texture to
    * @param {PIXI.Texture} [texture] - Texture to add to the array
    */
  def addColorTexture(): Unit = js.native
  def addColorTexture(index: Double): Unit = js.native
  def addColorTexture(index: Double, texture: Texture): Unit = js.native
  /**
    * Add a depth texture to the frame buffer
    *
    * @param {PIXI.Texture} [texture] - Texture to add
    */
  def addDepthTexture(): Unit = js.native
  def addDepthTexture(texture: Texture): Unit = js.native
  /**
    * disposes WebGL resources that are connected to this geometry
    */
  def dispose(): Unit = js.native
  /**
    * Enable depth on the frame buffer
    */
  def enableDepth(): Unit = js.native
  /**
    * Enable stencil on the frame buffer
    */
  def enableStencil(): Unit = js.native
  /**
    * Resize the frame buffer
    *
    * @param {number} width - Width of the frame buffer to resize to
    * @param {number} height - Height of the frame buffer to resize to
    */
  def resize(width: Double, height: Double): Unit = js.native
}

