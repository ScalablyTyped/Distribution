package typings.nodeGcm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISenderSendOptions extends js.Object {
  
  var backoff: js.UndefOr[Double] = js.native
  
  var retries: js.UndefOr[Double] = js.native
}
object ISenderSendOptions {
  
  @scala.inline
  def apply(): ISenderSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISenderSendOptions]
  }
  
  @scala.inline
  implicit class ISenderSendOptionsOps[Self <: ISenderSendOptions] (val x: Self) extends AnyVal {
    
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
    def setBackoff(value: Double): Self = this.set("backoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
  }
}
