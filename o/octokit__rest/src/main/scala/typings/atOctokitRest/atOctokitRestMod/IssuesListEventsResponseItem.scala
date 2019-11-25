package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListEventsResponseItem extends js.Object {
  var actor: IssuesListEventsResponseItemActor
  var commit_id: String
  var commit_url: String
  var created_at: String
  var event: String
  var id: Double
  var node_id: String
  var url: String
}

object IssuesListEventsResponseItem {
  @scala.inline
  def apply(
    actor: IssuesListEventsResponseItemActor,
    commit_id: String,
    commit_url: String,
    created_at: String,
    event: String,
    id: Double,
    node_id: String,
    url: String
  ): IssuesListEventsResponseItem = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], commit_url = commit_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesListEventsResponseItem]
  }
}

