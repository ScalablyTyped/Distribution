package typings.meteor.webappMod

import org.scalablytyped.runtime.StringDictionary
import typings.connect.connectMod.Server
import typings.meteor.Anon_CordovaCompatibilityVersions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/webapp", "WebApp")
@js.native
object WebAppNs extends js.Object {
  var connectApp: Server = js.native
  var connectHandlers: Server = js.native
  var defaultArch: String = js.native
  var httpServer: typings.node.httpMod.Server = js.native
  var rawConnectHandlers: Server = js.native
  def onListening(callback: js.Function): Unit = js.native
  def suppressConnectErrors(): Unit = js.native
  @js.native
  object clientPrograms extends /* key */ StringDictionary[Anon_CordovaCompatibilityVersions]
  
}

