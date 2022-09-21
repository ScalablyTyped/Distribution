package typings.msportalfxMock

import typings.express.mod.Express
import typings.express.mod.RequestHandler
import typings.msportalfxMock.armManagerMod.ArmManager.Manager
import typings.msportalfxMock.armMod.ARMDefinitionConfiguration
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ProxyOptions
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ProxyServer
import typings.msportalfxMock.httpsProxyMod.HttpsProxy.ServerOptions
import typings.msportalfxMock.loggerMod.LoggerType
import typings.msportalfxMock.mockFxMod.MockFx.Configuration
import typings.msportalfxMock.mockFxMod.MockFx.Endpoints
import typings.msportalfxMock.mockFxMod.MockFx.TargetDefinition
import typings.msportalfxMock.storageMod.StorageDefinitionConfiguration
import typings.q.mod.Promise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("msportalfx-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ArmProxy {
    
    @JSImport("msportalfx-mock", "ArmProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an Arm proxy instance and setups firewal and certificates.
      *
      * @param armEndpoint The arm endpoint to proxy.
      * @param serverPort The local server port.
      * @param armManager The arm mock manager.
      * @param enablePassthrough If to enable passthrough to actual arm.
      * @return A promise that completes when local proxy is setup.
      */
    inline def create(armEndpoint: String, serverPort: Double): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: js.Function1[/* app */ Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: js.Function1[/* app */ Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Unit,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(armEndpoint: String, serverPort: Double, armManager: Manager): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: js.Function1[/* app */ Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: js.Function1[/* app */ Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      armEndpoint: String,
      serverPort: Double,
      armManager: Manager,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(armEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], armManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * Dispose local proxy
      *
      * @param armEndpoint The arm endpoint to proxy.
      * @param serverPort The local server port.
      * @param enablePassthrough If to enable passthrough to actual arm.
      * @return A promise that completes when local proxy is setup.
      */
    inline def dispose(proxy: ProxyServer): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(proxy.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  }
  
  object HttpsProxy {
    
    @JSImport("msportalfx-mock", "HttpsProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a local server running express.
      *
      * @param sslOptions The ssl options for the local https server.
      * @param targetHost The target host for the proxy.
      * @param options The local https server options.
      * @param defaultHandler The default handler for incoming requests. The default handler return 404.
      * @return A promise that when resolved will return the proxy server.
      */
    inline def createServer(sslOptions: Any, targetHost: String, options: ServerOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def createServer(
      sslOptions: Any,
      targetHost: String,
      options: ServerOptions,
      defaultHandler: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any], defaultHandler.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * Creates a local server running express with a proxy to allow forwarding call to a target host.
      *
      * @param sslOptions The ssl options for the local https server.
      * @param targetHost The target host for the proxy.
      * @param serverOptions The local https server options.
      * @param proxOptions The proxy options.
      * @return A promise that when resolved will return the proxy server.
      */
    inline def createServerWithProxy(sslOptions: Any, targetHost: String, serverOptions: ServerOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerWithProxy")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def createServerWithProxy(sslOptions: Any, targetHost: String, serverOptions: ServerOptions, proxOptions: ProxyOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerWithProxy")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], proxOptions.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
  }
  
  @JSImport("msportalfx-mock", "MockFx")
  @js.native
  /* private */ open class MockFx ()
    extends typings.msportalfxMock.mockFxMod.MockFx
  /* static members */
  object MockFx {
    
    @JSImport("msportalfx-mock", "MockFx")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of the framework
      *
      * @static
      * @param {MockFx.Configuration} config
      * @returns {Promise<MockFx>}
      * @memberof MockFx
      */
    inline def create(config: Configuration): js.Promise[typings.msportalfxMock.mockFxMod.MockFx] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.msportalfxMock.mockFxMod.MockFx]]
    
    /**
      * Returns an object with endpoints for the mock server for registering, finalizing, and obtaining the plug-in
      * code for a test.
      *
      * If using the plug-in endpoint with Portal's `patch` parameter, run the endpoint value through `encodeURI`
      *
      * @param {string} runId
      * @param {string} testId
      * @returns {MockFx.Endpoints}
      * @memberof MockFx
      */
    inline def getEndpoints(port: Double, runId: String, testId: String): Endpoints = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoints")(port.asInstanceOf[js.Any], runId.asInstanceOf[js.Any], testId.asInstanceOf[js.Any])).asInstanceOf[Endpoints]
    
    @JSImport("msportalfx-mock", "MockFx.logToConsole")
    @js.native
    def logToConsole: Any = js.native
    inline def logToConsole_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logToConsole")(x.asInstanceOf[js.Any])
    
    /**
      * Log event emitter. May subscribe to "log", "telemetry" and "error" events.
      *
      * @static
      * @type {LoggerType}
      * @memberof MockFx
      */
    @JSImport("msportalfx-mock", "MockFx.logger")
    @js.native
    def logger: LoggerType = js.native
    inline def logger_=(x: LoggerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    
    @JSImport("msportalfx-mock", "MockFx.loggingToConsole")
    @js.native
    def loggingToConsole: Any = js.native
    inline def loggingToConsole_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loggingToConsole")(x.asInstanceOf[js.Any])
    
    /**
      * The current version of the framework. It's a good idea to use this to bin your stored mock data
      * to allow for upgrading the framework when breaking changes are introduced in order to not break
      * test runs using previous version.
      *
      * @static
      * @memberof MockFx
      */
    @JSImport("msportalfx-mock", "MockFx.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  object RdfeProxy {
    
    @JSImport("msportalfx-mock", "RdfeProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an rdfe proxy instance and setups firewal and certificates.
      *
      * @param rdfeEndpoint The rdfe endpoint to proxy.
      * @param serverPort The local server port.
      * @param rdfeManager The rdfe mock manager.
      * @param enablePassthrough If to enable passthrough to actual rdfe.
      * @return A promise that completes when local proxy is setup.
      */
    inline def create(rdfeEndpoint: String, serverPort: Double): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: js.Function1[/* app */ Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: js.Function1[/* app */ Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: Unit,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager,
      customRoutes: js.Function1[/* app */ Express, Unit]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager,
      customRoutes: js.Function1[/* app */ Express, Unit],
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def create(
      rdfeEndpoint: String,
      serverPort: Double,
      rdfeManager: typings.msportalfxMock.rdfeManagerMod.RdfeManager.Manager,
      customRoutes: Unit,
      enablePassthrough: Boolean
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rdfeEndpoint.asInstanceOf[js.Any], serverPort.asInstanceOf[js.Any], rdfeManager.asInstanceOf[js.Any], customRoutes.asInstanceOf[js.Any], enablePassthrough.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * Dispose local proxy
      *
      * @param rdfeEndpoint The rdfe endpoint to proxy.
      * @param serverPort The local server port.
      * @param enablePassthrough If to enable passthrough to actual rdfe.
      * @return A promise that completes when local proxy is setup.
      */
    inline def dispose(proxy: ProxyServer): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(proxy.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  }
  
  inline def createARMTarget(hasHostLoadRequestsStoreRequestsOnBeforeRequestMatchCustomMatchRequest: ARMDefinitionConfiguration): TargetDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createARMTarget")(hasHostLoadRequestsStoreRequestsOnBeforeRequestMatchCustomMatchRequest.asInstanceOf[js.Any]).asInstanceOf[TargetDefinition]
  
  inline def createStorageTarget(
    hasStorageEndpointSuffixLoadRequestsStoreRequestsOnBeforeRequestMatch: StorageDefinitionConfiguration
  ): TargetDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createStorageTarget")(hasStorageEndpointSuffixLoadRequestsStoreRequestsOnBeforeRequestMatch.asInstanceOf[js.Any]).asInstanceOf[TargetDefinition]
}
