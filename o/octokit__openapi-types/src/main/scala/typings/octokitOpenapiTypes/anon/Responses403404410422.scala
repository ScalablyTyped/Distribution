package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404410422 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: js.UndefOr[Content336] = js.undefined
  
  var responses: `403404410422`
}
object Responses403404410422 {
  
  inline def apply(parameters: PathIssuenumber, responses: `403404410422`): Responses403404410422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404410422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403404410422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content336): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `403404410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
