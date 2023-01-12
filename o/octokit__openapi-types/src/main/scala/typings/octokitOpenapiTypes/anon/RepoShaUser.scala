package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoShaUser extends StObject {
  
  var label: String
  
  var ref: String
  
  var repo: Deploymentsurl
  
  var sha: String
  
  var user: Gistsurl
}
object RepoShaUser {
  
  inline def apply(label: String, ref: String, repo: Deploymentsurl, sha: String, user: Gistsurl): RepoShaUser = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoShaUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoShaUser] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: Deploymentsurl): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Gistsurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
