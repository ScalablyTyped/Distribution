package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403503 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `403503`
}
object Responses403503 {
  
  inline def apply(parameters: QueryPage, responses: `403503`): Responses403503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
