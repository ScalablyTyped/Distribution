package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.MaskManager")
@js.native
class MaskManager () extends WebGLManager {
  var alphaMaskIndex: scala.Double = js.native
  var alphaMaskPool: js.Array[scala.Double] = js.native
  var enableScissor: scala.Boolean = js.native
  var scissor: scala.Boolean = js.native
  var scissorData: js.Any = js.native
  var scissorRenderTarget: RenderTarget = js.native
  def popMask(target: RenderTarget, maskData: Graphics): scala.Unit = js.native
  def popMask(target: RenderTarget, maskData: Sprite): scala.Unit = js.native
  def popScissorMask(): scala.Unit = js.native
  def popSpriteMask(): scala.Unit = js.native
  def popStencilMask(): scala.Unit = js.native
  def pushMask(target: RenderTarget, maskData: Graphics): scala.Unit = js.native
  def pushMask(target: RenderTarget, maskData: Sprite): scala.Unit = js.native
  def pushScissorMask(target: RenderTarget, maskData: Graphics): scala.Unit = js.native
  def pushScissorMask(target: RenderTarget, maskData: Sprite): scala.Unit = js.native
  def pushSpriteMask(target: RenderTarget, maskData: Graphics): scala.Unit = js.native
  def pushSpriteMask(target: RenderTarget, maskData: Sprite): scala.Unit = js.native
  def pushStencilMask(maskData: Graphics): scala.Unit = js.native
  def pushStencilMask(maskData: Sprite): scala.Unit = js.native
}

