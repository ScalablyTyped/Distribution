package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyidOwner extends StObject {
  
  /** The unique identifier of the key. */
  var key_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object KeyidOwner {
  
  inline def apply(key_id: Double, owner: String, repo: String): KeyidOwner = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyidOwner]
  }
  
  extension [Self <: KeyidOwner](x: Self) {
    
    inline def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
