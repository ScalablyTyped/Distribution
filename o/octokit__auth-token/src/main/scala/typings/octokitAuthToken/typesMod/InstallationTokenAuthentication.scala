package typings.octokitAuthToken.typesMod

import typings.octokitAuthToken.octokitAuthTokenStrings.installation
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallationTokenAuthentication extends Authentication {
  var token: Token
  var tokenType: installation
  var `type`: token
}

object InstallationTokenAuthentication {
  @scala.inline
  def apply(token: Token, tokenType: installation, `type`: token): InstallationTokenAuthentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationTokenAuthentication]
  }
}

