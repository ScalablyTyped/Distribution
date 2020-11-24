package typings.meteor.ddpMod.DDP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DDPStatus extends js.Object {
  
  var connected: Boolean = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var retryCount: Double = js.native
  
  var retryTime: js.UndefOr[Double] = js.native
  
  var status: Status = js.native
}
object DDPStatus {
  
  @scala.inline
  def apply(connected: Boolean, retryCount: Double, status: Status): DDPStatus = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDPStatus]
  }
  
  @scala.inline
  implicit class DDPStatusOps[Self <: DDPStatus] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryCount(value: Double): Self = this.set("retryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRetryTime(value: Double): Self = this.set("retryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryTime: Self = this.set("retryTime", js.undefined)
  }
}
