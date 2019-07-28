package typings.atOctokitRest.atOctokitRestMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointOptions
  extends /* parameter */ StringDictionary[js.Any] {
  var baseUrl: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var method: js.UndefOr[RequestMethod] = js.undefined
  var request: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object EndpointOptions {
  @scala.inline
  def apply(
    StringDictionary: /* parameter */ StringDictionary[js.Any] = null,
    baseUrl: String = null,
    data: js.Any = null,
    headers: StringDictionary[js.Any] = null,
    method: RequestMethod = null,
    request: StringDictionary[js.Any] = null,
    url: String = null
  ): EndpointOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (request != null) __obj.updateDynamic("request")(request)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[EndpointOptions]
  }
}

