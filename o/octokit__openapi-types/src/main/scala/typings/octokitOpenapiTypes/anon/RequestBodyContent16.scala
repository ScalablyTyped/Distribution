package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent16 extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: Content16
}
object RequestBodyContent16 {
  
  inline def apply(parameters: PathEnterprise, requestBody: Content16): RequestBodyContent16 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent16] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content16): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
