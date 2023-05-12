package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentnameString extends StObject {
  
  var environment_name: String
  
  var owner: String
  
  var repo: String
}
object EnvironmentnameString {
  
  inline def apply(environment_name: String, owner: String, repo: String): EnvironmentnameString = {
    val __obj = js.Dynamic.literal(environment_name = environment_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentnameString] (val x: Self) extends AnyVal {
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
