package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDevcontainerpath401Content6 extends StObject {
  
  var parameters: PathCodespacenameString
  
  var responses: `200ContentApplicationjsonDevcontainerpath401Content6`
}
object Responses200ContentApplicationjsonDevcontainerpath401Content6 {
  
  inline def apply(
    parameters: PathCodespacenameString,
    responses: `200ContentApplicationjsonDevcontainerpath401Content6`
  ): Responses200ContentApplicationjsonDevcontainerpath401Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDevcontainerpath401Content6]
  }
  
  extension [Self <: Responses200ContentApplicationjsonDevcontainerpath401Content6](x: Self) {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDevcontainerpath401Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
