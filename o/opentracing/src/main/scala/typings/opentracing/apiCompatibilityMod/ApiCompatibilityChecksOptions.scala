package typings.opentracing.apiCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiCompatibilityChecksOptions extends js.Object {
  /** a boolean that controls whether or not to verify certain API functionality */
  var skipBaggageChecks: js.UndefOr[Boolean] = js.undefined
  var skipInjectExtractChecks: js.UndefOr[Boolean] = js.undefined
}

object ApiCompatibilityChecksOptions {
  @scala.inline
  def apply(
    skipBaggageChecks: js.UndefOr[Boolean] = js.undefined,
    skipInjectExtractChecks: js.UndefOr[Boolean] = js.undefined
  ): ApiCompatibilityChecksOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipBaggageChecks)) __obj.updateDynamic("skipBaggageChecks")(skipBaggageChecks.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInjectExtractChecks)) __obj.updateDynamic("skipInjectExtractChecks")(skipInjectExtractChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiCompatibilityChecksOptions]
  }
}

