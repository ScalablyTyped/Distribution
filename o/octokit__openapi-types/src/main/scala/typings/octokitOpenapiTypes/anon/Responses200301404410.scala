package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200301404410 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: js.UndefOr[Content333] = js.undefined
  
  var responses: `200301404410`
}
object Responses200301404410 {
  
  inline def apply(parameters: PathIssuenumber, responses: `200301404410`): Responses200301404410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200301404410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200301404410] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content333): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200301404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
