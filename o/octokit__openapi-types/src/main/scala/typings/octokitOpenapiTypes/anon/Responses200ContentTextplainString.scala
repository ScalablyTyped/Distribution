package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentTextplainString extends StObject {
  
  var responses: `200ContentTextplainString`
}
object Responses200ContentTextplainString {
  
  inline def apply(responses: `200ContentTextplainString`): Responses200ContentTextplainString = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentTextplainString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentTextplainString] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200ContentTextplainString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
