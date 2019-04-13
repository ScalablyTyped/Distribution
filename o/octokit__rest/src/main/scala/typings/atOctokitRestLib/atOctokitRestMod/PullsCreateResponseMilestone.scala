package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponseMilestone extends js.Object {
  var closed_at: java.lang.String
  var closed_issues: scala.Double
  var created_at: java.lang.String
  var creator: PullsCreateResponseMilestoneCreator
  var description: java.lang.String
  var due_on: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var labels_url: java.lang.String
  var node_id: java.lang.String
  var number: scala.Double
  var open_issues: scala.Double
  var state: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object PullsCreateResponseMilestone {
  @scala.inline
  def apply(
    closed_at: java.lang.String,
    closed_issues: scala.Double,
    created_at: java.lang.String,
    creator: PullsCreateResponseMilestoneCreator,
    description: java.lang.String,
    due_on: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    labels_url: java.lang.String,
    node_id: java.lang.String,
    number: scala.Double,
    open_issues: scala.Double,
    state: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): PullsCreateResponseMilestone = {
    val __obj = js.Dynamic.literal(closed_at = closed_at, closed_issues = closed_issues, created_at = created_at, creator = creator, description = description, due_on = due_on, html_url = html_url, id = id, labels_url = labels_url, node_id = node_id, number = number, open_issues = open_issues, state = state, title = title, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[PullsCreateResponseMilestone]
  }
}

