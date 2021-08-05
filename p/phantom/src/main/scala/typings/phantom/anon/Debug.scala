package typings.phantom.anon

import typings.phantom.mod.winstonLeveledLogMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  var debug: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  
  var error: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  
  var info: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  
  var warn: js.UndefOr[winstonLeveledLogMethod] = js.undefined
}
object Debug {
  
  inline def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  
  extension [Self <: Debug](x: Self) {
    
    inline def setDebug(value: winstonLeveledLogMethod): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: winstonLeveledLogMethod): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: winstonLeveledLogMethod): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setWarn(value: winstonLeveledLogMethod): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
