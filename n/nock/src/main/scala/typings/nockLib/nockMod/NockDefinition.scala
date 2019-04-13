package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NockDefinition extends js.Object {
  var body: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var path: java.lang.String
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var reqheaders: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp | nockLib.Anon_HeaderValue]
  ] = js.undefined
  var response: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var scope: java.lang.String
  var status: js.UndefOr[scala.Double] = js.undefined
}

object NockDefinition {
  @scala.inline
  def apply(
    path: java.lang.String,
    scope: java.lang.String,
    body: java.lang.String | js.Any = null,
    headers: HttpHeaders = null,
    method: java.lang.String = null,
    options: Options = null,
    port: scala.Double | java.lang.String = null,
    reqheaders: org.scalablytyped.runtime.StringDictionary[java.lang.String | stdLib.RegExp | nockLib.Anon_HeaderValue] = null,
    response: java.lang.String | js.Any = null,
    status: scala.Int | scala.Double = null
  ): NockDefinition = {
    val __obj = js.Dynamic.literal(path = path, scope = scope)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (options != null) __obj.updateDynamic("options")(options)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (reqheaders != null) __obj.updateDynamic("reqheaders")(reqheaders)
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NockDefinition]
  }
}

