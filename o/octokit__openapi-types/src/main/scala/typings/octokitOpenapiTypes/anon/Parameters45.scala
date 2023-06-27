package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters45 extends StObject {
  
  var parameters: `45`
  
  var responses: `200304401`
}
object Parameters45 {
  
  inline def apply(parameters: `45`, responses: `200304401`): Parameters45 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters45]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters45] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `45`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
