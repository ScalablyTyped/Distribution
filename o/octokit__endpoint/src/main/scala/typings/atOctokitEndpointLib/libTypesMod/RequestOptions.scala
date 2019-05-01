package typings
package atOctokitEndpointLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: atOctokitEndpointLib.Anon_AcceptOption
  var method: Method
  var request: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var url: java.lang.String
}

object RequestOptions {
  @scala.inline
  def apply(
    headers: atOctokitEndpointLib.Anon_AcceptOption,
    method: Method,
    url: java.lang.String,
    body: js.Any = null,
    request: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[RequestOptions]
  }
}

