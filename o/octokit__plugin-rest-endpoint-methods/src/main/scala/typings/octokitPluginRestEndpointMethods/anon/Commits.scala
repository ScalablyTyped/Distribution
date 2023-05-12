package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commits extends StObject {
  
  var code: `1525`
  
  var commits: `1526`
  
  var issuesAndPullRequests: `1527`
  
  var labels: `1528`
  
  var repos: `1529`
  
  var topics: `1530`
  
  var users: `1531`
}
object Commits {
  
  inline def apply(
    code: `1525`,
    commits: `1526`,
    issuesAndPullRequests: `1527`,
    labels: `1528`,
    repos: `1529`,
    topics: `1530`,
    users: `1531`
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Commits] (val x: Self) extends AnyVal {
    
    inline def setCode(value: `1525`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: `1526`): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setIssuesAndPullRequests(value: `1527`): Self = StObject.set(x, "issuesAndPullRequests", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: `1528`): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setRepos(value: `1529`): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: `1530`): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: `1531`): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
