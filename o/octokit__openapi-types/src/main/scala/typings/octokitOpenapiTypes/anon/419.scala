package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `419` extends StObject {
  
  var responses: `200Content29404`
}
object `419` {
  
  inline def apply(responses: `200Content29404`): `419` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`419`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `419`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content29404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
