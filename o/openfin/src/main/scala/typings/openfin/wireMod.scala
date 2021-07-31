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
  
  @scala.inline
  def isExistingConnectConfig(config: js.Any): /* is openfin.openfin/_v2/transport/wire.ExistingConnectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExistingConnectConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.ExistingConnectConfig */ Boolean]
  
  @scala.inline
  def isExternalConfig(config: ConnectConfig): /* is openfin.openfin/_v2/transport/wire.ExternalConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.ExternalConfig */ Boolean]
  
  @scala.inline
  def isInternalConnectConfig(config: js.Any): /* is openfin.openfin/_v2/transport/wire.InternalConnectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternalConnectConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.InternalConnectConfig */ Boolean]
  
  @scala.inline
  def isNewConnectConfig(config: js.Any): /* is openfin.openfin/_v2/transport/wire.NewConnectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewConnectConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.NewConnectConfig */ Boolean]
  
  @scala.inline
  def isPortDiscoveryConfig(config: js.Any): /* is openfin.openfin/_v2/transport/wire.PortDiscoveryConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPortDiscoveryConfig")(config.asInstanceOf[js.Any]).asInstanceOf[/* is openfin.openfin/_v2/transport/wire.PortDiscoveryConfig */ Boolean]
  
  trait BaseConfig extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var appAssets: js.UndefOr[js.Array[Alias]] = js.undefined
    
    var assetsUrl: js.UndefOr[String] = js.undefined
    
    var client: js.UndefOr[js.Any] = js.undefined
    
    var customItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    
    var startupApp: js.UndefOr[js.Any] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object BaseConfig {
    
    @scala.inline
    def apply(): BaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseConfig]
    }
    
    @scala.inline
    implicit class BaseConfigMutableBuilder[Self <: BaseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setAppAssets(value: js.Array[Alias]): Self = StObject.set(x, "appAssets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppAssetsUndefined: Self = StObject.set(x, "appAssets", js.undefined)
      
      @scala.inline
      def setAppAssetsVarargs(value: Alias*): Self = StObject.set(x, "appAssets", js.Array(value :_*))
      
      @scala.inline
      def setAssetsUrl(value: String): Self = StObject.set(x, "assetsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsUrlUndefined: Self = StObject.set(x, "assetsUrl", js.undefined)
      
      @scala.inline
      def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCustomItems(value: js.Array[js.Any]): Self = StObject.set(x, "customItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomItemsUndefined: Self = StObject.set(x, "customItems", js.undefined)
      
      @scala.inline
      def setCustomItemsVarargs(value: js.Any*): Self = StObject.set(x, "customItems", js.Array(value :_*))
      
      @scala.inline
      def setDevToolsPort(value: Double): Self = StObject.set(x, "devToolsPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevToolsPortUndefined: Self = StObject.set(x, "devToolsPort", js.undefined)
      
      @scala.inline
      def setInstallerUI(value: Boolean): Self = StObject.set(x, "installerUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallerUIUndefined: Self = StObject.set(x, "installerUI", js.undefined)
      
      @scala.inline
      def setLicenseKey(value: String): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseKeyUndefined: Self = StObject.set(x, "licenseKey", js.undefined)
      
      @scala.inline
      def setLrsUrl(value: String): Self = StObject.set(x, "lrsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLrsUrlUndefined: Self = StObject.set(x, "lrsUrl", js.undefined)
      
      @scala.inline
      def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUrlUndefined: Self = StObject.set(x, "manifestUrl", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonPersistent(value: Boolean): Self = StObject.set(x, "nonPersistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonPersistentUndefined: Self = StObject.set(x, "nonPersistent", js.undefined)
      
      @scala.inline
      def setRuntime(value: RuntimeConfig): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeClient(value: Boolean): Self = StObject.set(x, "runtimeClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeClientUndefined: Self = StObject.set(x, "runtimeClient", js.undefined)
      
      @scala.inline
      def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      @scala.inline
      def setServices(value: js.Array[ServiceConfig]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      @scala.inline
      def setServicesVarargs(value: ServiceConfig*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      @scala.inline
      def setStartupApp(value: js.Any): Self = StObject.set(x, "startupApp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartupAppUndefined: Self = StObject.set(x, "startupApp", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait ConfigWithRuntime
    extends StObject
       with BaseConfig {
    
    @JSName("runtime")
    var runtime_ConfigWithRuntime: RuntimeConfig
  }
  object ConfigWithRuntime {
    
    @scala.inline
    def apply(runtime: RuntimeConfig): ConfigWithRuntime = {
      val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigWithRuntime]
    }
    
    @scala.inline
    implicit class ConfigWithRuntimeMutableBuilder[Self <: ConfigWithRuntime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuntime(value: RuntimeConfig): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigWithUuid
    extends StObject
       with BaseConfig {
    
    @JSName("uuid")
    var uuid_ConfigWithUuid: String
  }
  object ConfigWithUuid {
    
    @scala.inline
    def apply(uuid: String): ConfigWithUuid = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigWithUuid]
    }
    
    @scala.inline
    implicit class ConfigWithUuidMutableBuilder[Self <: ConfigWithUuid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.wireMod.ExistingConnectConfig
    - typings.openfin.wireMod.NewConnectConfig
    - typings.openfin.wireMod.ExternalConfig
  */
  trait ConnectConfig extends StObject
  object ConnectConfig {
    
    @scala.inline
    def ExistingConnectConfig(address: String, uuid: String): typings.openfin.wireMod.ExistingConnectConfig = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.ExistingConnectConfig]
    }
    
    @scala.inline
    def ExternalConfig(manifestUrl: String): typings.openfin.wireMod.ExternalConfig = {
      val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.ExternalConfig]
    }
    
    @scala.inline
    def NewConnectConfig(uuid: String): typings.openfin.wireMod.NewConnectConfig = {
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
    
    @scala.inline
    def apply(address: String, uuid: String): ExistingConnectConfig = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExistingConnectConfig]
    }
    
    @scala.inline
    implicit class ExistingConnectConfigMutableBuilder[Self <: ExistingConnectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(manifestUrl: String): ExternalConfig = {
      val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalConfig]
    }
    
    @scala.inline
    implicit class ExternalConfigMutableBuilder[Self <: ExternalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.wireMod.ExistingConnectConfig
    - typings.openfin.wireMod.NewConnectConfig
  */
  trait InternalConnectConfig extends StObject
  object InternalConnectConfig {
    
    @scala.inline
    def ExistingConnectConfig(address: String, uuid: String): typings.openfin.wireMod.ExistingConnectConfig = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.wireMod.ExistingConnectConfig]
    }
    
    @scala.inline
    def NewConnectConfig(uuid: String): typings.openfin.wireMod.NewConnectConfig = {
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
    
    @scala.inline
    def apply(uuid: String): NewConnectConfig = {
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
    
    @scala.inline
    def apply(version: String): RuntimeConfig = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeConfig]
    }
    
    @scala.inline
    implicit class RuntimeConfigMutableBuilder[Self <: RuntimeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setFallbackVersion(value: String): Self = StObject.set(x, "fallbackVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackVersionUndefined: Self = StObject.set(x, "fallbackVersion", js.undefined)
      
      @scala.inline
      def setRvmDir(value: String): Self = StObject.set(x, "rvmDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRvmDirUndefined: Self = StObject.set(x, "rvmDir", js.undefined)
      
      @scala.inline
      def setSecurityRealm(value: String): Self = StObject.set(x, "securityRealm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityRealmUndefined: Self = StObject.set(x, "securityRealm", js.undefined)
      
      @scala.inline
      def setVerboseLogging(value: Boolean): Self = StObject.set(x, "verboseLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseLoggingUndefined: Self = StObject.set(x, "verboseLogging", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceConfig extends StObject {
    
    var manifestUrl: String
    
    var name: String
  }
  object ServiceConfig {
    
    @scala.inline
    def apply(manifestUrl: String, name: String): ServiceConfig = {
      val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    @scala.inline
    implicit class ServiceConfigMutableBuilder[Self <: ServiceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wire extends EventEmitter {
    
    def connect(address: String): js.Promise[js.Any] = js.native
    
    def connectSync(): js.Any = js.native
    
    def send(data: js.Any): js.Promise[js.Any] = js.native
    
    def shutdown(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait WireConstructor
    extends StObject
       with Instantiable1[/* onmessage */ js.Function1[/* data */ js.Any, Unit], Wire]
}
