package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDirEnabled extends StObject {
  
  var appDirEnabled: Boolean
  
  var buildId: String
  
  var exportRuntime: js.UndefOr[Boolean] = js.undefined
  
  var isDevFallback: js.UndefOr[Boolean] = js.undefined
  
  var rewrites: AfterFiles
}
object AppDirEnabled {
  
  inline def apply(appDirEnabled: Boolean, buildId: String, rewrites: AfterFiles): AppDirEnabled = {
    val __obj = js.Dynamic.literal(appDirEnabled = appDirEnabled.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDirEnabled]
  }
  
  extension [Self <: AppDirEnabled](x: Self) {
    
    inline def setAppDirEnabled(value: Boolean): Self = StObject.set(x, "appDirEnabled", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setExportRuntime(value: Boolean): Self = StObject.set(x, "exportRuntime", value.asInstanceOf[js.Any])
    
    inline def setExportRuntimeUndefined: Self = StObject.set(x, "exportRuntime", js.undefined)
    
    inline def setIsDevFallback(value: Boolean): Self = StObject.set(x, "isDevFallback", value.asInstanceOf[js.Any])
    
    inline def setIsDevFallbackUndefined: Self = StObject.set(x, "isDevFallback", js.undefined)
    
    inline def setRewrites(value: AfterFiles): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
  }
}
