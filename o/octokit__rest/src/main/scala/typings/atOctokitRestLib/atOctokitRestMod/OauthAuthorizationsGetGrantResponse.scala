package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetGrantResponse extends js.Object {
  var app: OauthAuthorizationsGetGrantResponseApp
  var created_at: java.lang.String
  var id: scala.Double
  var scopes: js.Array[java.lang.String]
  var updated_at: java.lang.String
  var url: java.lang.String
}

object OauthAuthorizationsGetGrantResponse {
  @scala.inline
  def apply(
    app: OauthAuthorizationsGetGrantResponseApp,
    created_at: java.lang.String,
    id: scala.Double,
    scopes: js.Array[java.lang.String],
    updated_at: java.lang.String,
    url: java.lang.String
  ): OauthAuthorizationsGetGrantResponse = {
    val __obj = js.Dynamic.literal(app = app, created_at = created_at, id = id, scopes = scopes, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[OauthAuthorizationsGetGrantResponse]
  }
}

