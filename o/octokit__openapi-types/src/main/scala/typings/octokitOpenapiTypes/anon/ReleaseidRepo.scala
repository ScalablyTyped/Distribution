package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseidRepo extends StObject {
  
  var owner: String
  
  var reaction_id: Double
  
  var release_id: Double
  
  var repo: String
}
object ReleaseidRepo {
  
  inline def apply(owner: String, reaction_id: Double, release_id: Double, repo: String): ReleaseidRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseidRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseidRepo] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    inline def setRelease_id(value: Double): Self = StObject.set(x, "release_id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
