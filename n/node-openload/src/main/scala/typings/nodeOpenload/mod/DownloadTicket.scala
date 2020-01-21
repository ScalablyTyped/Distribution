package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadTicket extends js.Object {
  var captcha_h: Double
  var captcha_url: String
  var captcha_w: Double
  var ticket: String
  var valid_until: String
  var wait_time: Double
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
}

