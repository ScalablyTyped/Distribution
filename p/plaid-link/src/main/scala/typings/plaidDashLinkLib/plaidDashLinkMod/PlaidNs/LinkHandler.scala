package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkHandler extends js.Object {
  var institutions: js.Array[Institution]
  def open(): scala.Unit
}

object LinkHandler {
  @scala.inline
  def apply(institutions: js.Array[Institution], open: () => scala.Unit): LinkHandler = {
    val __obj = js.Dynamic.literal(institutions = institutions, open = js.Any.fromFunction0(open))
  
    __obj.asInstanceOf[LinkHandler]
  }
}

