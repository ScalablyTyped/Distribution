package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgQueryCursorPerpage extends StObject {
  
  var parameters: PathHookidOrgQueryCursorPerpage
  
  var responses: `400422`
}
object ParametersPathHookidOrgQueryCursorPerpage {
  
  inline def apply(parameters: PathHookidOrgQueryCursorPerpage, responses: `400422`): ParametersPathHookidOrgQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgQueryCursorPerpage]
  }
  
  extension [Self <: ParametersPathHookidOrgQueryCursorPerpage](x: Self) {
    
    inline def setParameters(value: PathHookidOrgQueryCursorPerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
