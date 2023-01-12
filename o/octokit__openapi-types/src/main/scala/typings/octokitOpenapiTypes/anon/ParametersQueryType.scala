package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryType extends StObject {
  
  var parameters: QueryType
  
  var responses: `200304401403422`
}
object ParametersQueryType {
  
  inline def apply(parameters: QueryType, responses: `200304401403422`): ParametersQueryType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryType] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
