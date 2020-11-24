package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commits extends js.Object {
  
  var code: `1031` = js.native
  
  var commits: `1032` = js.native
  
  var issuesAndPullRequests: `1033` = js.native
  
  var labels: `1034` = js.native
  
  var repos: `1035` = js.native
  
  var topics: `1036` = js.native
  
  var users: `1037` = js.native
}
object Commits {
  
  @scala.inline
  def apply(
    code: `1031`,
    commits: `1032`,
    issuesAndPullRequests: `1033`,
    labels: `1034`,
    repos: `1035`,
    topics: `1036`,
    users: `1037`
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
    def setCode(value: `1031`): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits(value: `1032`): Self = this.set("commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesAndPullRequests(value: `1033`): Self = this.set("issuesAndPullRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: `1034`): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos(value: `1035`): Self = this.set("repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: `1036`): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: `1037`): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
