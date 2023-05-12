package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content71304 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200Content71304`
}
object Responses200Content71304 {
  
  inline def apply(parameters: QueryPage, responses: `200Content71304`): Responses200Content71304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content71304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content71304] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content71304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
