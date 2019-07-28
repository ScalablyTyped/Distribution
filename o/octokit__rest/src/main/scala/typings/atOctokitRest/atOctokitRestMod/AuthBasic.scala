package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBasic extends js.Object {
  var password: String
  var `type`: basic
  var username: String
}

object AuthBasic {
  @scala.inline
  def apply(password: String, `type`: basic, username: String): AuthBasic = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthBasic]
  }
}

