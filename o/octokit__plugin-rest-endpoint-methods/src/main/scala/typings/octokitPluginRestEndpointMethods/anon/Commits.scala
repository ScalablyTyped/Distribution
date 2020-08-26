package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commits extends js.Object {
  var code: `1025` = js.native
  var commits: `1026` = js.native
  var issuesAndPullRequests: `1027` = js.native
  var labels: `1028` = js.native
  var repos: `1029` = js.native
  var topics: `1030` = js.native
  var users: `1031` = js.native
}

object Commits {
  @scala.inline
  def apply(
    code: `1025`,
    commits: `1026`,
    issuesAndPullRequests: `1027`,
    labels: `1028`,
    repos: `1029`,
    topics: `1030`,
    users: `1031`
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  @scala.inline
  implicit class CommitsOps[Self <: Commits] (val x: Self) extends AnyVal {
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
    def setCode(value: `1025`): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommits(value: `1026`): Self = this.set("commits", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuesAndPullRequests(value: `1027`): Self = this.set("issuesAndPullRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: `1028`): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepos(value: `1029`): Self = this.set("repos", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopics(value: `1030`): Self = this.set("topics", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsers(value: `1031`): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

