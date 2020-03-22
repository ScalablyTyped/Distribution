package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.Server
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/webapp", JSImport.Namespace)
@js.native
object webappMod extends js.Object {
  @js.native
  object WebApp extends js.Object {
    var connectApp: Server = js.native
    var connectHandlers: Server = js.native
    var defaultArch: String = js.native
    var httpServer: typings.node.httpMod.Server = js.native
    var rawConnectHandlers: Server = js.native
    def onListening(callback: js.Function): Unit = js.native
    def suppressConnectErrors(): Unit = js.native
    @js.native
    object clientPrograms extends /* key */ StringDictionary[AnonCordovaCompatibilityVersions]
    
  }
  
  @js.native
  object WebAppInternals extends js.Object {
    var additionalStaticJs: js.Any = js.native
    var staticFiles: StaticFiles = js.native
    def addStaticJs(): Unit = js.native
    def generateBoilerplate(): Unit = js.native
    def generateBoilerplateInstance(arch: String, manifest: js.Any, additionalOptions: js.Any): js.Any = js.native
    def getBoilerplate(request: IncomingMessage, arch: String): String = js.native
    def identifyBrowser(userAgentString: String): AnonMajor = js.native
    def inlineScriptsAllowed(): Boolean = js.native
    def parsePort(port: String): Double = js.native
    def registerBoilerplateDataCallback(key: String, callback: js.Function): js.Function = js.native
    def reloadClientPrograms(): Unit = js.native
    def setBundledJsCssPrefix(bundledJsCssPrefix: String): Unit = js.native
    def setBundledJsCssUrlRewriteHook(hookFn: js.Function1[/* url */ String, String]): Unit = js.native
    def setInlineScriptsAllowed(inlineScriptsAllowed: Boolean): Unit = js.native
    def staticFilesMiddleware(staticFiles: StaticFiles, req: IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
    @js.native
    object NpmModules extends /* key */ StringDictionary[AnonModule]
    
  }
  
  type StaticFiles = StringDictionary[AnonAbsolutePath]
}

