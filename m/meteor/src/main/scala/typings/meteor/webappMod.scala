package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.Server
import typings.meteor.anon.AbsolutePath
import typings.meteor.anon.Major
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webappMod {
  
  object WebApp {
    
    @JSImport("meteor/webapp", "WebApp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/webapp", "WebApp.connectApp")
    @js.native
    def connectApp: Server = js.native
    @scala.inline
    def connectApp_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectApp")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/webapp", "WebApp.connectHandlers")
    @js.native
    def connectHandlers: Server = js.native
    @scala.inline
    def connectHandlers_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectHandlers")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/webapp", "WebApp.defaultArch")
    @js.native
    def defaultArch: String = js.native
    @scala.inline
    def defaultArch_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultArch")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/webapp", "WebApp.httpServer")
    @js.native
    def httpServer: typings.node.httpMod.Server = js.native
    @scala.inline
    def httpServer_=(x: typings.node.httpMod.Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpServer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def onListening(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onListening")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("meteor/webapp", "WebApp.rawConnectHandlers")
    @js.native
    def rawConnectHandlers: Server = js.native
    @scala.inline
    def rawConnectHandlers_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rawConnectHandlers")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressConnectErrors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressConnectErrors")().asInstanceOf[Unit]
  }
  
  object WebAppInternals {
    
    @JSImport("meteor/webapp", "WebAppInternals")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addStaticJs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStaticJs")().asInstanceOf[Unit]
    
    @JSImport("meteor/webapp", "WebAppInternals.additionalStaticJs")
    @js.native
    def additionalStaticJs: js.Any = js.native
    @scala.inline
    def additionalStaticJs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalStaticJs")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def generateBoilerplate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBoilerplate")().asInstanceOf[Unit]
    
    @scala.inline
    def generateBoilerplateInstance(arch: String, manifest: js.Any, additionalOptions: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBoilerplateInstance")(arch.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getBoilerplate(request: IncomingMessage, arch: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoilerplate")(request.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def identifyBrowser(userAgentString: String): Major = ^.asInstanceOf[js.Dynamic].applyDynamic("identifyBrowser")(userAgentString.asInstanceOf[js.Any]).asInstanceOf[Major]
    
    @scala.inline
    def inlineScriptsAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineScriptsAllowed")().asInstanceOf[Boolean]
    
    @scala.inline
    def parsePort(port: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePort")(port.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def registerBoilerplateDataCallback(key: String, callback: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBoilerplateDataCallback")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    @scala.inline
    def reloadClientPrograms(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadClientPrograms")().asInstanceOf[Unit]
    
    @scala.inline
    def setBundledJsCssPrefix(bundledJsCssPrefix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBundledJsCssPrefix")(bundledJsCssPrefix.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setBundledJsCssUrlRewriteHook(hookFn: js.Function1[/* url */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBundledJsCssUrlRewriteHook")(hookFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setInlineScriptsAllowed(inlineScriptsAllowed: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInlineScriptsAllowed")(inlineScriptsAllowed.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("meteor/webapp", "WebAppInternals.staticFiles")
    @js.native
    def staticFiles: StaticFiles = js.native
    
    @scala.inline
    def staticFilesMiddleware(staticFiles: StaticFiles, req: IncomingMessage, res: ServerResponse, next: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("staticFilesMiddleware")(staticFiles.asInstanceOf[js.Any], req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def staticFiles_=(x: StaticFiles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticFiles")(x.asInstanceOf[js.Any])
  }
  
  type StaticFiles = StringDictionary[AbsolutePath]
}
