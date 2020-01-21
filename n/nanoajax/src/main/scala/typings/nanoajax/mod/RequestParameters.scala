package typings.nanoajax.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParameters extends js.Object {
  var body: js.UndefOr[String | FormData] = js.undefined
  var cors: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var url: String
}

object RequestParameters {
  @scala.inline
  def apply(
    url: String,
    body: String | FormData = null,
    cors: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    method: String = null
  ): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
}

