package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesAndPullRequestsResponseItemsItemLabelsItem extends js.Object {
  var color: String
  var id: Double
  var name: String
  var node_id: String
  var url: String
}

object SearchIssuesAndPullRequestsResponseItemsItemLabelsItem {
  @scala.inline
  def apply(color: String, id: Double, name: String, node_id: String, url: String): SearchIssuesAndPullRequestsResponseItemsItemLabelsItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesAndPullRequestsResponseItemsItemLabelsItem]
  }
}

