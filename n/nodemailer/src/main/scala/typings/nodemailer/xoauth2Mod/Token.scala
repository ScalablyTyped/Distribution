package typings.nodemailer.xoauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var accessToken: String
  var expires: Double
  var user: String
}

object Token {
  @scala.inline
  def apply(accessToken: String, expires: Double, user: String): Token = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Token]
  }
}

