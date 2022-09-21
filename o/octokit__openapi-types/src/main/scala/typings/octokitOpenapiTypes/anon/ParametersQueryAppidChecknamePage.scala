package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAppidChecknamePage extends StObject {
  
  var parameters: QueryAppidChecknamePage
  
  var responses: `200ContentApplicationjsonChecksuitesTotalcount`
}
object ParametersQueryAppidChecknamePage {
  
  inline def apply(parameters: QueryAppidChecknamePage, responses: `200ContentApplicationjsonChecksuitesTotalcount`): ParametersQueryAppidChecknamePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAppidChecknamePage]
  }
  
  extension [Self <: ParametersQueryAppidChecknamePage](x: Self) {
    
    inline def setParameters(value: QueryAppidChecknamePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonChecksuitesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
