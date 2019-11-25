package typings.openapiDashFactory.openapiDashFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var body: js.UndefOr[js.Object | String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object HttpResponse {
  @scala.inline
  def apply(body: js.Object | String = null, headers: js.Object = null, statusCode: Int | Double = null): HttpResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

