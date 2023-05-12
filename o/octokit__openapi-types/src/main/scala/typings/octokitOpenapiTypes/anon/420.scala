package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `420` extends StObject {
  
  /** @enum {string} */
  var status: js.UndefOr[enabled | disabled] = js.undefined
}
object `420` {
  
  inline def apply(): `420` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`420`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `420`] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: enabled | disabled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
