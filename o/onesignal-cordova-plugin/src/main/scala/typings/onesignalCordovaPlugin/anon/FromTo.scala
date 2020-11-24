package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromTo extends js.Object {
  
  var from: OSSubscriptionState = js.native
  
  var to: OSSubscriptionState = js.native
}
object FromTo {
  
  @scala.inline
  def apply(from: OSSubscriptionState, to: OSSubscriptionState): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
  
  @scala.inline
  implicit class FromToOps[Self <: FromTo] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: OSSubscriptionState): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: OSSubscriptionState): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
