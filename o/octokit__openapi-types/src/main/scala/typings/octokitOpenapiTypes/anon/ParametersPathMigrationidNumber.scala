package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidNumber extends StObject {
  
  var parameters: PathMigrationidNumber
  
  var responses: `200ContentApplicationjsonExcludeownerprojects304`
}
object ParametersPathMigrationidNumber {
  
  inline def apply(parameters: PathMigrationidNumber, responses: `200ContentApplicationjsonExcludeownerprojects304`): ParametersPathMigrationidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonExcludeownerprojects304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
