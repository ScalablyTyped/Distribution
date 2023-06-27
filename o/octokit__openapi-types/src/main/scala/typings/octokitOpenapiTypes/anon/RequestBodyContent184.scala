package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent184 extends StObject {
  
  var parameters: `181`
  
  var requestBody: Content184
}
object RequestBodyContent184 {
  
  inline def apply(parameters: `181`, requestBody: Content184): RequestBodyContent184 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent184]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent184] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `181`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content184): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
