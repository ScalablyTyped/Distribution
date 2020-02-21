package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.basic
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
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthBasic]
  }
}

