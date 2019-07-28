package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelResponseItem extends js.Object {
  var color: String
  var default: Boolean
  var description: String
  var id: Double
  var name: String
  var node_id: String
  var url: String
}

object IssuesRemoveLabelResponseItem {
  @scala.inline
  def apply(
    color: String,
    default: Boolean,
    description: String,
    id: Double,
    name: String,
    node_id: String,
    url: String
  ): IssuesRemoveLabelResponseItem = {
    val __obj = js.Dynamic.literal(color = color, default = default, description = description, id = id, name = name, node_id = node_id, url = url)
  
    __obj.asInstanceOf[IssuesRemoveLabelResponseItem]
  }
}

