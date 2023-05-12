package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersType extends StObject {
  
  var parameters: js.UndefOr[Updateallowsfetchandmerge] = js.undefined
  
  /** @enum {string} */
  var `type`: update
}
object ParametersType {
  
  inline def apply(): ParametersType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[ParametersType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersType] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Updateallowsfetchandmerge): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
