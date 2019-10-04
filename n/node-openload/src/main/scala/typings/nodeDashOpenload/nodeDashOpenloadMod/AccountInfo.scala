package typings.nodeDashOpenload.nodeDashOpenloadMod

import typings.nodeDashOpenload.Anon_Left
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
  var traffic: Anon_Left
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
    traffic: Anon_Left
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(balance = balance, email = email, extid = extid, signup_at = signup_at, storage_left = storage_left, storage_used = storage_used, traffic = traffic)
  
    __obj.asInstanceOf[AccountInfo]
  }
}

