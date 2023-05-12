package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageVisibility extends StObject {
  
  var parameters: QueryPerpageVisibility
  
  var responses: `200400401`
}
object ParametersQueryPerpageVisibility {
  
  inline def apply(parameters: QueryPerpageVisibility, responses: `200400401`): ParametersQueryPerpageVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpageVisibility] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpageVisibility): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
