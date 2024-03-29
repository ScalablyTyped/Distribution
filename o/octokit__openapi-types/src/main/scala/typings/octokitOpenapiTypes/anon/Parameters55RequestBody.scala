package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters55RequestBody extends StObject {
  
  var parameters: `55`
  
  var requestBody: js.UndefOr[Content65] = js.undefined
}
object Parameters55RequestBody {
  
  inline def apply(parameters: `55`): Parameters55RequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters55RequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters55RequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content65): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
