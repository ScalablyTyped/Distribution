package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLabelsResponseItemsItem extends js.Object {
  var color: String
  var default: Boolean
  var description: String
  var id: Double
  var name: String
  var node_id: String
  var score: Double
  var url: String
}

object SearchLabelsResponseItemsItem {
  @scala.inline
  def apply(
    color: String,
    default: Boolean,
    description: String,
    id: Double,
    name: String,
    node_id: String,
    score: Double,
    url: String
  ): SearchLabelsResponseItemsItem = {
    val __obj = js.Dynamic.literal(color = color, default = default, description = description, id = id, name = name, node_id = node_id, score = score, url = url)
  
    __obj.asInstanceOf[SearchLabelsResponseItemsItem]
  }
}

