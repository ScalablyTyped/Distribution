package typings.microserviceDashUtilities.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformClientResponse[T] extends js.Object {
  var config: js.Object
  var data: js.UndefOr[T] = js.undefined
  var headers: js.Any
  var request: js.UndefOr[js.Any] = js.undefined
  var status: Double
  var statusText: String
}

object PlatformClientResponse {
  @scala.inline
  def apply[T](
    config: js.Object,
    headers: js.Any,
    status: Double,
    statusText: String,
    data: T = null,
    request: js.Any = null
  ): PlatformClientResponse[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformClientResponse[T]]
  }
}

