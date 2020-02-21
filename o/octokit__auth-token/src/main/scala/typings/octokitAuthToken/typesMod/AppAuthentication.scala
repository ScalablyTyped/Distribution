package typings.octokitAuthToken.typesMod

import typings.octokitAuthToken.octokitAuthTokenStrings.app
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppAuthentication extends Authentication {
  var token: Token
  var tokenType: app
  var `type`: token
}

object AppAuthentication {
  @scala.inline
  def apply(token: Token, tokenType: app, `type`: token): AppAuthentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAuthentication]
  }
}

