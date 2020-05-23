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
    precision: js.UndefOr[Double] = js.undefined,
    preserve: js.UndefOr[Boolean] = js.undefined,
    selectors: js.UndefOr[Boolean] = js.undefined,
    warnWhenCannotResolve: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mediaQueries)) __obj.updateDynamic("mediaQueries")(mediaQueries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectors)) __obj.updateDynamic("selectors")(selectors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warnWhenCannotResolve)) __obj.updateDynamic("warnWhenCannotResolve")(warnWhenCannotResolve.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

