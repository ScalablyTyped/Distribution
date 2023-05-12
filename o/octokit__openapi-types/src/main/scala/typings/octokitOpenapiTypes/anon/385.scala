package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `385` extends StObject {
  
  var responses: `200Content83`
}
object `385` {
  
  inline def apply(responses: `200Content83`): `385` = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[`385`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `385`] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200Content83`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
