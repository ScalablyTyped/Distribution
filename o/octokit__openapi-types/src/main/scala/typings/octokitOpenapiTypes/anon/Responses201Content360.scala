package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content360 extends StObject {
  
  var parameters: `165`
  
  var responses: `201Content360`
}
object Responses201Content360 {
  
  inline def apply(parameters: `165`, responses: `201Content360`): Responses201Content360 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content360]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content360] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content360`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
