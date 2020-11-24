package typings.nodeZookeeperClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  var retries: Double = js.native
  
  var sessionTimeout: Double = js.native
  
  var spinDelay: Double = js.native
}
object Option {
  
  @scala.inline
  def apply(retries: Double, sessionTimeout: Double, spinDelay: Double): Option = {
    val __obj = js.Dynamic.literal(retries = retries.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], spinDelay = spinDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
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
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinDelay(value: Double): Self = this.set("spinDelay", value.asInstanceOf[js.Any])
  }
}
