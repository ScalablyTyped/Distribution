package typings.parse.ParseNs.CloudNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var buffer: js.UndefOr[Buffer] = js.undefined
  var cookies: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object HttpResponse {
  @scala.inline
  def apply(
    buffer: Buffer = null,
    cookies: js.Any = null,
    data: js.Any = null,
    headers: js.Any = null,
    status: Int | Double = null,
    text: String = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[HttpResponse]
  }
}

