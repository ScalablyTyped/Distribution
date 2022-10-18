package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  /** @enum {string} */
  var status: js.UndefOr[enabled | disabled] = js.undefined
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setStatus(value: enabled | disabled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
