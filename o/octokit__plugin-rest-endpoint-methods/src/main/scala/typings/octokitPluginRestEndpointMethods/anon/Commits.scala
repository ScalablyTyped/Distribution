package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commits extends StObject {
  
  var code: `1599`
  
  var commits: `1600`
  
  var issuesAndPullRequests: `1601`
  
  var labels: `1602`
  
  var repos: `1603`
  
  var topics: `1604`
  
  var users: `1605`
}
object Commits {
  
  inline def apply(
    code: `1599`,
    commits: `1600`,
    issuesAndPullRequests: `1601`,
    labels: `1602`,
    repos: `1603`,
    topics: `1604`,
    users: `1605`
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Commits] (val x: Self) extends AnyVal {
    
    inline def setCode(value: `1599`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: `1600`): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setIssuesAndPullRequests(value: `1601`): Self = StObject.set(x, "issuesAndPullRequests", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: `1602`): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setRepos(value: `1603`): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: `1604`): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: `1605`): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
