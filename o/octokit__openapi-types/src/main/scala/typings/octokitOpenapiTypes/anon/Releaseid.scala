package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Releaseid extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The unique identifier of the release. */
  var release_id: Double
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object Releaseid {
  
  inline def apply(owner: String, release_id: Double, repo: String): Releaseid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Releaseid]
  }
  
  extension [Self <: Releaseid](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRelease_id(value: Double): Self = StObject.set(x, "release_id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
