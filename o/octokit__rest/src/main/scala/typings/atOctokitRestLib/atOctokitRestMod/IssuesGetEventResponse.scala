package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetEventResponse extends js.Object {
  var actor: IssuesGetEventResponseActor
  var commit_id: java.lang.String
  var commit_url: java.lang.String
  var created_at: java.lang.String
  var event: java.lang.String
  var id: scala.Double
  var issue: IssuesGetEventResponseIssue
  var node_id: java.lang.String
  var url: java.lang.String
}

object IssuesGetEventResponse {
  @scala.inline
  def apply(
    actor: IssuesGetEventResponseActor,
    commit_id: java.lang.String,
    commit_url: java.lang.String,
    created_at: java.lang.String,
    event: java.lang.String,
    id: scala.Double,
    issue: IssuesGetEventResponseIssue,
    node_id: java.lang.String,
    url: java.lang.String
  ): IssuesGetEventResponse = {
    val __obj = js.Dynamic.literal(actor = actor, commit_id = commit_id, commit_url = commit_url, created_at = created_at, event = event, id = id, issue = issue, node_id = node_id, url = url)
  
    __obj.asInstanceOf[IssuesGetEventResponse]
  }
}

