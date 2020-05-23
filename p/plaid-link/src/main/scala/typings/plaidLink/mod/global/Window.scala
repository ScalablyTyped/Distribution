package typings.plaidLink.mod.global

import typings.plaidLink.anon.Create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Plaid: Create
}

object Window {
  @scala.inline
  def apply(Plaid: Create): Window = {
    val __obj = js.Dynamic.literal(Plaid = Plaid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

