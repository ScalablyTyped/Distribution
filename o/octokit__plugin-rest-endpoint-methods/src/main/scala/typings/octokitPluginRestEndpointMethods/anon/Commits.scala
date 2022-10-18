package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commits extends StObject {
  
  var code: `1488`
  
  var commits: `1489`
  
  var issuesAndPullRequests: `1490`
  
  var labels: `1491`
  
  var repos: `1492`
  
  var topics: `1493`
  
  var users: `1494`
}
object Commits {
  
  inline def apply(
    code: `1488`,
    commits: `1489`,
    issuesAndPullRequests: `1490`,
    labels: `1491`,
    repos: `1492`,
    topics: `1493`,
    users: `1494`
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  
  extension [Self <: Commits](x: Self) {
    
    inline def setCode(value: `1488`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: `1489`): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setIssuesAndPullRequests(value: `1490`): Self = StObject.set(x, "issuesAndPullRequests", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: `1491`): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setRepos(value: `1492`): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: `1493`): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: `1494`): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
