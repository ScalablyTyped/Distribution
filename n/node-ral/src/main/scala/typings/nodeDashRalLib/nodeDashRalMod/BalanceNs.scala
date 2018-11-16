package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Balance")
@js.native
object BalanceNs extends js.Object {
  @js.native
  class BalanceContextClass protected () extends js.Object {
    def this(serviceID: java.lang.String, service: nodeDashRalLib.nodeDashRalMod.Service) = this()
    var crossIDCServers: js.Array[java.lang.String] = js.native
    var currentIDC: java.lang.String = js.native
    var reqIDCServers: js.Array[java.lang.String] = js.native
    var serviceID: java.lang.String = js.native
  }
  
}

