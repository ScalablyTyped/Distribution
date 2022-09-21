package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgScimuserid extends StObject {
  
  var parameters: PathOrgScimuserid
  
  var responses: `200Content355`
}
object ParametersPathOrgScimuserid {
  
  inline def apply(parameters: PathOrgScimuserid, responses: `200Content355`): ParametersPathOrgScimuserid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgScimuserid]
  }
  
  extension [Self <: ParametersPathOrgScimuserid](x: Self) {
    
    inline def setParameters(value: PathOrgScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content355`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
