package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAffiliationBefore extends StObject {
  
  var parameters: QueryAffiliationBefore
  
  var responses: `200304401403422`
}
object ParametersQueryAffiliationBefore {
  
  inline def apply(parameters: QueryAffiliationBefore, responses: `200304401403422`): ParametersQueryAffiliationBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAffiliationBefore]
  }
  
  extension [Self <: ParametersQueryAffiliationBefore](x: Self) {
    
    inline def setParameters(value: QueryAffiliationBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
