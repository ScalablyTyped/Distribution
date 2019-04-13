package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListProjectsResponseItem extends js.Object {
  var body: java.lang.String
  var columns_url: java.lang.String
  var created_at: java.lang.String
  var creator: TeamsListProjectsResponseItemCreator
  var html_url: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var number: scala.Double
  var organization_permission: java.lang.String
  var owner_url: java.lang.String
  var permissions: TeamsListProjectsResponseItemPermissions
  var `private`: scala.Boolean
  var state: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object TeamsListProjectsResponseItem {
  @scala.inline
  def apply(
    body: java.lang.String,
    columns_url: java.lang.String,
    created_at: java.lang.String,
    creator: TeamsListProjectsResponseItemCreator,
    html_url: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    number: scala.Double,
    organization_permission: java.lang.String,
    owner_url: java.lang.String,
    permissions: TeamsListProjectsResponseItemPermissions,
    `private`: scala.Boolean,
    state: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): TeamsListProjectsResponseItem = {
    val __obj = js.Dynamic.literal(body = body, columns_url = columns_url, created_at = created_at, creator = creator, html_url = html_url, id = id, name = name, node_id = node_id, number = number, organization_permission = organization_permission, owner_url = owner_url, permissions = permissions, state = state, updated_at = updated_at, url = url)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TeamsListProjectsResponseItem]
  }
}

