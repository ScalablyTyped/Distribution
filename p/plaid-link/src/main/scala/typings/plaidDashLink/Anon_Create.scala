package typings.plaidDashLink

import typings.plaidDashLink.plaidDashLinkMod.PlaidNs.CreateConfig
import typings.plaidDashLink.plaidDashLinkMod.PlaidNs.LinkHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var version: String
  def create(params: CreateConfig): LinkHandler
}

object Anon_Create {
  @scala.inline
  def apply(create: CreateConfig => LinkHandler, version: String): Anon_Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), version = version)
  
    __obj.asInstanceOf[Anon_Create]
  }
}

