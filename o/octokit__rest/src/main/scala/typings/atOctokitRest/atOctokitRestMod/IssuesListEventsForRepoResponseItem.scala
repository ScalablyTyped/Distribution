package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListEventsForRepoResponseItem extends js.Object {
  var actor: IssuesListEventsForRepoResponseItemActor
  var commit_id: String
  var commit_url: String
  var created_at: String
  var event: String
  var id: Double
  var issue: IssuesListEventsForRepoResponseItemIssue
  var node_id: String
  var url: String
}

object IssuesListEventsForRepoResponseItem {
  @scala.inline
  def apply(
    actor: IssuesListEventsForRepoResponseItemActor,
    commit_id: String,
    commit_url: String,
    created_at: String,
    event: String,
    id: Double,
    issue: IssuesListEventsForRepoResponseItemIssue,
    node_id: String,
    url: String
  ): IssuesListEventsForRepoResponseItem = {
    val __obj = js.Dynamic.literal(actor = actor, commit_id = commit_id, commit_url = commit_url, created_at = created_at, event = event, id = id, issue = issue, node_id = node_id, url = url)
  
    __obj.asInstanceOf[IssuesListEventsForRepoResponseItem]
  }
}

