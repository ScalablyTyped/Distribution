package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkHandler extends js.Object {
  var institutions: js.Array[Institution] = js.native
  def exit(): Unit = js.native
  def exit(options: ExitOptions): Unit = js.native
  def open(): Unit = js.native
}

