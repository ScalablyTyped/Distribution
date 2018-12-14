package typings
package meteorLib.webappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/webapp", "WebAppInternals")
@js.native
object WebAppInternalsNs extends js.Object {
  var additionalStaticJs: js.Any = js.native
  var staticFiles: meteorLib.webappMod.StaticFiles = js.native
  def addStaticJs(): scala.Unit = js.native
  def generateBoilerplate(): scala.Unit = js.native
  def generateBoilerplateInstance(arch: java.lang.String, manifest: js.Any, additionalOptions: js.Any): js.Any = js.native
  def getBoilerplate(request: nodeLib.httpMod.IncomingMessage, arch: java.lang.String): java.lang.String = js.native
  def identifyBrowser(userAgentString: java.lang.String): meteorLib.Anon_Minor = js.native
  def inlineScriptsAllowed(): scala.Boolean = js.native
  def parsePort(port: java.lang.String): scala.Double = js.native
  def registerBoilerplateDataCallback(key: java.lang.String, callback: js.Function): js.Function = js.native
  def reloadClientPrograms(): scala.Unit = js.native
  def setBundledJsCssPrefix(bundledJsCssPrefix: java.lang.String): scala.Unit = js.native
  def setBundledJsCssUrlRewriteHook(hookFn: js.Function1[/* url */ java.lang.String, java.lang.String]): scala.Unit = js.native
  def setInlineScriptsAllowed(inlineScriptsAllowed: scala.Boolean): scala.Unit = js.native
  def staticFilesMiddleware(
    staticFiles: meteorLib.webappMod.StaticFiles,
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    next: js.Function
  ): scala.Unit = js.native
  @js.native
  object NpmModules
    extends /* key */ org.scalablytyped.runtime.StringDictionary[meteorLib.Anon_Module]
  
}

