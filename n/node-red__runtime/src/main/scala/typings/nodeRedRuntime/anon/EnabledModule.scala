package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledModule extends StObject {
  
  var enabled: Boolean
  
  var module: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object EnabledModule {
  
  inline def apply(enabled: Boolean, module: String): EnabledModule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledModule]
  }
  
  extension [Self <: EnabledModule](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
