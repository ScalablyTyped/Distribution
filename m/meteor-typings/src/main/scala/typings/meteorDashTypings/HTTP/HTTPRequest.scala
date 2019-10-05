package typings.meteorDashTypings.HTTP

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPRequest extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var npmRequestOptions: js.UndefOr[js.Object] = js.undefined
  var params: js.UndefOr[StringDictionary[String]] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object HTTPRequest {
  @scala.inline
  def apply(
    auth: String = null,
    content: String = null,
    data: js.Any = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    npmRequestOptions: js.Object = null,
    params: StringDictionary[String] = null,
    query: String = null,
    timeout: Int | Double = null
  ): HTTPRequest = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (content != null) __obj.updateDynamic("content")(content)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (npmRequestOptions != null) __obj.updateDynamic("npmRequestOptions")(npmRequestOptions)
    if (params != null) __obj.updateDynamic("params")(params)
    if (query != null) __obj.updateDynamic("query")(query)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPRequest]
  }
}

