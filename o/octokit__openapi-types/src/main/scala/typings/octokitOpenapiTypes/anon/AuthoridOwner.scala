package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthoridOwner extends StObject {
  
  var author_id: Double
  
  var owner: String
  
  var repo: String
}
object AuthoridOwner {
  
  inline def apply(author_id: Double, owner: String, repo: String): AuthoridOwner = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthoridOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthoridOwner] (val x: Self) extends AnyVal {
    
    inline def setAuthor_id(value: Double): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
