package typings.offscreencanvas

import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
}

