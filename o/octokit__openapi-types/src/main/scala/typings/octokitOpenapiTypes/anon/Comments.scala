package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comments extends StObject {
  
  var comments: js.UndefOr[Totalcommitcomments] = js.undefined
  
  var gists: js.UndefOr[Privategists] = js.undefined
  
  var hooks: js.UndefOr[Activehooks] = js.undefined
  
  var issues: js.UndefOr[Closedissues] = js.undefined
  
  var milestones: js.UndefOr[Closedmilestones] = js.undefined
  
  var orgs: js.UndefOr[Disabledorgs] = js.undefined
  
  var pages: js.UndefOr[Totalpages] = js.undefined
  
  var pulls: js.UndefOr[Mergeablepulls] = js.undefined
  
  var repos: js.UndefOr[Forkrepos] = js.undefined
  
  var users: js.UndefOr[Adminusers] = js.undefined
}
object Comments {
  
  inline def apply(): Comments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comments]
  }
  
  extension [Self <: Comments](x: Self) {
    
    inline def setComments(value: Totalcommitcomments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setGists(value: Privategists): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
    
    inline def setGistsUndefined: Self = StObject.set(x, "gists", js.undefined)
    
    inline def setHooks(value: Activehooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setIssues(value: Closedissues): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setMilestones(value: Closedmilestones): Self = StObject.set(x, "milestones", value.asInstanceOf[js.Any])
    
    inline def setMilestonesUndefined: Self = StObject.set(x, "milestones", js.undefined)
    
    inline def setOrgs(value: Disabledorgs): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
    
    inline def setOrgsUndefined: Self = StObject.set(x, "orgs", js.undefined)
    
    inline def setPages(value: Totalpages): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPulls(value: Mergeablepulls): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
    
    inline def setPullsUndefined: Self = StObject.set(x, "pulls", js.undefined)
    
    inline def setRepos(value: Forkrepos): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setReposUndefined: Self = StObject.set(x, "repos", js.undefined)
    
    inline def setUsers(value: Adminusers): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
  }
}
