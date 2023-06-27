package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters112 extends StObject {
  
  var parameters: `112`
  
  var responses: `113`
}
object Parameters112 {
  
  inline def apply(parameters: `112`, responses: `113`): Parameters112 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters112]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters112] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `112`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
