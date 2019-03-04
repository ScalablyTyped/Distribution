package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  /**
    * The email address that is associated with the account.
    */
  var account: java.lang.String
  /**
    * The user's business email address, or null if one is not
    * specified.
    */
  var business: java.lang.String
  /**
    * The user's "alternate" email address, or null if one is not
    * specified.
    */
  var other: java.lang.String
  /**
    * The user's personal email address, or null if one is not
    * specified.
    */
  var personal: java.lang.String
  /**
    * The user's preferred email address, or null if one is not
    * specified.
    */
  var preferred: java.lang.String
}

object Anon_Account {
  @scala.inline
  def apply(
    account: java.lang.String,
    business: java.lang.String,
    other: java.lang.String,
    personal: java.lang.String,
    preferred: java.lang.String
  ): Anon_Account = {
    val __obj = js.Dynamic.literal(account = account, business = business, other = other, personal = personal, preferred = preferred)
  
    __obj.asInstanceOf[Anon_Account]
  }
}

