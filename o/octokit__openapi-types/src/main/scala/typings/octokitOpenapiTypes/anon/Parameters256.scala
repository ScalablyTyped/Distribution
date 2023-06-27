package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters256 extends StObject {
  
  var parameters: `256`
  
  var responses: `200ContentApplicationjsonChecksuites`
}
object Parameters256 {
  
  inline def apply(parameters: `256`, responses: `200ContentApplicationjsonChecksuites`): Parameters256 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters256]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters256] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `256`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonChecksuites`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
