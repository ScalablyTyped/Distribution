package typings.nodeDashOpenload.nodeDashOpenloadMod

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
    val __obj = js.Dynamic.literal(captcha_h = captcha_h, captcha_url = captcha_url, captcha_w = captcha_w, ticket = ticket, valid_until = valid_until, wait_time = wait_time)
  
    __obj.asInstanceOf[DownloadTicket]
  }
}

