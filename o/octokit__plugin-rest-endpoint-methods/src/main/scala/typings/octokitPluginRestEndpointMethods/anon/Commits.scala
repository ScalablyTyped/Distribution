package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commits extends StObject {
  
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
  implicit class CommitsMutableBuilder[Self <: Commits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: `1031`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits(value: `1032`): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesAndPullRequests(value: `1033`): Self = StObject.set(x, "issuesAndPullRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: `1034`): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos(value: `1035`): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: `1036`): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: `1037`): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
