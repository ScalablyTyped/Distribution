package typings.mparticleWebSdk.mod

import typings.mparticleWebSdk.mparticleWebSdkInts.`1`
import typings.mparticleWebSdk.mparticleWebSdkInts.`2`
import typings.mparticleWebSdk.mparticleWebSdkStrings.none
import typings.mparticleWebSdk.mparticleWebSdkStrings.verbose
import typings.mparticleWebSdk.mparticleWebSdkStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MPConfiguration extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  var appName: js.UndefOr[String] = js.undefined
  
  var appVersion: js.UndefOr[String] = js.undefined
  
  var cookieDomain: js.UndefOr[String] = js.undefined
  
  var customFlags: js.UndefOr[SDKEventCustomFlags] = js.undefined
  
  var dataPlan: js.UndefOr[DataPlanConfig] = js.undefined
  
  var deviceId: js.UndefOr[String] = js.undefined
  
  var identifyRequest: js.UndefOr[IdentifyRequest] = js.undefined
  
  var identityCallback: js.UndefOr[IdentityCallback] = js.undefined
  
  var isDevelopmentMode: js.UndefOr[Boolean] = js.undefined
  
  var logLevel: js.UndefOr[verbose | warning | none] = js.undefined
  
  var logger: js.UndefOr[Logger] = js.undefined
  
  var maxCookieSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @warning only change minWebviewBridgeVersion if you are absolutely sure you know what you are doing
    */
  var minWebviewBridgeVersion: js.UndefOr[`1` | `2`] = js.undefined
  
  var onCreateBatch: js.UndefOr[typings.mparticleWebSdk.mod.onCreateBatch] = js.undefined
  
  /**
    * @warning only change requiredWebviewBridgeName if you are absolutely sure you know what you are doing
    */
  var requiredWebviewBridgeName: js.UndefOr[String] = js.undefined
  
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  
  var sideloadedKits: js.UndefOr[js.Array[MPForwarder]] = js.undefined
  
  var useCookieStorage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @warning only change workspaceToken if you are absolutely sure you know what you are doing
    */
  var workspaceToken: js.UndefOr[String] = js.undefined
}
object MPConfiguration {
  
  inline def apply(): MPConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MPConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MPConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
    
    inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
    
    inline def setCustomFlags(value: SDKEventCustomFlags): Self = StObject.set(x, "customFlags", value.asInstanceOf[js.Any])
    
    inline def setCustomFlagsUndefined: Self = StObject.set(x, "customFlags", js.undefined)
    
    inline def setDataPlan(value: DataPlanConfig): Self = StObject.set(x, "dataPlan", value.asInstanceOf[js.Any])
    
    inline def setDataPlanUndefined: Self = StObject.set(x, "dataPlan", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setIdentifyRequest(value: IdentifyRequest): Self = StObject.set(x, "identifyRequest", value.asInstanceOf[js.Any])
    
    inline def setIdentifyRequestUndefined: Self = StObject.set(x, "identifyRequest", js.undefined)
    
    inline def setIdentityCallback(value: /* result */ IdentityResult => Unit): Self = StObject.set(x, "identityCallback", js.Any.fromFunction1(value))
    
    inline def setIdentityCallbackUndefined: Self = StObject.set(x, "identityCallback", js.undefined)
    
    inline def setIsDevelopmentMode(value: Boolean): Self = StObject.set(x, "isDevelopmentMode", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopmentModeUndefined: Self = StObject.set(x, "isDevelopmentMode", js.undefined)
    
    inline def setLogLevel(value: verbose | warning | none): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxCookieSize(value: Double): Self = StObject.set(x, "maxCookieSize", value.asInstanceOf[js.Any])
    
    inline def setMaxCookieSizeUndefined: Self = StObject.set(x, "maxCookieSize", js.undefined)
    
    inline def setMinWebviewBridgeVersion(value: `1` | `2`): Self = StObject.set(x, "minWebviewBridgeVersion", value.asInstanceOf[js.Any])
    
    inline def setMinWebviewBridgeVersionUndefined: Self = StObject.set(x, "minWebviewBridgeVersion", js.undefined)
    
    inline def setOnCreateBatch(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Batch */ /* batch */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Batch */ Any
    ): Self = StObject.set(x, "onCreateBatch", js.Any.fromFunction1(value))
    
    inline def setOnCreateBatchUndefined: Self = StObject.set(x, "onCreateBatch", js.undefined)
    
    inline def setRequiredWebviewBridgeName(value: String): Self = StObject.set(x, "requiredWebviewBridgeName", value.asInstanceOf[js.Any])
    
    inline def setRequiredWebviewBridgeNameUndefined: Self = StObject.set(x, "requiredWebviewBridgeName", js.undefined)
    
    inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    inline def setSideloadedKits(value: js.Array[MPForwarder]): Self = StObject.set(x, "sideloadedKits", value.asInstanceOf[js.Any])
    
    inline def setSideloadedKitsUndefined: Self = StObject.set(x, "sideloadedKits", js.undefined)
    
    inline def setSideloadedKitsVarargs(value: MPForwarder*): Self = StObject.set(x, "sideloadedKits", js.Array(value*))
    
    inline def setUseCookieStorage(value: Boolean): Self = StObject.set(x, "useCookieStorage", value.asInstanceOf[js.Any])
    
    inline def setUseCookieStorageUndefined: Self = StObject.set(x, "useCookieStorage", js.undefined)
    
    inline def setWorkspaceToken(value: String): Self = StObject.set(x, "workspaceToken", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceTokenUndefined: Self = StObject.set(x, "workspaceToken", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
