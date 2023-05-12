package typings.photoshop.domCoreModulesMod

import typings.photoshop.photoshopStrings.pluginInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPluginInfoResult extends StObject {
  
  var _obj: pluginInfo
  
  var batchPlayCount: Double
  
  var isFirstParty: Boolean
  
  var launchTimeImpact: Double
  
  var mainThreadTimeOutCount: Double
  
  var mainThreadUnhandledExceptionCount: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  var numberOfPendingMainThreadTasks: Double
  
  var path: js.UndefOr[String] = js.undefined
  
  var pendingDeferralCount: Double
  
  var pluginLoadTime: Double
  
  var usedMainThreadTime: Double
  
  var v8HeapSize: Double
  
  var version: js.UndefOr[String] = js.undefined
}
object GetPluginInfoResult {
  
  inline def apply(
    batchPlayCount: Double,
    isFirstParty: Boolean,
    launchTimeImpact: Double,
    mainThreadTimeOutCount: Double,
    mainThreadUnhandledExceptionCount: Double,
    numberOfPendingMainThreadTasks: Double,
    pendingDeferralCount: Double,
    pluginLoadTime: Double,
    usedMainThreadTime: Double,
    v8HeapSize: Double
  ): GetPluginInfoResult = {
    val __obj = js.Dynamic.literal(_obj = "pluginInfo", batchPlayCount = batchPlayCount.asInstanceOf[js.Any], isFirstParty = isFirstParty.asInstanceOf[js.Any], launchTimeImpact = launchTimeImpact.asInstanceOf[js.Any], mainThreadTimeOutCount = mainThreadTimeOutCount.asInstanceOf[js.Any], mainThreadUnhandledExceptionCount = mainThreadUnhandledExceptionCount.asInstanceOf[js.Any], numberOfPendingMainThreadTasks = numberOfPendingMainThreadTasks.asInstanceOf[js.Any], pendingDeferralCount = pendingDeferralCount.asInstanceOf[js.Any], pluginLoadTime = pluginLoadTime.asInstanceOf[js.Any], usedMainThreadTime = usedMainThreadTime.asInstanceOf[js.Any], v8HeapSize = v8HeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPluginInfoResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPluginInfoResult] (val x: Self) extends AnyVal {
    
    inline def setBatchPlayCount(value: Double): Self = StObject.set(x, "batchPlayCount", value.asInstanceOf[js.Any])
    
    inline def setIsFirstParty(value: Boolean): Self = StObject.set(x, "isFirstParty", value.asInstanceOf[js.Any])
    
    inline def setLaunchTimeImpact(value: Double): Self = StObject.set(x, "launchTimeImpact", value.asInstanceOf[js.Any])
    
    inline def setMainThreadTimeOutCount(value: Double): Self = StObject.set(x, "mainThreadTimeOutCount", value.asInstanceOf[js.Any])
    
    inline def setMainThreadUnhandledExceptionCount(value: Double): Self = StObject.set(x, "mainThreadUnhandledExceptionCount", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumberOfPendingMainThreadTasks(value: Double): Self = StObject.set(x, "numberOfPendingMainThreadTasks", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPendingDeferralCount(value: Double): Self = StObject.set(x, "pendingDeferralCount", value.asInstanceOf[js.Any])
    
    inline def setPluginLoadTime(value: Double): Self = StObject.set(x, "pluginLoadTime", value.asInstanceOf[js.Any])
    
    inline def setUsedMainThreadTime(value: Double): Self = StObject.set(x, "usedMainThreadTime", value.asInstanceOf[js.Any])
    
    inline def setV8HeapSize(value: Double): Self = StObject.set(x, "v8HeapSize", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_obj(value: pluginInfo): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
  }
}
