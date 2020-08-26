package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifactsurl extends js.Object {
  var artifacts_url: String = js.native
  var cancel_url: String = js.native
  var check_suite_url: String = js.native
  var conclusion: String = js.native
  var created_at: String = js.native
  var event: String = js.native
  var head_branch: String = js.native
  var head_commit: Author = js.native
  var head_repository: Assigneesurl = js.native
  var head_sha: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var jobs_url: String = js.native
  var logs_url: String = js.native
  var node_id: String = js.native
  var pull_requests: js.Array[_] = js.native
  var repository: Archiveurl = js.native
  var rerun_url: String = js.native
  var run_number: Double = js.native
  var status: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var workflow_id: Double = js.native
  var workflow_url: String = js.native
}

object Artifactsurl {
  @scala.inline
  def apply(
    artifacts_url: String,
    cancel_url: String,
    check_suite_url: String,
    conclusion: String,
    created_at: String,
    event: String,
    head_branch: String,
    head_commit: Author,
    head_repository: Assigneesurl,
    head_sha: String,
    html_url: String,
    id: Double,
    jobs_url: String,
    logs_url: String,
    node_id: String,
    pull_requests: js.Array[_],
    repository: Archiveurl,
    rerun_url: String,
    run_number: Double,
    status: String,
    updated_at: String,
    url: String,
    workflow_id: Double,
    workflow_url: String
  ): Artifactsurl = {
    val __obj = js.Dynamic.literal(artifacts_url = artifacts_url.asInstanceOf[js.Any], cancel_url = cancel_url.asInstanceOf[js.Any], check_suite_url = check_suite_url.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], head_branch = head_branch.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_repository = head_repository.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobs_url = jobs_url.asInstanceOf[js.Any], logs_url = logs_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], rerun_url = rerun_url.asInstanceOf[js.Any], run_number = run_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any], workflow_url = workflow_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifactsurl]
  }
  @scala.inline
  implicit class ArtifactsurlOps[Self <: Artifactsurl] (val x: Self) extends AnyVal {
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
    def setArtifacts_url(value: String): Self = this.set("artifacts_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel_url(value: String): Self = this.set("cancel_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheck_suite_url(value: String): Self = this.set("check_suite_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setConclusion(value: String): Self = this.set("conclusion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead_branch(value: String): Self = this.set("head_branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead_commit(value: Author): Self = this.set("head_commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead_repository(value: Assigneesurl): Self = this.set("head_repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead_sha(value: String): Self = this.set("head_sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobs_url(value: String): Self = this.set("jobs_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogs_url(value: String): Self = this.set("logs_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_requestsVarargs(value: js.Any*): Self = this.set("pull_requests", js.Array(value :_*))
    @scala.inline
    def setPull_requests(value: js.Array[_]): Self = this.set("pull_requests", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: Archiveurl): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setRerun_url(value: String): Self = this.set("rerun_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun_number(value: Double): Self = this.set("run_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflow_id(value: Double): Self = this.set("workflow_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflow_url(value: String): Self = this.set("workflow_url", value.asInstanceOf[js.Any])
  }
  
}

