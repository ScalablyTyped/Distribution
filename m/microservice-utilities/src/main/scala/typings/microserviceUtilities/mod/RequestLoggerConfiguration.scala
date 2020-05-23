package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerConfiguration extends js.Object {
  var extendErrorObjects: js.UndefOr[Boolean] = js.undefined
  var jsonSpace: js.UndefOr[Double] = js.undefined
  var logFunction: js.UndefOr[js.Function1[/* msg */ js.Any, Unit]] = js.undefined
}

object RequestLoggerConfiguration {
  @scala.inline
  def apply(
    extendErrorObjects: js.UndefOr[Boolean] = js.undefined,
    jsonSpace: js.UndefOr[Double] = js.undefined,
    logFunction: /* msg */ js.Any => Unit = null
  ): RequestLoggerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extendErrorObjects)) __obj.updateDynamic("extendErrorObjects")(extendErrorObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonSpace)) __obj.updateDynamic("jsonSpace")(jsonSpace.get.asInstanceOf[js.Any])
    if (logFunction != null) __obj.updateDynamic("logFunction")(js.Any.fromFunction1(logFunction))
    __obj.asInstanceOf[RequestLoggerConfiguration]
  }
}

