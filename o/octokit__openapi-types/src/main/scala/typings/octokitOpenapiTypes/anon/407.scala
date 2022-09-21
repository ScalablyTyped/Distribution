package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `407` extends StObject {
  
  /** @enum {string} */
  var status: js.UndefOr[enabled | disabled] = js.undefined
}
object `407` {
  
  inline def apply(): `407` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`407`]
  }
  
  extension [Self <: `407`](x: Self) {
    
    inline def setStatus(value: enabled | disabled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
