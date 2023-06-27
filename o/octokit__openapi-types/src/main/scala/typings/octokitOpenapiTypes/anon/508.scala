package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.non_fast_forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `508` extends StObject {
  
  /** @enum {string} */
  var `type`: non_fast_forward
}
object `508` {
  
  inline def apply(): `508` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("non_fast_forward")
    __obj.asInstanceOf[`508`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `508`] (val x: Self) extends AnyVal {
    
    inline def setType(value: non_fast_forward): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
