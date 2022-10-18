package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerPath extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** path parameter */
  var path: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object OwnerPath {
  
  inline def apply(owner: String, path: String, repo: String): OwnerPath = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerPath]
  }
  
  extension [Self <: OwnerPath](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
