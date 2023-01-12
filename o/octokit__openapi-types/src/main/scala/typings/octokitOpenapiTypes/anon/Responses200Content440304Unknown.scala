package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content440304Unknown extends StObject {
  
  var responses: `200Content440304Unknown`
}
object Responses200Content440304Unknown {
  
  inline def apply(responses: `200Content440304Unknown`): Responses200Content440304Unknown = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content440304Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content440304Unknown] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content440304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
