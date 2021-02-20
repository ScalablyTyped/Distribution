package typings.netKeepalive

import typings.netKeepalive.anon.Handle
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("net-keepalive", "getKeepAliveInterval")
  @js.native
  def getKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor): Double = js.native
  
  @JSImport("net-keepalive", "getKeepAliveProbes")
  @js.native
  def getKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor): Double = js.native
  
  @JSImport("net-keepalive", "getUserTimeout")
  @js.native
  def getUserTimeout(socket: NodeJSSocketWithFileDescriptor): Double = js.native
  
  @JSImport("net-keepalive", "setKeepAliveInterval")
  @js.native
  def setKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor, intvl: Double): Boolean = js.native
  
  @JSImport("net-keepalive", "setKeepAliveProbes")
  @js.native
  def setKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor, cnt: Double): Boolean = js.native
  
  @JSImport("net-keepalive", "setUserTimeout")
  @js.native
  def setUserTimeout(socket: NodeJSSocketWithFileDescriptor, timeout: Double): Boolean = js.native
  
  type NodeJSSocketWithFileDescriptor = Socket | Handle
}
