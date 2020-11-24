package typings.portNumbers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("port-numbers", "getService")
@js.native
object getService extends js.Object {
  
  def apply(port: Double): ServiceInfo | Null = js.native
  def apply(port: Double, protocol: String): ServiceInfo | Null = js.native
}
