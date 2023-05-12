package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerRepoSarifid extends StObject {
  
  var owner: String
  
  var repo: String
  
  /** @description The SARIF ID obtained after uploading. */
  var sarif_id: String
}
object OwnerRepoSarifid {
  
  inline def apply(owner: String, repo: String, sarif_id: String): OwnerRepoSarifid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sarif_id = sarif_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerRepoSarifid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerRepoSarifid] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSarif_id(value: String): Self = StObject.set(x, "sarif_id", value.asInstanceOf[js.Any])
  }
}
