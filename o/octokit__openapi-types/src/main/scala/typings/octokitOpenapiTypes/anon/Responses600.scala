package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses600 extends StObject {
  
  var parameters: `582`
  
  var responses: `600`
}
object Responses600 {
  
  inline def apply(parameters: `582`, responses: `600`): Responses600 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses600]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses600] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `600`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
