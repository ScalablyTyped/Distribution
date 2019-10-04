package typings.onesignalDashCordovaDashPlugin

import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs.OSEmailSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: OSEmailSubscriptionState
  var to: OSEmailSubscriptionState
}

object Anon_From {
  @scala.inline
  def apply(from: OSEmailSubscriptionState, to: OSEmailSubscriptionState): Anon_From = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Anon_From]
  }
}

