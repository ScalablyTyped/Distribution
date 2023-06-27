package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content44 extends StObject {
  
  var responses: `200Content44`
}
object Responses200Content44 {
  
  inline def apply(responses: `200Content44`): Responses200Content44 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content44]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content44] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content44`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
