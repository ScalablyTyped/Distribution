package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefResponseCheckSuitesItemApp extends js.Object {
  var created_at: String
  var description: String
  var events: js.Array[String]
  var external_url: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var owner: ChecksListSuitesForRefResponseCheckSuitesItemAppOwner
  var permissions: ChecksListSuitesForRefResponseCheckSuitesItemAppPermissions
  var slug: String
  var updated_at: String
}

object ChecksListSuitesForRefResponseCheckSuitesItemApp {
  @scala.inline
  def apply(
    created_at: String,
    description: String,
    events: js.Array[String],
    external_url: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    owner: ChecksListSuitesForRefResponseCheckSuitesItemAppOwner,
    permissions: ChecksListSuitesForRefResponseCheckSuitesItemAppPermissions,
    slug: String,
    updated_at: String
  ): ChecksListSuitesForRefResponseCheckSuitesItemApp = {
    val __obj = js.Dynamic.literal(created_at = created_at, description = description, events = events, external_url = external_url, html_url = html_url, id = id, name = name, node_id = node_id, owner = owner, permissions = permissions, slug = slug, updated_at = updated_at)
  
    __obj.asInstanceOf[ChecksListSuitesForRefResponseCheckSuitesItemApp]
  }
}

