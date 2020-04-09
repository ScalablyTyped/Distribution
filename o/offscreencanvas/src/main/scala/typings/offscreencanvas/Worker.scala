package typings.offscreencanvas

import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// OffscreenCanvas should be a part of Transferable => extend all postMessage methods
@js.native
trait Worker extends js.Object {
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
}

