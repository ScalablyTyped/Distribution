package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCursorPerpage extends StObject {
  
  var parameters: QueryCursorPerpage
  
  var responses: `200400422`
}
object ParametersQueryCursorPerpage {
  
  inline def apply(parameters: QueryCursorPerpage, responses: `200400422`): ParametersQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCursorPerpage]
  }
  
  extension [Self <: ParametersQueryCursorPerpage](x: Self) {
    
    inline def setParameters(value: QueryCursorPerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
