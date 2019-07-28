package typings.nodeDashRal.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Balance")
@js.native
object BalanceNs extends js.Object {
  @js.native
  class BalanceContextClass protected () extends js.Object {
    def this(serviceID: String, service: Service) = this()
    var crossIDCServers: js.Array[String] = js.native
    var currentIDC: String = js.native
    var reqIDCServers: js.Array[String] = js.native
    var serviceID: String = js.native
  }
  
}

