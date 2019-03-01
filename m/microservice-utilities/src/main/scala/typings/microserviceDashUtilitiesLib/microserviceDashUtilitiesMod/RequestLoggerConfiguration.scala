package typings
package microserviceDashUtilitiesLib.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerConfiguration extends js.Object {
  var extendErrorObjects: js.UndefOr[scala.Boolean] = js.undefined
  var jsonSpace: js.UndefOr[scala.Double] = js.undefined
  var logFunction: js.UndefOr[js.Function1[/* msg */ js.Any, scala.Unit]] = js.undefined
}

object RequestLoggerConfiguration {
  @scala.inline
  def apply(
    extendErrorObjects: js.UndefOr[scala.Boolean] = js.undefined,
    jsonSpace: scala.Int | scala.Double = null,
    logFunction: js.Function1[/* msg */ js.Any, scala.Unit] = null
  ): RequestLoggerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extendErrorObjects)) __obj.updateDynamic("extendErrorObjects")(extendErrorObjects)
    if (jsonSpace != null) __obj.updateDynamic("jsonSpace")(jsonSpace.asInstanceOf[js.Any])
    if (logFunction != null) __obj.updateDynamic("logFunction")(logFunction)
    __obj.asInstanceOf[RequestLoggerConfiguration]
  }
}

