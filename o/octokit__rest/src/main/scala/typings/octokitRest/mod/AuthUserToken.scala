package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthUserToken extends js.Object {
  var token: String
  var `type`: token
}

object AuthUserToken {
  @scala.inline
  def apply(token: String, `type`: token): AuthUserToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthUserToken]
  }
}

