package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403500 extends StObject {
  
  var parameters: `154`
  
  var responses: `403500`
}
object Responses403500 {
  
  inline def apply(parameters: `154`, responses: `403500`): Responses403500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403500] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `154`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
