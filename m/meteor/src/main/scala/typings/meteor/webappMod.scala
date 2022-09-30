package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.Server
import typings.meteor.anon.AbsolutePath
import typings.meteor.anon.Arch
import typings.meteor.anon.Major
import typings.meteor.meteorBooleans.`false`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webappMod {
  
  object WebApp {
    
    @JSImport("meteor/globals/webapp", "WebApp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addRuntimeConfigHook(callback: RuntimeConfigHookCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRuntimeConfigHook")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("meteor/globals/webapp", "WebApp.connectApp")
    @js.native
    def connectApp: Server = js.native
    inline def connectApp_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectApp")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/globals/webapp", "WebApp.connectHandlers")
    @js.native
    def connectHandlers: Server = js.native
    inline def connectHandlers_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectHandlers")(x.asInstanceOf[js.Any])
    
    inline def decodeRuntimeConfig(rtimeConfigString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRuntimeConfig")(rtimeConfigString.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("meteor/globals/webapp", "WebApp.defaultArch")
    @js.native
    def defaultArch: String = js.native
    inline def defaultArch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultArch")(x.asInstanceOf[js.Any])
    
    inline def encodeRuntimeConfig(rtimeConfig: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRuntimeConfig")(rtimeConfig.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("meteor/globals/webapp", "WebApp.httpServer")
    @js.native
    def httpServer: typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    inline def httpServer_=(
      x: typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpServer")(x.asInstanceOf[js.Any])
    
    inline def onListening(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onListening")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("meteor/globals/webapp", "WebApp.rawConnectHandlers")
    @js.native
    def rawConnectHandlers: Server = js.native
    inline def rawConnectHandlers_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rawConnectHandlers")(x.asInstanceOf[js.Any])
    
    inline def suppressConnectErrors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressConnectErrors")().asInstanceOf[Unit]
    
    type RuntimeConfigHookCallback = js.Function1[/* options */ Arch, js.UndefOr[String | Null | `false`]]
  }
  
  object WebAppInternals {
    
    @JSImport("meteor/globals/webapp", "WebAppInternals")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addStaticJs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStaticJs")().asInstanceOf[Unit]
    
    @JSImport("meteor/globals/webapp", "WebAppInternals.additionalStaticJs")
    @js.native
    def additionalStaticJs: Any = js.native
    inline def additionalStaticJs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalStaticJs")(x.asInstanceOf[js.Any])
    
    inline def generateBoilerplate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBoilerplate")().asInstanceOf[Unit]
    
    inline def generateBoilerplateInstance(arch: String, manifest: Any, additionalOptions: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBoilerplateInstance")(arch.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getBoilerplate(request: IncomingMessage, arch: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoilerplate")(request.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def identifyBrowser(userAgentString: String): Major = ^.asInstanceOf[js.Dynamic].applyDynamic("identifyBrowser")(userAgentString.asInstanceOf[js.Any]).asInstanceOf[Major]
    
    inline def inlineScriptsAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineScriptsAllowed")().asInstanceOf[Boolean]
    
    inline def parsePort(port: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePort")(port.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def registerBoilerplateDataCallback(key: String, callback: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBoilerplateDataCallback")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def reloadClientPrograms(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadClientPrograms")().asInstanceOf[Unit]
    
    inline def setBundledJsCssPrefix(bundledJsCssPrefix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBundledJsCssPrefix")(bundledJsCssPrefix.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setBundledJsCssUrlRewriteHook(hookFn: js.Function1[/* url */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBundledJsCssUrlRewriteHook")(hookFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setInlineScriptsAllowed(inlineScriptsAllowed: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInlineScriptsAllowed")(inlineScriptsAllowed.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("meteor/globals/webapp", "WebAppInternals.staticFiles")
    @js.native
    def staticFiles: StaticFiles = js.native
    
    inline def staticFilesMiddleware(
      staticFiles: StaticFiles,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      next: js.Function
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("staticFilesMiddleware")(staticFiles.asInstanceOf[js.Any], req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def staticFiles_=(x: StaticFiles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticFiles")(x.asInstanceOf[js.Any])
  }
  
  type StaticFiles = StringDictionary[AbsolutePath]
}
