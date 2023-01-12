package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientParams extends StObject {
  
  var browserName: String | Null
  
  var config: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var devtools: js.UndefOr[Boolean] = js.undefined
  
  var enable_global_apis: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[String] = js.undefined
  
  var globals: js.UndefOr[Any] = js.undefined
  
  var headless: js.UndefOr[Boolean] = js.undefined
  
  var output: js.UndefOr[Boolean] = js.undefined
  
  var parallel: js.UndefOr[Boolean] = js.undefined
  
  var reporter: js.UndefOr[Null] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var useAsync: js.UndefOr[Boolean] = js.undefined
}
object CreateClientParams {
  
  inline def apply(): CreateClientParams = {
    val __obj = js.Dynamic.literal(browserName = null)
    __obj.asInstanceOf[CreateClientParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClientParams] (val x: Self) extends AnyVal {
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserNameNull: Self = StObject.set(x, "browserName", null)
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    inline def setEnable_global_apis(value: Boolean): Self = StObject.set(x, "enable_global_apis", value.asInstanceOf[js.Any])
    
    inline def setEnable_global_apisUndefined: Self = StObject.set(x, "enable_global_apis", js.undefined)
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setGlobals(value: Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseAsync(value: Boolean): Self = StObject.set(x, "useAsync", value.asInstanceOf[js.Any])
    
    inline def setUseAsyncUndefined: Self = StObject.set(x, "useAsync", js.undefined)
  }
}
