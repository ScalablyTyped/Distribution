package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.MaskManager")
@js.native
class MaskManager () extends WebGLManager {
  var alphaMaskIndex: Double = js.native
  var alphaMaskPool: js.Array[Double] = js.native
  var enableScissor: Boolean = js.native
  var scissor: Boolean = js.native
  var scissorData: js.Any = js.native
  var scissorRenderTarget: RenderTarget = js.native
  def popMask(target: RenderTarget, maskData: Graphics): Unit = js.native
  def popMask(target: RenderTarget, maskData: Sprite): Unit = js.native
  def popScissorMask(): Unit = js.native
  def popSpriteMask(): Unit = js.native
  def popStencilMask(): Unit = js.native
  def pushMask(target: RenderTarget, maskData: Graphics): Unit = js.native
  def pushMask(target: RenderTarget, maskData: Sprite): Unit = js.native
  def pushScissorMask(target: RenderTarget, maskData: Graphics): Unit = js.native
  def pushScissorMask(target: RenderTarget, maskData: Sprite): Unit = js.native
  def pushSpriteMask(target: RenderTarget, maskData: Graphics): Unit = js.native
  def pushSpriteMask(target: RenderTarget, maskData: Sprite): Unit = js.native
  def pushStencilMask(maskData: Graphics): Unit = js.native
  def pushStencilMask(maskData: Sprite): Unit = js.native
}

