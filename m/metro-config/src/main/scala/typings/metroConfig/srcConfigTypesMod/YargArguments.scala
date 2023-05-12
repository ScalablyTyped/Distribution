package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YargArguments extends StObject {
  
  var assetExts: js.UndefOr[js.Array[String]] = js.undefined
  
  var config: js.UndefOr[String] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var `max-workers`: js.UndefOr[String | Double] = js.undefined
  
  var maxWorkers: js.UndefOr[String | Double] = js.undefined
  
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  
  var port: js.UndefOr[String | Double] = js.undefined
  
  var projectRoot: js.UndefOr[String] = js.undefined
  
  var `reset-cache`: js.UndefOr[Boolean] = js.undefined
  
  var resetCache: js.UndefOr[Boolean] = js.undefined
  
  var runInspectorProxy: js.UndefOr[Boolean] = js.undefined
  
  var sourceExts: js.UndefOr[js.Array[String]] = js.undefined
  
  var transformer: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var watchFolders: js.UndefOr[js.Array[String]] = js.undefined
}
object YargArguments {
  
  inline def apply(): YargArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YargArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YargArguments] (val x: Self) extends AnyVal {
    
    inline def setAssetExts(value: js.Array[String]): Self = StObject.set(x, "assetExts", value.asInstanceOf[js.Any])
    
    inline def setAssetExtsUndefined: Self = StObject.set(x, "assetExts", js.undefined)
    
    inline def setAssetExtsVarargs(value: String*): Self = StObject.set(x, "assetExts", js.Array(value*))
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def `setMax-workers`(value: String | Double): Self = StObject.set(x, "max-workers", value.asInstanceOf[js.Any])
    
    inline def `setMax-workersUndefined`: Self = StObject.set(x, "max-workers", js.undefined)
    
    inline def setMaxWorkers(value: String | Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
    
    inline def `setReset-cache`(value: Boolean): Self = StObject.set(x, "reset-cache", value.asInstanceOf[js.Any])
    
    inline def `setReset-cacheUndefined`: Self = StObject.set(x, "reset-cache", js.undefined)
    
    inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
    
    inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
    
    inline def setRunInspectorProxy(value: Boolean): Self = StObject.set(x, "runInspectorProxy", value.asInstanceOf[js.Any])
    
    inline def setRunInspectorProxyUndefined: Self = StObject.set(x, "runInspectorProxy", js.undefined)
    
    inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
    
    inline def setSourceExtsUndefined: Self = StObject.set(x, "sourceExts", js.undefined)
    
    inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
    
    inline def setTransformer(value: String): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
    
    inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
    
    inline def setWatchFoldersUndefined: Self = StObject.set(x, "watchFolders", js.undefined)
    
    inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
  }
}
