package typings.meteor.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLS extends js.Object {
  def enrollAccount(token: String): String
  def resetPassword(token: String): String
  def verifyEmail(token: String): String
}

object URLS {
  @scala.inline
  def apply(enrollAccount: String => String, resetPassword: String => String, verifyEmail: String => String): URLS = {
    val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
  
    __obj.asInstanceOf[URLS]
  }
}

