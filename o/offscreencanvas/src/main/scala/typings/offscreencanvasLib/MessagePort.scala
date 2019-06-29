package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePort
  extends stdLib.EventTarget {
  def postMessage(message: js.Any): scala.Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[stdLib.Transferable | OffscreenCanvas]): scala.Unit = js.native
}

