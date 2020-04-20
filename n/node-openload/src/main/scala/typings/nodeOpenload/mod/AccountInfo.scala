package typings.nodeOpenload.mod

import typings.nodeOpenload.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The account info response
  */
trait AccountInfo extends js.Object {
  var balance: Double
  var email: String
  var extid: String
  var signup_at: String
  var storage_left: Double
  var storage_used: String
  var traffic: AnonLeft
}

object AccountInfo {
  @scala.inline
  def apply(
    balance: Double,
    email: String,
    extid: String,
    signup_at: String,
    storage_left: Double,
    storage_used: String,
    traffic: AnonLeft
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], signup_at = signup_at.asInstanceOf[js.Any], storage_left = storage_left.asInstanceOf[js.Any], storage_used = storage_used.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
}

