package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels extends js.Object {
  var assignee: String = js.native
  var body: String = js.native
  var closed_at: String = js.native
  var comments: Double = js.native
  var comments_url: String = js.native
  var created_at: String = js.native
  var events_url: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var labels: js.Array[ColorId] = js.native
  var labels_url: String = js.native
  var milestone: String = js.native
  var node_id: String = js.native
  var number: Double = js.native
  var pull_request: Patchurl = js.native
  var repository_url: String = js.native
  var score: Double = js.native
  var state: String = js.native
  var title: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user: Followingurl = js.native
}

object Labels {
  @scala.inline
  def apply(
    assignee: String,
    body: String,
    closed_at: String,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[ColorId],
    labels_url: String,
    milestone: String,
    node_id: String,
    number: Double,
    pull_request: Patchurl,
    repository_url: String,
    score: Double,
    state: String,
    title: String,
    updated_at: String,
    url: String,
    user: Followingurl
  ): Labels = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssignee(value: String): Self = this.set("assignee", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed_at(value: String): Self = this.set("closed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments(value: Double): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents_url(value: String): Self = this.set("events_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: ColorId*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[ColorId]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels_url(value: String): Self = this.set("labels_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setMilestone(value: String): Self = this.set("milestone", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_request(value: Patchurl): Self = this.set("pull_request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository_url(value: String): Self = this.set("repository_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Followingurl): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

