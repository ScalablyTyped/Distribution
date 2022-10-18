package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoSha extends StObject {
  
  var label: String
  
  var ref: String
  
  var repo: Contentsurl
  
  var sha: String
  
  var user: Gistsurl
}
object RepoSha {
  
  inline def apply(label: String, ref: String, repo: Contentsurl, sha: String, user: Gistsurl): RepoSha = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoSha]
  }
  
  extension [Self <: RepoSha](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: Contentsurl): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Gistsurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
