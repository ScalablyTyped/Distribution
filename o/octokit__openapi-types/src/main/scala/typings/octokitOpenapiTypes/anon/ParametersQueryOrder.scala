package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOrder extends StObject {
  
  var parameters: QueryOrder
  
  var responses: `304403422`
}
object ParametersQueryOrder {
  
  inline def apply(parameters: QueryOrder, responses: `304403422`): ParametersQueryOrder = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOrder]
  }
  
  extension [Self <: ParametersQueryOrder](x: Self) {
    
    inline def setParameters(value: QueryOrder): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
