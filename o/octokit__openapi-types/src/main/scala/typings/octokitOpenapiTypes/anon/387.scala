package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `387` extends StObject {
  
  /** @enum {string} */
  var status: js.UndefOr[enabled | disabled] = js.undefined
}
object `387` {
  
  inline def apply(): `387` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`387`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `387`] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: enabled | disabled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
