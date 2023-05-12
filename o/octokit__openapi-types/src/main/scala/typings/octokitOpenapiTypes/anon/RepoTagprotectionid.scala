package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoTagprotectionid extends StObject {
  
  var owner: String
  
  var repo: String
  
  var tag_protection_id: Double
}
object RepoTagprotectionid {
  
  inline def apply(owner: String, repo: String, tag_protection_id: Double): RepoTagprotectionid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_protection_id = tag_protection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoTagprotectionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoTagprotectionid] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTag_protection_id(value: Double): Self = StObject.set(x, "tag_protection_id", value.asInstanceOf[js.Any])
  }
}
