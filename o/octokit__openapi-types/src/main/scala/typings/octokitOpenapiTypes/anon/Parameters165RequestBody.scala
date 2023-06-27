package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters165RequestBody extends StObject {
  
  var parameters: `165`
  
  var requestBody: js.UndefOr[Content65] = js.undefined
}
object Parameters165RequestBody {
  
  inline def apply(parameters: `165`): Parameters165RequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters165RequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters165RequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content65): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
