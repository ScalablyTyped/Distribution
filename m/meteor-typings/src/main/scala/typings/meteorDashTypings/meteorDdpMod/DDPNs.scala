package typings.meteorDashTypings.meteorDdpMod

import typings.meteorDashTypings.MeteorNs.SubscriptionHandle
import typings.meteorDashTypings.meteorDdpMod.DDPNs.DDPStatic
import typings.meteorDashTypings.meteorDdpMod.DDPNs.DDPStatus
import typings.meteorDashTypings.meteorDdpMod.DDPNs.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ddp", "DDP")
@js.native
object DDPNs extends js.Object {
  trait DDPStatic extends js.Object {
    @JSName("apply")
    def apply(method: String, parameters: js.Any*): Unit
    def call(method: String, parameters: js.Any*): Unit
    def disconnect(): Unit
    def methods(IMeteorMethodsDictionary: js.Any): js.Any
    def onReconnect(): Unit
    def reconnect(): Unit
    def status(): DDPStatus
    def subscribe(name: String, rest: js.Any*): SubscriptionHandle
  }
  
  trait DDPStatus extends js.Object {
    var connected: Boolean
    var reason: js.UndefOr[String] = js.undefined
    var retryCount: Double
    var retryTime: js.UndefOr[Double] = js.undefined
    var status: Status
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteorDashTypings.meteorDashTypingsStrings.connected
    - typings.meteorDashTypings.meteorDashTypingsStrings.connecting
    - typings.meteorDashTypings.meteorDashTypingsStrings.failed
    - typings.meteorDashTypings.meteorDashTypingsStrings.waiting
    - typings.meteorDashTypings.meteorDashTypingsStrings.offline
  */
  trait Status extends js.Object
  
  def _allSubscriptionsReady(): Boolean = js.native
  def connect(url: String): DDPStatic = js.native
}

