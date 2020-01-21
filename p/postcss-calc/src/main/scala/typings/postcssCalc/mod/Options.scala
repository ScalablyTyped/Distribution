package typings.postcssCalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mediaQueries: js.UndefOr[Boolean] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var preserve: js.UndefOr[Boolean] = js.undefined
  var selectors: js.UndefOr[Boolean] = js.undefined
  var warnWhenCannotResolve: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    mediaQueries: js.UndefOr[Boolean] = js.undefined,
    precision: Int | Double = null,
    preserve: js.UndefOr[Boolean] = js.undefined,
    selectors: js.UndefOr[Boolean] = js.undefined,
    warnWhenCannotResolve: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mediaQueries)) __obj.updateDynamic("mediaQueries")(mediaQueries.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    if (!js.isUndefined(selectors)) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (!js.isUndefined(warnWhenCannotResolve)) __obj.updateDynamic("warnWhenCannotResolve")(warnWhenCannotResolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

