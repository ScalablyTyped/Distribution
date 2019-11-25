package typings.meteor.httpMod.HTTP

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
    params: StringDictionary[String] = null,
    query: String = null,
    timeout: Int | Double = null
  ): HTTPRequest = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPRequest]
  }
}

