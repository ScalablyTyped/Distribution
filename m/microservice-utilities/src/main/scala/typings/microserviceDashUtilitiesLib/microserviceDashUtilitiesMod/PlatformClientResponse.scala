package typings
package microserviceDashUtilitiesLib.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformClientResponse[T] extends js.Object {
  var config: js.Object
  var data: js.UndefOr[T] = js.undefined
  var headers: js.Any
  var request: js.UndefOr[js.Any] = js.undefined
  var status: scala.Double
  var statusText: java.lang.String
}

object PlatformClientResponse {
  @scala.inline
  def apply[T](
    config: js.Object,
    headers: js.Any,
    status: scala.Double,
    statusText: java.lang.String,
    data: T = null,
    request: js.Any = null
  ): PlatformClientResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[PlatformClientResponse[T]]
  }
}

