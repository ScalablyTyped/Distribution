package typings.atOctokitRest.atOctokitRestMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var method: js.UndefOr[RequestMethod] = js.undefined
  var request: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: StringDictionary[js.Any] = null,
    method: RequestMethod = null,
    request: StringDictionary[js.Any] = null,
    url: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (request != null) __obj.updateDynamic("request")(request)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestOptions]
  }
}

