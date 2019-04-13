package typings
package meteorLib.webappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/webapp", "WebApp")
@js.native
object WebAppNs extends js.Object {
  var connectApp: connectLib.connectMod.Server = js.native
  var connectHandlers: connectLib.connectMod.Server = js.native
  var defaultArch: java.lang.String = js.native
  var httpServer: nodeLib.httpMod.Server = js.native
  var rawConnectHandlers: connectLib.connectMod.Server = js.native
  def onListening(callback: js.Function): scala.Unit = js.native
  def suppressConnectErrors(): scala.Unit = js.native
  @js.native
  object clientPrograms
    extends /* key */ org.scalablytyped.runtime.StringDictionary[meteorLib.Anon_CordovaCompatibilityVersions]
  
}

