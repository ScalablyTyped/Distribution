package typings
package networkDashInterfacesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("network-interfaces", JSImport.Namespace)
@js.native
object networkDashInterfacesMod extends js.Object {
  def fromIp(ip: java.lang.String, options: js.Object): java.lang.String = js.native
  def getInterface(options: js.Object): java.lang.String = js.native
  def getInterfaces(options: js.Object): js.Array[java.lang.String] = js.native
  def toIp(interfaceName: java.lang.String, options: js.Object): java.lang.String = js.native
  def toIps(interfaceName: java.lang.String, options: js.Object): js.Array[java.lang.String] = js.native
}

