package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent648 extends StObject {
  
  var parameters: `645`
  
  var requestBody: Content648
}
object RequestBodyContent648 {
  
  inline def apply(parameters: `645`, requestBody: Content648): RequestBodyContent648 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent648]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent648] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `645`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content648): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
