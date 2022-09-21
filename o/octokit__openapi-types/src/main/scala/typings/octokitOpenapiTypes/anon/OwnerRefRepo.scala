package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerRefRepo extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  var ref: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object OwnerRefRepo {
  
  inline def apply(owner: String, ref: String, repo: String): OwnerRefRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerRefRepo]
  }
  
  extension [Self <: OwnerRefRepo](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
