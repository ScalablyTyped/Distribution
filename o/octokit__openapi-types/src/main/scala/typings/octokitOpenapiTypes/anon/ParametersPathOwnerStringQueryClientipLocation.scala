package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQueryClientipLocation extends StObject {
  
  var parameters: PathOwnerStringQueryClientipLocation
  
  var responses: `200ContentApplicationjsonMachinesTotalcount`
}
object ParametersPathOwnerStringQueryClientipLocation {
  
  inline def apply(
    parameters: PathOwnerStringQueryClientipLocation,
    responses: `200ContentApplicationjsonMachinesTotalcount`
  ): ParametersPathOwnerStringQueryClientipLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQueryClientipLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQueryClientipLocation] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQueryClientipLocation): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMachinesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
