package typings
package meteorDashTypingsLib.meteorAccountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLS extends js.Object {
  def enrollAccount(token: java.lang.String): java.lang.String
  def resetPassword(token: java.lang.String): java.lang.String
  def verifyEmail(token: java.lang.String): java.lang.String
}

object URLS {
  @scala.inline
  def apply(
    enrollAccount: java.lang.String => java.lang.String,
    resetPassword: java.lang.String => java.lang.String,
    verifyEmail: java.lang.String => java.lang.String
  ): URLS = {
    val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
  
    __obj.asInstanceOf[URLS]
  }
}

