package typings.openfin

import org.scalablytyped.runtime.Instantiable1
import typings.node.eventsMod.EventEmitter
import typings.openfin.anon.Alias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wireMod {
  
  @JSImport("openfin/_v2/transport/wire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait READY_STATE extends StObject
  @JSImport("openfin/_v2/transport/wire", "READY_STATE")
  @js.native
  object READY_STATE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[READY_STATE & Double] = js.native
    
    @js.native
    sealed trait CLOSED
      extends StObject
         with READY_STATE
    /* 3 */ val CLOSED: typings.openfin.wireMod.READY_STATE.CLOSED & Double = js.native
    
    @js.native
    sealed trait CLOSING
      extends StObject
         with READY_STATE
    /* 2 */ val CLOSING: typings.openfin.wireMod.READY_STATE.CLOSING & Double = js.native
    
    @js.native
    sealed trait CONNECTING
      extends StObject
         with READY_STATE
    /* 0 */ val CONNECTING: typings.openfin.wireMod.READY_STATE.CONNECTING & Double = js.native
    
    @js.native
    sealed trait OPEN
      extends StObject
         with READY_STATE
    /* 1 */ val OPEN: typings.openfin.wireMod.READY_STATE.OPEN & Double = js.native
  }
  
  inline def isExistingConnectConfig(config: Any): /* is openfin.openfin/_v2/transport/wire.ExistingConnectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExistingConnectConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.ExistingConnectConfig */ Boolean]
  
  inline def isExternalConfig(config: ConnectConfig): /* is openfin.openfin/_v2/transport/wire.ExternalConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.ExternalConfig */ Boolean]
  
  inline def isInternalConnectConfig(config: Any): /* is openfin.openfin/_v2/transport/wire.InternalConnectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternalConnectConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.InternalConnectConfig */ Boolean]
  
  inline def isNewConnectConfig(config: Any): /* is openfin.openfin/_v2/transport/wire.NewConnectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewConnectConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.NewConnectConfig */ Boolean]
  
  inline def isPortDiscoveryConfig(config: Any): /* is openfin.openfin/_v2/transport/wire.PortDiscoveryConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPortDiscoveryConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.PortDiscoveryConfig */ Boolean]
  
  trait BaseConfig extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var appAssets: js.UndefOr[js.Array[Alias]] = js.undefined
    
    var assetsUrl: js.UndefOr[String] = js.undefined
    
    var client: js.UndefOr[Any] = js.undefined
    
    var customItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    var devToolsPort: js.UndefOr[Double] = js.undefined
    
    var installerUI: js.UndefOr[Boolean] = js.undefined
    
    var licenseKey: js.UndefOr[String] = js.undefined
    
    var lrsUrl: js.UndefOr[String] = js.undefined
    
    var manifestUrl: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonPersistent: js.UndefOr[Boolean] = js.undefined
    
    var runtime: js.UndefOr[RuntimeConfig] = js.undefined
    
    var runtimeClient: js.UndefOr[Boolean] = js.undefined
    
    var services: js.UndefOr[js.Array[ServiceConfig]] = js.undefined
    
    var startupApp: js.UndefOr[Any] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object BaseConfig {
    
    inline def apply(): BaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseConfig]
    }
    
    extension [Self <: BaseConfig](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAppAssets(value: js.Array[Alias]): Self = StObject.set(x, "appAssets", value.asInstanceOf[js.Any])
      
      inline def setAppAssetsUndefined: Self = StObject.set(x, "appAssets", js.undefined)
      
      inline def setAppAssetsVarargs(value: Alias*): Self = StObject.set(x, "appAssets", js.Array(value*))
      
      inline def setAssetsUrl(value: String): Self = StObject.set(x, "assetsUrl", value.asInstanceOf[js.Any])
      
      inline def setAssetsUrlUndefined: Self = StObject.set(x, "assetsUrl", js.undefined)
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setCustomItems(value: js.Array[Any]): Self = StObject.set(x, "customItems", value.asInstanceOf[js.Any])
      
      inline def setCustomItemsUndefined: Self = StObject.set(x, "customItems", js.undefined)
      
      inline def setCustomItemsVarargs(value: Any*): Self = StObject.set(x, "customItems", js.Array(value*))
      
      inline def setDevToolsPort(value: Double): Self = StObject.set(x, "devToolsPort", value.asInstanceOf[js.Any])
      
      inline def setDevToolsPortUndefined: Self = StObject.set(x, "devToolsPort", js.undefined)
      
      inline def setInstallerUI(value: Boolean): Self = StObject.set(x, "installerUI", value.asInstanceOf[js.Any])
      
      inline def setInstallerUIUndefined: Self = StObject.set(x, "installerUI", js.undefined)
      
      inline def setLicenseKey(value: String): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
      
      inline def setLicenseKeyUndefined: Self = StObject.set(x, "licenseKey", js.undefined)
      
      inline def setLrsUrl(value: String): Self = StObject.set(x, "lrsUrl", value.asInstanceOf[js.Any])
      
      inline def setLrsUrlUndefined: Self = StObject.set(x, "lrsUrl", js.undefined)
      
      inline def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
      
      inline def setManifestUrlUndefined: Self = StObject.set(x, "manifestUrl", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonPersistent(value: Boolean): Self = StObject.set(x, "nonPersistent", value.asInstanceOf[js.Any])
      
      inline def setNonPersistentUndefined: Self = StObject.set(x, "nonPersistent", js.undefined)
      
      inline def setRuntime(value: RuntimeConfig): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeClient(value: Boolean): Self = StObject.set(x, "runtimeClient", value.asInstanceOf[js.Any])
      
      inline def setRuntimeClientUndefined: Self = StObject.set(x, "runtimeClient", js.undefined)
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServices(value: js.Array[ServiceConfig]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      inline def setServicesVarargs(value: ServiceConfig*): Self = StObject.set(x, "services", js.Array(value*))
      
      inline def setStartupApp(value: Any): Self = StObject.set(x, "startupApp", value.asInstanceOf[js.Any])
      
      inline def setStartupAppUndefined: Self = StObject.set(x, "startupApp", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait ConfigWithRuntime
    extends StObject
       with BaseConfig {
    
    @JSName("runtime")
    var runtime_ConfigWithRuntime: RuntimeConfig
  }
  object ConfigWithRuntime {
    
    inline def apply(runtime: RuntimeConfig): ConfigWithRuntime = {
      val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigWithRuntime]
    }
    
    extension [Self <: ConfigWithRuntime](x: Self) {
      
      inline def setRuntime(value: RuntimeConfig): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigWithUuid
    extends StObject
       with BaseConfig {
    
    @JSName("uuid")
    var uuid_ConfigWithUuid: String
  }
  object ConfigWithUuid {
    
    inline def apply(uuid: String): ConfigWithUuid = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigWithUuid]
    }
    
    extension [Self <: ConfigWithUuid](x: Self) {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.wireMod.ExistingConnectConfig
    - typings.openfin.wireMod.NewConnectConfig
    - typings.openfin.wireMod.ExternalConfig
  */
  trait ConnectConfig extends StObject
  object ConnectConfig {
    
    inline def ExistingConnectConfig(address: String, uuid: String): typings.openfin.wireMod.ExistingConnectConfig = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.ExistingConnectConfig]
    }
    
    inline def ExternalConfig(manifestUrl: String): typings.openfin.wireMod.ExternalConfig = {
      val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.ExternalConfig]
    }
    
    inline def NewConnectConfig(uuid: String): typings.openfin.wireMod.NewConnectConfig = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.NewConnectConfig]
    }
  }
  
  trait ExistingConnectConfig
    extends StObject
       with ConfigWithUuid
       with ConnectConfig
       with InternalConnectConfig {
    
    @JSName("address")
    var address_ExistingConnectConfig: String
  }
  object ExistingConnectConfig {
    
    inline def apply(address: String, uuid: String): ExistingConnectConfig = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExistingConnectConfig]
    }
    
    extension [Self <: ExistingConnectConfig](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalConfig
    extends StObject
       with BaseConfig
       with ConnectConfig {
    
    @JSName("manifestUrl")
    var manifestUrl_ExternalConfig: String
  }
  object ExternalConfig {
    
    inline def apply(manifestUrl: String): ExternalConfig = {
      val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalConfig]
    }
    
    extension [Self <: ExternalConfig](x: Self) {
      
      inline def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.wireMod.ExistingConnectConfig
    - typings.openfin.wireMod.NewConnectConfig
  */
  trait InternalConnectConfig extends StObject
  object InternalConnectConfig {
    
    inline def ExistingConnectConfig(address: String, uuid: String): typings.openfin.wireMod.ExistingConnectConfig = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.ExistingConnectConfig]
    }
    
    inline def NewConnectConfig(uuid: String): typings.openfin.wireMod.NewConnectConfig = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.NewConnectConfig]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.wireMod.BaseConfig because Already inherited
  - typings.openfin.wireMod.ConfigWithRuntime because var conflicts: address, appAssets, assetsUrl, client, customItems, devToolsPort, installerUI, licenseKey, lrsUrl, manifestUrl, name, nonPersistent, runtime, runtimeClient, services, startupApp, timeout, uuid. Inlined  */ trait NewConnectConfig
    extends StObject
       with ConfigWithUuid
       with ConnectConfig
       with InternalConnectConfig
  object NewConnectConfig {
    
    inline def apply(uuid: String): NewConnectConfig = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewConnectConfig]
    }
  }
  
  type PortDiscoveryConfig = (ExternalConfig & ConfigWithRuntime) | NewConnectConfig
  
  trait RuntimeConfig extends StObject {
    
    var arguments: js.UndefOr[String] = js.undefined
    
    var fallbackVersion: js.UndefOr[String] = js.undefined
    
    var rvmDir: js.UndefOr[String] = js.undefined
    
    var securityRealm: js.UndefOr[String] = js.undefined
    
    var verboseLogging: js.UndefOr[Boolean] = js.undefined
    
    var version: String
  }
  object RuntimeConfig {
    
    inline def apply(version: String): RuntimeConfig = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeConfig]
    }
    
    extension [Self <: RuntimeConfig](x: Self) {
      
      inline def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setFallbackVersion(value: String): Self = StObject.set(x, "fallbackVersion", value.asInstanceOf[js.Any])
      
      inline def setFallbackVersionUndefined: Self = StObject.set(x, "fallbackVersion", js.undefined)
      
      inline def setRvmDir(value: String): Self = StObject.set(x, "rvmDir", value.asInstanceOf[js.Any])
      
      inline def setRvmDirUndefined: Self = StObject.set(x, "rvmDir", js.undefined)
      
      inline def setSecurityRealm(value: String): Self = StObject.set(x, "securityRealm", value.asInstanceOf[js.Any])
      
      inline def setSecurityRealmUndefined: Self = StObject.set(x, "securityRealm", js.undefined)
      
      inline def setVerboseLogging(value: Boolean): Self = StObject.set(x, "verboseLogging", value.asInstanceOf[js.Any])
      
      inline def setVerboseLoggingUndefined: Self = StObject.set(x, "verboseLogging", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceConfig extends StObject {
    
    var manifestUrl: String
    
    var name: String
  }
  object ServiceConfig {
    
    inline def apply(manifestUrl: String, name: String): ServiceConfig = {
      val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    extension [Self <: ServiceConfig](x: Self) {
      
      inline def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wire extends EventEmitter {
    
    def connect(address: String): js.Promise[Any] = js.native
    
    def connectSync(): Any = js.native
    
    def send(data: Any): js.Promise[Any] = js.native
    
    def shutdown(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait WireConstructor
    extends StObject
       with Instantiable1[/* onmessage */ js.Function1[/* data */ Any, Unit], Wire]
}
