package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlPullrequest extends js.Object {
  var html: HrefString
  var pull_request: HrefString
}

object HtmlPullrequest {
  @scala.inline
  def apply(html: HrefString, pull_request: HrefString): HtmlPullrequest = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlPullrequest]
  }
}

