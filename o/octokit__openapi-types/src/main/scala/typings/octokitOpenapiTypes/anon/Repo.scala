package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repo extends StObject {
  
  var label: String
  
  var ref: String
  
  var repo: Branchesurl | Null
  
  var sha: String
  
  var user: Gistsurl
}
object Repo {
  
  inline def apply(label: String, ref: String, sha: String, user: Gistsurl): Repo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], repo = null)
    __obj.asInstanceOf[Repo]
  }
  
  extension [Self <: Repo](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: Branchesurl): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoNull: Self = StObject.set(x, "repo", null)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Gistsurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
