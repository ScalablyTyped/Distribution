package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commits extends StObject {
  
  var code: `1460`
  
  var commits: `1461`
  
  var issuesAndPullRequests: `1462`
  
  var labels: `1463`
  
  var repos: `1464`
  
  var topics: `1465`
  
  var users: `1466`
}
object Commits {
  
  inline def apply(
    code: `1460`,
    commits: `1461`,
    issuesAndPullRequests: `1462`,
    labels: `1463`,
    repos: `1464`,
    topics: `1465`,
    users: `1466`
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  
  extension [Self <: Commits](x: Self) {
    
    inline def setCode(value: `1460`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: `1461`): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setIssuesAndPullRequests(value: `1462`): Self = StObject.set(x, "issuesAndPullRequests", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: `1463`): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setRepos(value: `1464`): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: `1465`): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: `1466`): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
