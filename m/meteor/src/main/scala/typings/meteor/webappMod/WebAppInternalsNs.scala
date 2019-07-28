package typings.meteor.webappMod

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Anon_Major
import typings.meteor.Anon_Module
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/webapp", "WebAppInternals")
@js.native
object WebAppInternalsNs extends js.Object {
  var additionalStaticJs: js.Any = js.native
  var staticFiles: StaticFiles = js.native
  def addStaticJs(): Unit = js.native
  def generateBoilerplate(): Unit = js.native
  def generateBoilerplateInstance(arch: String, manifest: js.Any, additionalOptions: js.Any): js.Any = js.native
  def getBoilerplate(request: IncomingMessage, arch: String): String = js.native
  def identifyBrowser(userAgentString: String): Anon_Major = js.native
  def inlineScriptsAllowed(): Boolean = js.native
  def parsePort(port: String): Double = js.native
  def registerBoilerplateDataCallback(key: String, callback: js.Function): js.Function = js.native
  def reloadClientPrograms(): Unit = js.native
  def setBundledJsCssPrefix(bundledJsCssPrefix: String): Unit = js.native
  def setBundledJsCssUrlRewriteHook(hookFn: js.Function1[/* url */ String, String]): Unit = js.native
  def setInlineScriptsAllowed(inlineScriptsAllowed: Boolean): Unit = js.native
  def staticFilesMiddleware(staticFiles: StaticFiles, req: IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
  @js.native
  object NpmModules extends /* key */ StringDictionary[Anon_Module]
  
}

