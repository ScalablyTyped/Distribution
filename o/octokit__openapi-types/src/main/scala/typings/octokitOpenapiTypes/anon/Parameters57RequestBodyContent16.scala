package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters57RequestBodyContent16 extends StObject {
  
  var parameters: `57`
  
  var requestBody: Content16
}
object Parameters57RequestBodyContent16 {
  
  inline def apply(parameters: `57`, requestBody: Content16): Parameters57RequestBodyContent16 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters57RequestBodyContent16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters57RequestBodyContent16] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content16): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
