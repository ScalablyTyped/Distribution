package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentnameStringNameString extends StObject {
  
  var environment_name: String
  
  var name: String
  
  var repository_id: Double
}
object EnvironmentnameStringNameString {
  
  inline def apply(environment_name: String, name: String, repository_id: Double): EnvironmentnameStringNameString = {
    val __obj = js.Dynamic.literal(environment_name = environment_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentnameStringNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentnameStringNameString] (val x: Self) extends AnyVal {
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
