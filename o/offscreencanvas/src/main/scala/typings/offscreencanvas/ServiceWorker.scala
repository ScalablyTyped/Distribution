package typings.offscreencanvas

import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorker extends js.Object {
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
}

