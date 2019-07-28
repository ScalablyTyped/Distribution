package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListColumnsResponseItem extends js.Object {
  var cards_url: String
  var created_at: String
  var id: Double
  var name: String
  var node_id: String
  var project_url: String
  var updated_at: String
  var url: String
}

object ProjectsListColumnsResponseItem {
  @scala.inline
  def apply(
    cards_url: String,
    created_at: String,
    id: Double,
    name: String,
    node_id: String,
    project_url: String,
    updated_at: String,
    url: String
  ): ProjectsListColumnsResponseItem = {
    val __obj = js.Dynamic.literal(cards_url = cards_url, created_at = created_at, id = id, name = name, node_id = node_id, project_url = project_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ProjectsListColumnsResponseItem]
  }
}

