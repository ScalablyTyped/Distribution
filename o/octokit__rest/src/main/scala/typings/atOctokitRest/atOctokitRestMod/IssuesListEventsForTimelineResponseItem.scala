package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListEventsForTimelineResponseItem extends js.Object {
  var actor: IssuesListEventsForTimelineResponseItemActor
  var commit_id: String
  var commit_url: String
  var created_at: String
  var event: String
  var id: Double
  var node_id: String
  var url: String
}

object IssuesListEventsForTimelineResponseItem {
  @scala.inline
  def apply(
    actor: IssuesListEventsForTimelineResponseItemActor,
    commit_id: String,
    commit_url: String,
    created_at: String,
    event: String,
    id: Double,
    node_id: String,
    url: String
  ): IssuesListEventsForTimelineResponseItem = {
    val __obj = js.Dynamic.literal(actor = actor, commit_id = commit_id, commit_url = commit_url, created_at = created_at, event = event, id = id, node_id = node_id, url = url)
  
    __obj.asInstanceOf[IssuesListEventsForTimelineResponseItem]
  }
}

