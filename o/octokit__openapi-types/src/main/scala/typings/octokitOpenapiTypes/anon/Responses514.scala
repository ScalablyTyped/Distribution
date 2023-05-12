package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses514 extends StObject {
  
  var parameters: `496`
  
  var responses: `514`
}
object Responses514 {
  
  inline def apply(parameters: `496`, responses: `514`): Responses514 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses514]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses514] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `514`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
