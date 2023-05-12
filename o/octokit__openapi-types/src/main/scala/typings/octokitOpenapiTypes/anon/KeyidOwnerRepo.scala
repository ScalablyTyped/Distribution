package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyidOwnerRepo extends StObject {
  
  var key_id: Double
  
  var owner: String
  
  var repo: String
}
object KeyidOwnerRepo {
  
  inline def apply(key_id: Double, owner: String, repo: String): KeyidOwnerRepo = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
