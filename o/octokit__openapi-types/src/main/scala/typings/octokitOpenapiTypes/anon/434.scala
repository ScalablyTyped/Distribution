package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_name_pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `434` extends StObject {
  
  var parameters: js.UndefOr[Negate] = js.undefined
  
  /** @enum {string} */
  var `type`: branch_name_pattern
}
object `434` {
  
  inline def apply(): `434` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("branch_name_pattern")
    __obj.asInstanceOf[`434`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `434`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Negate): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: branch_name_pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
