package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListColumnsResponseItem extends js.Object {
  var cards_url: java.lang.String
  var created_at: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var project_url: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ProjectsListColumnsResponseItem {
  @scala.inline
  def apply(
    cards_url: java.lang.String,
    created_at: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    project_url: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ProjectsListColumnsResponseItem = {
    val __obj = js.Dynamic.literal(cards_url = cards_url, created_at = created_at, id = id, name = name, node_id = node_id, project_url = project_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ProjectsListColumnsResponseItem]
  }
}

