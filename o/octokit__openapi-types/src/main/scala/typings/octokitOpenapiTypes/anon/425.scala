package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.required_linear_history
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `425` extends StObject {
  
  /** @enum {string} */
  var `type`: required_linear_history
}
object `425` {
  
  inline def apply(): `425` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("required_linear_history")
    __obj.asInstanceOf[`425`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `425`] (val x: Self) extends AnyVal {
    
    inline def setType(value: required_linear_history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
