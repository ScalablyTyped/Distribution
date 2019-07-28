package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListProjectsResponseItem extends js.Object {
  var body: String
  var columns_url: String
  var created_at: String
  var creator: TeamsListProjectsResponseItemCreator
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var number: Double
  var organization_permission: String
  var owner_url: String
  var permissions: TeamsListProjectsResponseItemPermissions
  var `private`: Boolean
  var state: String
  var updated_at: String
  var url: String
}

object TeamsListProjectsResponseItem {
  @scala.inline
  def apply(
    body: String,
    columns_url: String,
    created_at: String,
    creator: TeamsListProjectsResponseItemCreator,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    organization_permission: String,
    owner_url: String,
    permissions: TeamsListProjectsResponseItemPermissions,
    `private`: Boolean,
    state: String,
    updated_at: String,
    url: String
  ): TeamsListProjectsResponseItem = {
    val __obj = js.Dynamic.literal(body = body, columns_url = columns_url, created_at = created_at, creator = creator, html_url = html_url, id = id, name = name, node_id = node_id, number = number, organization_permission = organization_permission, owner_url = owner_url, permissions = permissions, state = state, updated_at = updated_at, url = url)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TeamsListProjectsResponseItem]
  }
}

