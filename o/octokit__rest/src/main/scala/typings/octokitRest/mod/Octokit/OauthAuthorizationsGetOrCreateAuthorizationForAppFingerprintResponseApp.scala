package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponseApp extends js.Object {
  var client_id: String
  var name: String
  var url: String
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponseApp {
  @scala.inline
  def apply(client_id: String, name: String, url: String): OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponseApp = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponseApp]
  }
}

