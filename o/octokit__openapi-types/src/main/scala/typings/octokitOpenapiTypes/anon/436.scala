package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.required_status_checks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `436` extends StObject {
  
  var parameters: js.UndefOr[Strictrequiredstatuscheckspolicy] = js.undefined
  
  /** @enum {string} */
  var `type`: required_status_checks
}
object `436` {
  
  inline def apply(): `436` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("required_status_checks")
    __obj.asInstanceOf[`436`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `436`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Strictrequiredstatuscheckspolicy): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: required_status_checks): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
