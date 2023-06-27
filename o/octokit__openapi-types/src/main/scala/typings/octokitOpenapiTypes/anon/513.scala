package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tag_name_pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `513` extends StObject {
  
  var parameters: js.UndefOr[Negate] = js.undefined
  
  /** @enum {string} */
  var `type`: tag_name_pattern
}
object `513` {
  
  inline def apply(): `513` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("tag_name_pattern")
    __obj.asInstanceOf[`513`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `513`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Negate): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: tag_name_pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
