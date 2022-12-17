package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304Unknown extends StObject {
  
  var responses: `304Unknown`
}
object Responses304Unknown {
  
  inline def apply(responses: `304Unknown`): Responses304Unknown = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304Unknown]
  }
  
  extension [Self <: Responses304Unknown](x: Self) {
    
    inline def setResponses(value: `304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
