package typings.octokitAuthToken.typesMod

import typings.octokitAuthToken.octokitAuthTokenStrings.oauth
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthTokenAuthentication extends Authentication {
  var token: Token
  var tokenType: oauth
  var `type`: token
}

object OAuthTokenAuthentication {
  @scala.inline
  def apply(token: Token, tokenType: oauth, `type`: token): OAuthTokenAuthentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthTokenAuthentication]
  }
}

