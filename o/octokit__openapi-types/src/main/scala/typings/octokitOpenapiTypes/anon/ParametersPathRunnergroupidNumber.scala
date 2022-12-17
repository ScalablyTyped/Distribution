package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidNumber extends StObject {
  
  var parameters: PathRunnergroupidNumber
  
  var responses: `200ContentApplicationjsonInherited`
}
object ParametersPathRunnergroupidNumber {
  
  inline def apply(parameters: PathRunnergroupidNumber, responses: `200ContentApplicationjsonInherited`): ParametersPathRunnergroupidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidNumber]
  }
  
  extension [Self <: ParametersPathRunnergroupidNumber](x: Self) {
    
    inline def setParameters(value: PathRunnergroupidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInherited`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
