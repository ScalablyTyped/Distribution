package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchScreenshotOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var on_error: js.UndefOr[Boolean] = js.undefined
  var on_failure: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object NightwatchScreenshotOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    on_error: js.UndefOr[Boolean] = js.undefined,
    on_failure: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): NightwatchScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(on_error)) __obj.updateDynamic("on_error")(on_error)
    if (!js.isUndefined(on_failure)) __obj.updateDynamic("on_failure")(on_failure)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[NightwatchScreenshotOptions]
  }
}

