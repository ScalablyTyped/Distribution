package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelRefRepo extends StObject {
  
  var label: String
  
  var ref: String
  
  var repo: Compareurl
  
  var sha: String
  
  var user: Gistsurl
}
object LabelRefRepo {
  
  inline def apply(label: String, ref: String, repo: Compareurl, sha: String, user: Gistsurl): LabelRefRepo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelRefRepo]
  }
  
  extension [Self <: LabelRefRepo](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: Compareurl): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Gistsurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
