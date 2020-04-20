package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadLinkParam extends js.Object {
  var captcha_response: String
  var file: String
  var ticket: String
}

object DownloadLinkParam {
  @scala.inline
  def apply(captcha_response: String, file: String, ticket: String): DownloadLinkParam = {
    val __obj = js.Dynamic.literal(captcha_response = captcha_response.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadLinkParam]
  }
}

