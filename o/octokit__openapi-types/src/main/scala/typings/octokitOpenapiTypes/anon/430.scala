package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.non_fast_forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `430` extends StObject {
  
  /** @enum {string} */
  var `type`: non_fast_forward
}
object `430` {
  
  inline def apply(): `430` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("non_fast_forward")
    __obj.asInstanceOf[`430`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `430`] (val x: Self) extends AnyVal {
    
    inline def setType(value: non_fast_forward): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
