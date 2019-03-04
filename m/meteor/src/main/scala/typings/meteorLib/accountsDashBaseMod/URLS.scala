package typings
package meteorLib.accountsDashBaseMod

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
    enrollAccount: js.Function1[java.lang.String, java.lang.String],
    resetPassword: js.Function1[java.lang.String, java.lang.String],
    verifyEmail: js.Function1[java.lang.String, java.lang.String]
  ): URLS = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount, resetPassword = resetPassword, verifyEmail = verifyEmail)
  
    __obj.asInstanceOf[URLS]
  }
}

