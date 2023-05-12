package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.required_status_checks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `429` extends StObject {
  
  var parameters: js.UndefOr[Requiredstatuschecks] = js.undefined
  
  /** @enum {string} */
  var `type`: required_status_checks
}
object `429` {
  
  inline def apply(): `429` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("required_status_checks")
    __obj.asInstanceOf[`429`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `429`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Requiredstatuschecks): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: required_status_checks): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
