package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsListGrantsResponseItem extends js.Object {
  var app: OauthAuthorizationsListGrantsResponseItemApp
  var created_at: java.lang.String
  var id: scala.Double
  var scopes: js.Array[java.lang.String]
  var updated_at: java.lang.String
  var url: java.lang.String
}

object OauthAuthorizationsListGrantsResponseItem {
  @scala.inline
  def apply(
    app: OauthAuthorizationsListGrantsResponseItemApp,
    created_at: java.lang.String,
    id: scala.Double,
    scopes: js.Array[java.lang.String],
    updated_at: java.lang.String,
    url: java.lang.String
  ): OauthAuthorizationsListGrantsResponseItem = {
    val __obj = js.Dynamic.literal(app = app, created_at = created_at, id = id, scopes = scopes, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[OauthAuthorizationsListGrantsResponseItem]
  }
}

