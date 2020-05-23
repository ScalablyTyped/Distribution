package typings.meteor.HTTP

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPResponse extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object HTTPResponse {
  @scala.inline
  def apply(
    content: String = null,
    data: js.Any = null,
    headers: StringDictionary[String] = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): HTTPResponse = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPResponse]
  }
}

