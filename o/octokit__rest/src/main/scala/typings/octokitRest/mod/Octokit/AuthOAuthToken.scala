package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.oauth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOAuthToken extends js.Object {
  var token: String
  var `type`: oauth
}

object AuthOAuthToken {
  @scala.inline
  def apply(token: String, `type`: oauth): AuthOAuthToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOAuthToken]
  }
}

