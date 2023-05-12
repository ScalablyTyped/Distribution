package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAffiliationBefore extends StObject {
  
  var parameters: QueryAffiliationBefore
  
  var responses: `200Content663`
}
object ParametersQueryAffiliationBefore {
  
  inline def apply(parameters: QueryAffiliationBefore, responses: `200Content663`): ParametersQueryAffiliationBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAffiliationBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAffiliationBefore] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAffiliationBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content663`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
