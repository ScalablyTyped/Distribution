package typings.parse.mod.global.Parse.Cloud

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
    status: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

