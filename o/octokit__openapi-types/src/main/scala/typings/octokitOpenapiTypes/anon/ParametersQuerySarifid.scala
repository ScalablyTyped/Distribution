package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySarifid extends StObject {
  
  var parameters: QuerySarifid
  
  var responses: `200Content182`
}
object ParametersQuerySarifid {
  
  inline def apply(parameters: QuerySarifid, responses: `200Content182`): ParametersQuerySarifid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySarifid]
  }
  
  extension [Self <: ParametersQuerySarifid](x: Self) {
    
    inline def setParameters(value: QuerySarifid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content182`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
