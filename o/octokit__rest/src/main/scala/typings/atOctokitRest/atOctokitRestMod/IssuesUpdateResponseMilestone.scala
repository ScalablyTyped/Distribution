package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateResponseMilestone extends js.Object {
  var closed_at: String
  var closed_issues: Double
  var created_at: String
  var creator: IssuesUpdateResponseMilestoneCreator
  var description: String
  var due_on: String
  var html_url: String
  var id: Double
  var labels_url: String
  var node_id: String
  var number: Double
  var open_issues: Double
  var state: String
  var title: String
  var updated_at: String
  var url: String
}

object IssuesUpdateResponseMilestone {
  @scala.inline
  def apply(
    closed_at: String,
    closed_issues: Double,
    created_at: String,
    creator: IssuesUpdateResponseMilestoneCreator,
    description: String,
    due_on: String,
    html_url: String,
    id: Double,
    labels_url: String,
    node_id: String,
    number: Double,
    open_issues: Double,
    state: String,
    title: String,
    updated_at: String,
    url: String
  ): IssuesUpdateResponseMilestone = {
    val __obj = js.Dynamic.literal(closed_at = closed_at, closed_issues = closed_issues, created_at = created_at, creator = creator, description = description, due_on = due_on, html_url = html_url, id = id, labels_url = labels_url, node_id = node_id, number = number, open_issues = open_issues, state = state, title = title, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[IssuesUpdateResponseMilestone]
  }
}

