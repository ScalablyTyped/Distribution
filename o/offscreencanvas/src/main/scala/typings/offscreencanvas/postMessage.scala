package typings.offscreencanvas

import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("postMessage")
@js.native
object postMessage extends js.Object {
  def apply(message: js.Any, targetOrigin: String): Unit = js.native
  def apply(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
}

