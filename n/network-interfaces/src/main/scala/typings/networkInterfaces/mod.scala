package typings.networkInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("network-interfaces", "fromIp")
  @js.native
  def fromIp(ip: String, options: js.Object): String = js.native
  
  @JSImport("network-interfaces", "getInterface")
  @js.native
  def getInterface(options: js.Object): String = js.native
  
  @JSImport("network-interfaces", "getInterfaces")
  @js.native
  def getInterfaces(options: js.Object): js.Array[String] = js.native
  
  @JSImport("network-interfaces", "toIp")
  @js.native
  def toIp(interfaceName: String, options: js.Object): String = js.native
  
  @JSImport("network-interfaces", "toIps")
  @js.native
  def toIps(interfaceName: String, options: js.Object): js.Array[String] = js.native
}
