package typings.obeliskJs.mod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "CanvasManager")
@js.native
class CanvasManager () extends js.Object

/* static members */
@JSImport("obelisk.js", "CanvasManager")
@js.native
object CanvasManager extends js.Object {
  var defaultCanvas: HTMLCanvasElement = js.native
  def getDefaultCanvas(): HTMLCanvasElement = js.native
  def getNewCanvas(): HTMLCanvasElement = js.native
}

