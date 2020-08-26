package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Annotationscount
import typings.octokitTypes.anon.Base
import typings.octokitTypes.anon.Events
import typings.octokitTypes.anon.IdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksCreateResponseData extends js.Object {
  var app: Events = js.native
  var check_suite: IdNumber = js.native
  var completed_at: String = js.native
  var conclusion: String = js.native
  var details_url: String = js.native
  var external_id: String = js.native
  var head_sha: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var node_id: String = js.native
  var output: Annotationscount = js.native
  var pull_requests: js.Array[Base] = js.native
  var started_at: String = js.native
  var status: String = js.native
  var url: String = js.native
}

object ChecksCreateResponseData {
  @scala.inline
  def apply(
    app: Events,
    check_suite: IdNumber,
    completed_at: String,
    conclusion: String,
    details_url: String,
    external_id: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    output: Annotationscount,
    pull_requests: js.Array[Base],
    started_at: String,
    status: String,
    url: String
  ): ChecksCreateResponseData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], check_suite = check_suite.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateResponseData]
  }
  @scala.inline
  implicit class ChecksCreateResponseDataOps[Self <: ChecksCreateResponseData] (val x: Self) extends AnyVal {
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
    def setApp(value: Events): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheck_suite(value: IdNumber): Self = this.set("check_suite", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleted_at(value: String): Self = this.set("completed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setConclusion(value: String): Self = this.set("conclusion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails_url(value: String): Self = this.set("details_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead_sha(value: String): Self = this.set("head_sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: Annotationscount): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_requestsVarargs(value: Base*): Self = this.set("pull_requests", js.Array(value :_*))
    @scala.inline
    def setPull_requests(value: js.Array[Base]): Self = this.set("pull_requests", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarted_at(value: String): Self = this.set("started_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

