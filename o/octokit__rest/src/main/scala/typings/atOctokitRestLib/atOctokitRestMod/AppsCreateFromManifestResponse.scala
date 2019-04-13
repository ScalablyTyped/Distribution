package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateFromManifestResponse extends js.Object {
  var created_at: java.lang.String
  var description: scala.Null
  var external_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var owner: AppsCreateFromManifestResponseOwner
  var pem: java.lang.String
  var updated_at: java.lang.String
  var webhook_secret: java.lang.String
}

object AppsCreateFromManifestResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    description: scala.Null,
    external_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    owner: AppsCreateFromManifestResponseOwner,
    pem: java.lang.String,
    updated_at: java.lang.String,
    webhook_secret: java.lang.String
  ): AppsCreateFromManifestResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, description = description, external_url = external_url, html_url = html_url, id = id, name = name, node_id = node_id, owner = owner, pem = pem, updated_at = updated_at, webhook_secret = webhook_secret)
  
    __obj.asInstanceOf[AppsCreateFromManifestResponse]
  }
}

