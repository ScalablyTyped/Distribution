package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cacheid extends StObject {
  
  /** The unique identifier of the GitHub Actions cache. */
  var cache_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Cacheid {
  
  inline def apply(cache_id: Double, owner: String, repo: String): Cacheid = {
    val __obj = js.Dynamic.literal(cache_id = cache_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cacheid]
  }
  
  extension [Self <: Cacheid](x: Self) {
    
    inline def setCache_id(value: Double): Self = StObject.set(x, "cache_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
