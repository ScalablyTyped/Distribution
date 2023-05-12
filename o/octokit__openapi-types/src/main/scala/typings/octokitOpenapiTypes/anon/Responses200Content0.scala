package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content0 extends StObject {
  
  var responses: `200Content0`
}
object Responses200Content0 {
  
  inline def apply(responses: `200Content0`): Responses200Content0 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content0] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content0`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
