package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryExcludePage extends StObject {
  
  var parameters: QueryExcludePage
  
  var responses: `200Content449`
}
object ParametersQueryExcludePage {
  
  inline def apply(parameters: QueryExcludePage, responses: `200Content449`): ParametersQueryExcludePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryExcludePage]
  }
  
  extension [Self <: ParametersQueryExcludePage](x: Self) {
    
    inline def setParameters(value: QueryExcludePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content449`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
