package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasMaskManager")
@js.native
class CanvasMaskManager protected () extends js.Object {
  def this(renderer: CanvasRenderer) = this()
  def destroy(): scala.Unit = js.native
  def popMask(renderer: CanvasRenderer): scala.Unit = js.native
  def popMask(renderer: WebGLRenderer): scala.Unit = js.native
  def pushMask(maskData: js.Any): scala.Unit = js.native
  /* protected */ def renderGraphicsShape(graphics: Graphics): scala.Unit = js.native
}

