package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListLabelsForRepoResponseItem extends js.Object {
  var color: String
  var default: Boolean
  var description: String
  var id: Double
  var name: String
  var node_id: String
  var url: String
}

object IssuesListLabelsForRepoResponseItem {
  @scala.inline
  def apply(
    color: String,
    default: Boolean,
    description: String,
    id: Double,
    name: String,
    node_id: String,
    url: String
  ): IssuesListLabelsForRepoResponseItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesListLabelsForRepoResponseItem]
  }
}

