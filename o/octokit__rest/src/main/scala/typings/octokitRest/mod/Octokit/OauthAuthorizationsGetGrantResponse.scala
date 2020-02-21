package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetGrantResponse extends js.Object {
  var app: OauthAuthorizationsGetGrantResponseApp
  var created_at: String
  var id: Double
  var scopes: js.Array[String]
  var updated_at: String
  var url: String
}

object OauthAuthorizationsGetGrantResponse {
  @scala.inline
  def apply(
    app: OauthAuthorizationsGetGrantResponseApp,
    created_at: String,
    id: Double,
    scopes: js.Array[String],
    updated_at: String,
    url: String
  ): OauthAuthorizationsGetGrantResponse = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OauthAuthorizationsGetGrantResponse]
  }
}

