package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesResponseItemsItemLabelsItem extends js.Object {
  var color: String
  var id: Double
  var name: String
  var node_id: String
  var url: String
}

object SearchIssuesResponseItemsItemLabelsItem {
  @scala.inline
  def apply(color: String, id: Double, name: String, node_id: String, url: String): SearchIssuesResponseItemsItemLabelsItem = {
    val __obj = js.Dynamic.literal(color = color, id = id, name = name, node_id = node_id, url = url)
  
    __obj.asInstanceOf[SearchIssuesResponseItemsItemLabelsItem]
  }
}

