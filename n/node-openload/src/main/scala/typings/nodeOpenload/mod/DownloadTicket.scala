package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadTicket extends js.Object {
  
  var captcha_h: Double = js.native
  
  var captcha_url: String = js.native
  
  var captcha_w: Double = js.native
  
  var ticket: String = js.native
  
  var valid_until: String = js.native
  
  var wait_time: Double = js.native
}
object DownloadTicket {
  
  @scala.inline
  def apply(
    captcha_h: Double,
    captcha_url: String,
    captcha_w: Double,
    ticket: String,
    valid_until: String,
    wait_time: Double
  ): DownloadTicket = {
    val __obj = js.Dynamic.literal(captcha_h = captcha_h.asInstanceOf[js.Any], captcha_url = captcha_url.asInstanceOf[js.Any], captcha_w = captcha_w.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any], wait_time = wait_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadTicket]
  }
  
  @scala.inline
  implicit class DownloadTicketOps[Self <: DownloadTicket] (val x: Self) extends AnyVal {
    
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
    def setCaptcha_h(value: Double): Self = this.set("captcha_h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptcha_url(value: String): Self = this.set("captcha_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptcha_w(value: Double): Self = this.set("captcha_w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket(value: String): Self = this.set("ticket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_until(value: String): Self = this.set("valid_until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_time(value: Double): Self = this.set("wait_time", value.asInstanceOf[js.Any])
  }
}
