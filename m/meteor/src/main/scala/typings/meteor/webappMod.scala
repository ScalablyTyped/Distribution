package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.Server
import typings.meteor.anon.AbsolutePath
import typings.meteor.anon.Major
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("meteor/webapp", "WebApp.onListening")
    @js.native
    def onListening(callback: js.Function): Unit = js.native
    
    @JSImport("meteor/webapp", "WebApp.rawConnectHandlers")
    @js.native
    def rawConnectHandlers: Server = js.native
    @scala.inline
    def rawConnectHandlers_=(x: Server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rawConnectHandlers")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/webapp", "WebApp.suppressConnectErrors")
    @js.native
    def suppressConnectErrors(): Unit = js.native
  }
  
  object WebAppInternals {
    
    @JSImport("meteor/webapp", "WebAppInternals")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.addStaticJs")
    @js.native
    def addStaticJs(): Unit = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.additionalStaticJs")
    @js.native
    def additionalStaticJs: js.Any = js.native
    @scala.inline
    def additionalStaticJs_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("additionalStaticJs")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/webapp", "WebAppInternals.generateBoilerplate")
    @js.native
    def generateBoilerplate(): Unit = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.generateBoilerplateInstance")
    @js.native
    def generateBoilerplateInstance(arch: String, manifest: js.Any, additionalOptions: js.Any): js.Any = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.getBoilerplate")
    @js.native
    def getBoilerplate(request: IncomingMessage, arch: String): String = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.identifyBrowser")
    @js.native
    def identifyBrowser(userAgentString: String): Major = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.inlineScriptsAllowed")
    @js.native
    def inlineScriptsAllowed(): Boolean = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.parsePort")
    @js.native
    def parsePort(port: String): Double = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.registerBoilerplateDataCallback")
    @js.native
    def registerBoilerplateDataCallback(key: String, callback: js.Function): js.Function = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.reloadClientPrograms")
    @js.native
    def reloadClientPrograms(): Unit = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.setBundledJsCssPrefix")
    @js.native
    def setBundledJsCssPrefix(bundledJsCssPrefix: String): Unit = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.setBundledJsCssUrlRewriteHook")
    @js.native
    def setBundledJsCssUrlRewriteHook(hookFn: js.Function1[/* url */ String, String]): Unit = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.setInlineScriptsAllowed")
    @js.native
    def setInlineScriptsAllowed(inlineScriptsAllowed: Boolean): Unit = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.staticFiles")
    @js.native
    def staticFiles: StaticFiles = js.native
    
    @JSImport("meteor/webapp", "WebAppInternals.staticFilesMiddleware")
    @js.native
    def staticFilesMiddleware(staticFiles: StaticFiles, req: IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
    
    @scala.inline
    def staticFiles_=(x: StaticFiles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticFiles")(x.asInstanceOf[js.Any])
  }
  
  type StaticFiles = StringDictionary[AbsolutePath]
}
