package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkHandler extends js.Object {
  var institutions: js.Array[Institution]
  def exit(options: ExitOptions): scala.Unit
  def open(): scala.Unit
}

object LinkHandler {
  @scala.inline
  def apply(exit: ExitOptions => scala.Unit, institutions: js.Array[Institution], open: () => scala.Unit): LinkHandler = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction1(exit), institutions = institutions, open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[LinkHandler]
  }
}

