package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListForRepoResponseItem extends js.Object {
  var body: java.lang.String
  var columns_url: java.lang.String
  var created_at: java.lang.String
  var creator: ProjectsListForRepoResponseItemCreator
  var html_url: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var number: scala.Double
  var owner_url: java.lang.String
  var state: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ProjectsListForRepoResponseItem {
  @scala.inline
  def apply(
    body: java.lang.String,
    columns_url: java.lang.String,
    created_at: java.lang.String,
    creator: ProjectsListForRepoResponseItemCreator,
    html_url: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    number: scala.Double,
    owner_url: java.lang.String,
    state: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ProjectsListForRepoResponseItem = {
    val __obj = js.Dynamic.literal(body = body, columns_url = columns_url, created_at = created_at, creator = creator, html_url = html_url, id = id, name = name, node_id = node_id, number = number, owner_url = owner_url, state = state, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ProjectsListForRepoResponseItem]
  }
}

