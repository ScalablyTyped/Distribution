package typings
package nodemailerLib.libXoauth2Mod

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
    val __obj = js.Dynamic.literal(accessToken = accessToken, expires = expires, user = user)
  
    __obj.asInstanceOf[Token]
  }
}

