package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `496` extends StObject {
  
  var responses: `200Content32404`
}
object `496` {
  
  inline def apply(responses: `200Content32404`): `496` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`496`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `496`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content32404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
