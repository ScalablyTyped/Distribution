package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.required_linear_history
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `502` extends StObject {
  
  /** @enum {string} */
  var `type`: required_linear_history
}
object `502` {
  
  inline def apply(): `502` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("required_linear_history")
    __obj.asInstanceOf[`502`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `502`] (val x: Self) extends AnyVal {
    
    inline def setType(value: required_linear_history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
