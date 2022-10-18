package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionidReleaseid extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The unique identifier of the reaction. */
  var reaction_id: Double
  
  /** The unique identifier of the release. */
  var release_id: Double
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object ReactionidReleaseid {
  
  inline def apply(owner: String, reaction_id: Double, release_id: Double, repo: String): ReactionidReleaseid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionidReleaseid]
  }
  
  extension [Self <: ReactionidReleaseid](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    inline def setRelease_id(value: Double): Self = StObject.set(x, "release_id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
