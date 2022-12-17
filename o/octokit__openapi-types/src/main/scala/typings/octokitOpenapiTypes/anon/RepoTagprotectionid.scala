package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoTagprotectionid extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
  
  /** The unique identifier of the tag protection. */
  var tag_protection_id: Double
}
object RepoTagprotectionid {
  
  inline def apply(owner: String, repo: String, tag_protection_id: Double): RepoTagprotectionid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_protection_id = tag_protection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoTagprotectionid]
  }
  
  extension [Self <: RepoTagprotectionid](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTag_protection_id(value: Double): Self = StObject.set(x, "tag_protection_id", value.asInstanceOf[js.Any])
  }
}
