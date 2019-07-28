package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsListGrantsResponseItem extends js.Object {
  var app: OauthAuthorizationsListGrantsResponseItemApp
  var created_at: String
  var id: Double
  var scopes: js.Array[String]
  var updated_at: String
  var url: String
}

object OauthAuthorizationsListGrantsResponseItem {
  @scala.inline
  def apply(
    app: OauthAuthorizationsListGrantsResponseItemApp,
    created_at: String,
    id: Double,
    scopes: js.Array[String],
    updated_at: String,
    url: String
  ): OauthAuthorizationsListGrantsResponseItem = {
    val __obj = js.Dynamic.literal(app = app, created_at = created_at, id = id, scopes = scopes, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[OauthAuthorizationsListGrantsResponseItem]
  }
}

