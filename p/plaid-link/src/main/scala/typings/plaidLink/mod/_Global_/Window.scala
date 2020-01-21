package typings.plaidLink.mod._Global_

import typings.plaidLink.AnonCreate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Plaid: AnonCreate
}

object Window {
  @scala.inline
  def apply(Plaid: AnonCreate): Window = {
    val __obj = js.Dynamic.literal(Plaid = Plaid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

