package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetEventResponseIssueLabelsItem extends js.Object {
  var color: java.lang.String
  var default: scala.Boolean
  var description: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var url: java.lang.String
}

object IssuesGetEventResponseIssueLabelsItem {
  @scala.inline
  def apply(
    color: java.lang.String,
    default: scala.Boolean,
    description: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    url: java.lang.String
  ): IssuesGetEventResponseIssueLabelsItem = {
    val __obj = js.Dynamic.literal(color = color, default = default, description = description, id = id, name = name, node_id = node_id, url = url)
  
    __obj.asInstanceOf[IssuesGetEventResponseIssueLabelsItem]
  }
}

