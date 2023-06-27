package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses728 extends StObject {
  
  var parameters: `639`
  
  var responses: `728`
}
object Responses728 {
  
  inline def apply(parameters: `639`, responses: `728`): Responses728 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses728]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses728] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `728`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
