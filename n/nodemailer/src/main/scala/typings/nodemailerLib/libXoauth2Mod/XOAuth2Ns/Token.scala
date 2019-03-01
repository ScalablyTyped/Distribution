package typings
package nodemailerLib.libXoauth2Mod.XOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var accessToken: java.lang.String
  var expires: scala.Double
  var user: java.lang.String
}

object Token {
  @scala.inline
  def apply(accessToken: java.lang.String, expires: scala.Double, user: java.lang.String): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Token]
  }
}

