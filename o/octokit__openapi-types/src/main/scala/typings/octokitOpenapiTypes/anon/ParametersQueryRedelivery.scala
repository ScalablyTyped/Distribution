package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryRedelivery extends StObject {
  
  var parameters: QueryRedelivery
  
  var responses: `400422`
}
object ParametersQueryRedelivery {
  
  inline def apply(parameters: QueryRedelivery, responses: `400422`): ParametersQueryRedelivery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryRedelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryRedelivery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryRedelivery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
