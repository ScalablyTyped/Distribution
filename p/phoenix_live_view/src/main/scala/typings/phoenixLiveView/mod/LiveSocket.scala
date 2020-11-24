package typings.phoenixLiveView.mod

import typings.phoenix.mod.Socket
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phoenix_live_view", "LiveSocket")
@js.native
class LiveSocket protected () extends js.Object {
  // phxSocket should be the Socket class (LiveSocket will use the constructor)
  def this(url: String, phxSocket: js.Any, opts: SocketOptions) = this()
  
  // public
  def connect(): Unit = js.native
  
  def disableDebug(): Unit = js.native
  
  def disableLatencySim(): Unit = js.native
  
  def disableProfiling(): Unit = js.native
  
  def disconnect(callback: js.Any): Unit = js.native
  
  def enableDebug(): Unit = js.native
  
  def enableLatencySim(upperBoundMs: Double): Unit = js.native
  
  def enableProfiling(): Unit = js.native
  
  def getLatencySim(): Double | Null = js.native
  
  def getSocket(): Socket = js.native
  
  def isDebugEnabled(): Boolean = js.native
  
  def isPhxView(el: HTMLElement): Boolean = js.native
  
  def isProfileEnabled(): Boolean = js.native
}
