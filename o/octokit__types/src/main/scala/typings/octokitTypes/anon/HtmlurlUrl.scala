package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlurlUrl extends js.Object {
  var html_url: String
  var url: String
}

object HtmlurlUrl {
  @scala.inline
  def apply(html_url: String, url: String): HtmlurlUrl = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlurlUrl]
  }
}

