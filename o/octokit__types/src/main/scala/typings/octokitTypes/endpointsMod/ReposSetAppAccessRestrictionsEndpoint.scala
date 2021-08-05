package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposSetAppAccessRestrictionsEndpoint extends StObject {
  
  /**
    * apps parameter
    */
  var apps: js.Array[String]
  
  var branch: String
  
  var owner: String
  
  var repo: String
}
object ReposSetAppAccessRestrictionsEndpoint {
  
  inline def apply(apps: js.Array[String], branch: String, owner: String, repo: String): ReposSetAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposSetAppAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ReposSetAppAccessRestrictionsEndpoint](x: Self) {
    
    inline def setApps(value: js.Array[String]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsVarargs(value: String*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
