package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsCreateAuthorizationResponseApp extends js.Object {
  var client_id: java.lang.String
  var name: java.lang.String
  var url: java.lang.String
}

object OauthAuthorizationsCreateAuthorizationResponseApp {
  @scala.inline
  def apply(client_id: java.lang.String, name: java.lang.String, url: java.lang.String): OauthAuthorizationsCreateAuthorizationResponseApp = {
    val __obj = js.Dynamic.literal(client_id = client_id, name = name, url = url)
  
    __obj.asInstanceOf[OauthAuthorizationsCreateAuthorizationResponseApp]
  }
}

