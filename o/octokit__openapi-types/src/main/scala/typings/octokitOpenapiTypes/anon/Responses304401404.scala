package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304401404 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `304401404`
}
object Responses304401404 {
  
  inline def apply(parameters: QueryPage, responses: `304401404`): Responses304401404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304401404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304401404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
