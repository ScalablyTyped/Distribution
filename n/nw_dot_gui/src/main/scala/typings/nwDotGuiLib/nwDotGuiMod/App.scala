package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends EventEmitter {
  var argv: js.Any = js.native
  var dataPath: java.lang.String = js.native
  var fullArgv: js.Any = js.native
  var manifest: js.Any = js.native
  def addOriginAccessWhitelistEntry(
    sourceOrigin: java.lang.String,
    destinationProtocol: java.lang.String,
    destinationHost: java.lang.String,
    allowDestinationSubdomains: scala.Boolean
  ): scala.Unit = js.native
  def clearCache(): scala.Unit = js.native
  def closeAllWindows(): scala.Unit = js.native
  def crashBrowser(): scala.Unit = js.native
  def crashRenderer(): scala.Unit = js.native
  def getProxyForURL(url: java.lang.String): scala.Unit = js.native
  def quit(): scala.Unit = js.native
  def registerGlobalHotKey(shortcut: Shortcut): scala.Unit = js.native
  def removeOriginAccessWhitelistEntry(
    sourceOrigin: java.lang.String,
    destinationProtocol: java.lang.String,
    destinationHost: java.lang.String,
    allowDestinationSubdomains: scala.Boolean
  ): scala.Unit = js.native
  def setCrashDumpDir(dir: java.lang.String): scala.Unit = js.native
  def unregisterGlobalHotKey(shortcut: Shortcut): scala.Unit = js.native
}

