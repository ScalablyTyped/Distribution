package typings.nock.nockMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var body: js.UndefOr[RequestBodyMatcher] = js.undefined
  var headers: js.UndefOr[ReplyHeaders] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var path: String
  var port: js.UndefOr[Double | String] = js.undefined
  var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.undefined
  var response: js.UndefOr[ReplyBody] = js.undefined
  var scope: String
  var status: js.UndefOr[Double] = js.undefined
}

object Definition {
  @scala.inline
  def apply(
    path: String,
    scope: String,
    body: RequestBodyMatcher = null,
    headers: ReplyHeaders = null,
    method: String = null,
    options: Options = null,
    port: Double | String = null,
    reqheaders: Record[String, RequestHeaderMatcher] = null,
    response: ReplyBody = null,
    status: Int | Double = null
  ): Definition = {
    val __obj = js.Dynamic.literal(path = path, scope = scope)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (options != null) __obj.updateDynamic("options")(options)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (reqheaders != null) __obj.updateDynamic("reqheaders")(reqheaders)
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

