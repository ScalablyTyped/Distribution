package typings.microsoftDashLiveDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  /**
    * The email address that is associated with the account.
    */
  var account: String
  /**
    * The user's business email address, or null if one is not
    * specified.
    */
  var business: String
  /**
    * The user's "alternate" email address, or null if one is not
    * specified.
    */
  var other: String
  /**
    * The user's personal email address, or null if one is not
    * specified.
    */
  var personal: String
  /**
    * The user's preferred email address, or null if one is not
    * specified.
    */
  var preferred: String
}

object Anon_Account {
  @scala.inline
  def apply(account: String, business: String, other: String, personal: String, preferred: String): Anon_Account = {
    val __obj = js.Dynamic.literal(account = account, business = business, other = other, personal = personal, preferred = preferred)
  
    __obj.asInstanceOf[Anon_Account]
  }
}

