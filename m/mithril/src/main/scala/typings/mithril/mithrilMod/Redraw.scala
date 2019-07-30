package typings.mithril.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redraw extends js.Object {
  /** Manually triggers an asynchronous redraw of mounted components. */
  def apply(): Unit = js.native
  /** Manually triggers a synchronous redraw of mounted components. */
  def sync(): Unit = js.native
}

