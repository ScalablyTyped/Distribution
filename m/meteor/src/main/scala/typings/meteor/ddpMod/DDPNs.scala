package typings.meteor.ddpMod

import typings.meteor.MeteorNs.SubscriptionHandle
import typings.meteor.ddpMod.DDPNs.DDPStatic
import typings.meteor.ddpMod.DDPNs.DDPStatus
import typings.meteor.ddpMod.DDPNs.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ddp", "DDP")
@js.native
object DDPNs extends js.Object {
  trait DDPStatic extends js.Object {
    @JSName("apply")
    def apply(method: String, parameters: js.Any*): js.Any
    def call(method: String, parameters: js.Any*): js.Any
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
    - typings.meteor.meteorStrings.connected
    - typings.meteor.meteorStrings.connecting
    - typings.meteor.meteorStrings.failed
    - typings.meteor.meteorStrings.waiting
    - typings.meteor.meteorStrings.offline
  */
  trait Status extends js.Object
  
  def _allSubscriptionsReady(): Boolean = js.native
  def connect(url: String): DDPStatic = js.native
}

