package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSEmailSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From extends js.Object {
  var from: OSEmailSubscriptionState = js.native
  var to: OSEmailSubscriptionState = js.native
}

object From {
  @scala.inline
  def apply(from: OSEmailSubscriptionState, to: OSEmailSubscriptionState): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrom(value: OSEmailSubscriptionState): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: OSEmailSubscriptionState): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

