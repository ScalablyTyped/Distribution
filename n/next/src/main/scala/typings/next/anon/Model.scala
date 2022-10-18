package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var model: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var vendor: js.UndefOr[String] = js.undefined
}
object Model {
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
