package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent547 extends StObject {
  
  var parameters: `544`
  
  var requestBody: Content547
}
object RequestBodyContent547 {
  
  inline def apply(parameters: `544`, requestBody: Content547): RequestBodyContent547 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent547]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent547] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `544`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content547): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
