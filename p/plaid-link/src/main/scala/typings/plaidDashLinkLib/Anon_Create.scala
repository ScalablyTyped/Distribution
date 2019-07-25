package typings
package plaidDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var version: java.lang.String
  def create(params: plaidDashLinkLib.plaidDashLinkMod.PlaidNs.CreateConfig): plaidDashLinkLib.plaidDashLinkMod.PlaidNs.LinkHandler
}

object Anon_Create {
  @scala.inline
  def apply(
    create: plaidDashLinkLib.plaidDashLinkMod.PlaidNs.CreateConfig => plaidDashLinkLib.plaidDashLinkMod.PlaidNs.LinkHandler,
    version: java.lang.String
  ): Anon_Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), version = version)
  
    __obj.asInstanceOf[Anon_Create]
  }
}

