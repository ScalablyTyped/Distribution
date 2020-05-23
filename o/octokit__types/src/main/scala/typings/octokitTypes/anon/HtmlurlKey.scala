package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlurlKey extends js.Object {
  var html_url: String
  var key: String
  var name: String
  var url: String
}

object HtmlurlKey {
  @scala.inline
  def apply(html_url: String, key: String, name: String, url: String): HtmlurlKey = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlurlKey]
  }
}

