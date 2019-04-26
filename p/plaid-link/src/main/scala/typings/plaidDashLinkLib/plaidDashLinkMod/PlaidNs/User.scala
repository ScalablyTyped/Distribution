package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var emailAddress: java.lang.String
  var legalName: java.lang.String
}

object User {
  @scala.inline
  def apply(emailAddress: java.lang.String, legalName: java.lang.String): User = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress, legalName = legalName)
  
    __obj.asInstanceOf[User]
  }
}

