package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesAddAssigneesResponseMilestone extends js.Object {
  var closed_at: String
  var closed_issues: Double
  var created_at: String
  var creator: IssuesAddAssigneesResponseMilestoneCreator
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

object IssuesAddAssigneesResponseMilestone {
  @scala.inline
  def apply(
    closed_at: String,
    closed_issues: Double,
    created_at: String,
    creator: IssuesAddAssigneesResponseMilestoneCreator,
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
  ): IssuesAddAssigneesResponseMilestone = {
    val __obj = js.Dynamic.literal(closed_at = closed_at.asInstanceOf[js.Any], closed_issues = closed_issues.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesAddAssigneesResponseMilestone]
  }
}

