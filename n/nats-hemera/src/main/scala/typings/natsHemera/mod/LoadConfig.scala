package typings.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadConfig extends StObject {
  
  var checkPolicy: js.UndefOr[Boolean] = js.undefined
  
  var policy: js.UndefOr[LoadPolicyConfig] = js.undefined
  
  var process: js.UndefOr[LoadProcessConfig] = js.undefined
  
  var shouldCrash: js.UndefOr[Boolean] = js.undefined
}
object LoadConfig {
  
  inline def apply(): LoadConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadConfig] (val x: Self) extends AnyVal {
    
    inline def setCheckPolicy(value: Boolean): Self = StObject.set(x, "checkPolicy", value.asInstanceOf[js.Any])
    
    inline def setCheckPolicyUndefined: Self = StObject.set(x, "checkPolicy", js.undefined)
    
    inline def setPolicy(value: LoadPolicyConfig): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setProcess(value: LoadProcessConfig): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setShouldCrash(value: Boolean): Self = StObject.set(x, "shouldCrash", value.asInstanceOf[js.Any])
    
    inline def setShouldCrashUndefined: Self = StObject.set(x, "shouldCrash", js.undefined)
  }
}
