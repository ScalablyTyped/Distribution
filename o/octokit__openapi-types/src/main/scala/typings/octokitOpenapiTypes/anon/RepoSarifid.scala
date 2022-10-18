package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoSarifid extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
  
  /** The SARIF ID obtained after uploading. */
  var sarif_id: String
}
object RepoSarifid {
  
  inline def apply(owner: String, repo: String, sarif_id: String): RepoSarifid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sarif_id = sarif_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoSarifid]
  }
  
  extension [Self <: RepoSarifid](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSarif_id(value: String): Self = StObject.set(x, "sarif_id", value.asInstanceOf[js.Any])
  }
}
