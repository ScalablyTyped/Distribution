package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters101 extends StObject {
  
  var parameters: `101`
  
  var responses: `200HeadersLink`
}
object Parameters101 {
  
  inline def apply(parameters: `101`, responses: `200HeadersLink`): Parameters101 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters101]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters101] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `101`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
