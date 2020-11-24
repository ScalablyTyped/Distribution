package typings.nwGui.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends EventEmitter {
  
  def addOriginAccessWhitelistEntry(
    sourceOrigin: String,
    destinationProtocol: String,
    destinationHost: String,
    allowDestinationSubdomains: Boolean
  ): Unit = js.native
  
  var argv: js.Any = js.native
  
  def clearCache(): Unit = js.native
  
  def closeAllWindows(): Unit = js.native
  
  def crashBrowser(): Unit = js.native
  
  def crashRenderer(): Unit = js.native
  
  var dataPath: String = js.native
  
  var fullArgv: js.Any = js.native
  
  def getProxyForURL(url: String): Unit = js.native
  
  var manifest: js.Any = js.native
  
  def quit(): Unit = js.native
  
  def registerGlobalHotKey(shortcut: Shortcut): Unit = js.native
  
  def removeOriginAccessWhitelistEntry(
    sourceOrigin: String,
    destinationProtocol: String,
    destinationHost: String,
    allowDestinationSubdomains: Boolean
  ): Unit = js.native
  
  def setCrashDumpDir(dir: String): Unit = js.native
  
  def unregisterGlobalHotKey(shortcut: Shortcut): Unit = js.native
}
@JSImport("nw.gui", "App")
@js.native
object App extends TopLevel[App]
