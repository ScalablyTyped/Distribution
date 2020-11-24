package typings.octokitAuthToken.typesMod

import typings.octokitAuthToken.octokitAuthTokenStrings.app
import typings.octokitAuthToken.octokitAuthTokenStrings.installation
import typings.octokitAuthToken.octokitAuthTokenStrings.oauth
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.octokitAuthToken.typesMod.OAuthTokenAuthentication
  - typings.octokitAuthToken.typesMod.InstallationTokenAuthentication
  - typings.octokitAuthToken.typesMod.AppAuthentication
*/
trait Authentication extends js.Object
object Authentication {
  
  @scala.inline
  def OAuthTokenAuthentication(token: Token, tokenType: oauth, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  def InstallationTokenAuthentication(token: Token, tokenType: installation, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  def AppAuthentication(token: Token, tokenType: app, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
}
