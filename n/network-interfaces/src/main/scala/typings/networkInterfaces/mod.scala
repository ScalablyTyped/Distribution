package typings.networkInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("network-interfaces", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def fromIp(ip: String, options: js.Object): String = js.native
  
  def getInterface(options: js.Object): String = js.native
  
  def getInterfaces(options: js.Object): js.Array[String] = js.native
  
  def toIp(interfaceName: String, options: js.Object): String = js.native
  
  def toIps(interfaceName: String, options: js.Object): js.Array[String] = js.native
}
