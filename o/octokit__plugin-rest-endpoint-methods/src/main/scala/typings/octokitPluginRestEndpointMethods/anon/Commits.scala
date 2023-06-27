package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commits extends StObject {
  
  var code: `1603`
  
  var commits: `1604`
  
  var issuesAndPullRequests: `1605`
  
  var labels: `1606`
  
  var repos: `1607`
  
  var topics: `1608`
  
  var users: `1609`
}
object Commits {
  
  inline def apply(
    code: `1603`,
    commits: `1604`,
    issuesAndPullRequests: `1605`,
    labels: `1606`,
    repos: `1607`,
    topics: `1608`,
    users: `1609`
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Commits] (val x: Self) extends AnyVal {
    
    inline def setCode(value: `1603`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: `1604`): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setIssuesAndPullRequests(value: `1605`): Self = StObject.set(x, "issuesAndPullRequests", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: `1606`): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setRepos(value: `1607`): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: `1608`): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: `1609`): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
