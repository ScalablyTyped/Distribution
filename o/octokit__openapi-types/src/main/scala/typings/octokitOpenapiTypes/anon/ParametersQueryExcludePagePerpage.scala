package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryExcludePagePerpage extends StObject {
  
  var parameters: QueryExcludePagePerpage
  
  var responses: `200Content346`
}
object ParametersQueryExcludePagePerpage {
  
  inline def apply(parameters: QueryExcludePagePerpage, responses: `200Content346`): ParametersQueryExcludePagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryExcludePagePerpage]
  }
  
  extension [Self <: ParametersQueryExcludePagePerpage](x: Self) {
    
    inline def setParameters(value: QueryExcludePagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
