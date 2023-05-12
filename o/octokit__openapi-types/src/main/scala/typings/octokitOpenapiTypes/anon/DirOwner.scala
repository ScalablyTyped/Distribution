package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirOwner extends StObject {
  
  /** @description The alternate path to look for a README file */
  var dir: String
  
  var owner: String
  
  var repo: String
}
object DirOwner {
  
  inline def apply(dir: String, owner: String, repo: String): DirOwner = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirOwner] (val x: Self) extends AnyVal {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
