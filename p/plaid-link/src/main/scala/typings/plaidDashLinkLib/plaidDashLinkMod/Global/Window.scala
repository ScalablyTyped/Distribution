package typings
package plaidDashLinkLib.plaidDashLinkMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Plaid: plaidDashLinkLib.Anon_Create
  var linkHandler: plaidDashLinkLib.plaidDashLinkMod.PlaidNs.LinkHandler
}

object Window {
  @scala.inline
  def apply(
    Plaid: plaidDashLinkLib.Anon_Create,
    linkHandler: plaidDashLinkLib.plaidDashLinkMod.PlaidNs.LinkHandler
  ): Window = {
    val __obj = js.Dynamic.literal(Plaid = Plaid, linkHandler = linkHandler)
  
    __obj.asInstanceOf[Window]
  }
}

