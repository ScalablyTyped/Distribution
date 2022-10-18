package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryMentioned extends StObject {
  
  var parameters: QueryMentioned
  
  var responses: `301404422`
}
object ParametersQueryMentioned {
  
  inline def apply(parameters: QueryMentioned, responses: `301404422`): ParametersQueryMentioned = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryMentioned]
  }
  
  extension [Self <: ParametersQueryMentioned](x: Self) {
    
    inline def setParameters(value: QueryMentioned): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
