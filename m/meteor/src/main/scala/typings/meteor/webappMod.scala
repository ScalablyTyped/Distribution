package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.Server
import typings.meteor.anon.AbsolutePath
import typings.meteor.anon.CordovaCompatibilityVersions
import typings.meteor.anon.Major
import typings.meteor.anon.Module
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/webapp", JSImport.Namespace)
@js.native
object webappMod extends js.Object {
  
  @js.native
  object WebApp extends js.Object {
    
    var connectApp: Server = js.native
    
    var connectHandlers: Server = js.native
    
    var defaultArch: String = js.native
    
    var httpServer: typings.node.httpMod.Server = js.native
    
    def onListening(callback: js.Function): Unit = js.native
    
    var rawConnectHandlers: Server = js.native
    
    def suppressConnectErrors(): Unit = js.native
    
    @js.native
    object clientPrograms extends /* key */ StringDictionary[CordovaCompatibilityVersions]
  }
  
  @js.native
  object WebAppInternals extends js.Object {
    
    def addStaticJs(): Unit = js.native
    
    var additionalStaticJs: js.Any = js.native
    
    def generateBoilerplate(): Unit = js.native
    
    def generateBoilerplateInstance(arch: String, manifest: js.Any, additionalOptions: js.Any): js.Any = js.native
    
    def getBoilerplate(request: IncomingMessage, arch: String): String = js.native
    
    def identifyBrowser(userAgentString: String): Major = js.native
    
    def inlineScriptsAllowed(): Boolean = js.native
    
    def parsePort(port: String): Double = js.native
    
    def registerBoilerplateDataCallback(key: String, callback: js.Function): js.Function = js.native
    
    def reloadClientPrograms(): Unit = js.native
    
    def setBundledJsCssPrefix(bundledJsCssPrefix: String): Unit = js.native
    
    def setBundledJsCssUrlRewriteHook(hookFn: js.Function1[/* url */ String, String]): Unit = js.native
    
    def setInlineScriptsAllowed(inlineScriptsAllowed: Boolean): Unit = js.native
    
    var staticFiles: StaticFiles = js.native
    
    def staticFilesMiddleware(staticFiles: StaticFiles, req: IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
    
    @js.native
    object NpmModules extends /* key */ StringDictionary[Module]
  }
  
  type StaticFiles = StringDictionary[AbsolutePath]
}
