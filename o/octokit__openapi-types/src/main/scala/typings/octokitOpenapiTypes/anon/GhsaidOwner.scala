package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GhsaidOwner extends StObject {
  
  var ghsa_id: String
  
  var owner: String
  
  var repo: String
}
object GhsaidOwner {
  
  inline def apply(ghsa_id: String, owner: String, repo: String): GhsaidOwner = {
    val __obj = js.Dynamic.literal(ghsa_id = ghsa_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhsaidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GhsaidOwner] (val x: Self) extends AnyVal {
    
    inline def setGhsa_id(value: String): Self = StObject.set(x, "ghsa_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
