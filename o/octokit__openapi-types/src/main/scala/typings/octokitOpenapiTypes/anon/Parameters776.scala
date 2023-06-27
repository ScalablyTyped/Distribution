package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters776 extends StObject {
  
  var parameters: `776`
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object Parameters776 {
  
  inline def apply(parameters: `776`, responses: `200ContentApplicationjsonCreatedatId`): Parameters776 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters776]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters776] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `776`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
