package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content368 extends StObject {
  
  var parameters: `27`
  
  var responses: `200Content368`
}
object Responses200Content368 {
  
  inline def apply(parameters: `27`, responses: `200Content368`): Responses200Content368 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content368]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content368] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `27`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content368`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
