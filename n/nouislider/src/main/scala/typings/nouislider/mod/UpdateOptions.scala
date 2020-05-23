package typings.nouislider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nouislider.nouisliderStrings.horizontal
import typings.nouislider.nouisliderStrings.lower
import typings.nouislider.nouisliderStrings.ltr
import typings.nouislider.nouisliderStrings.rtl
import typings.nouislider.nouisliderStrings.upper
import typings.nouislider.nouisliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update options that can not be updated will be ignored without errors.
  * The value null can be used to unset a previously set value.
  */
/* Inlined std.Partial<nouislider.nouislider.Options> */
trait UpdateOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var behaviour: js.UndefOr[String] = js.undefined
  var connect: js.UndefOr[lower | upper | Boolean | js.Array[Boolean]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var pips: js.UndefOr[PipsOptions] = js.undefined
  var range: js.UndefOr[StringDictionary[Double | js.Array[Double]]] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Double | (js.Array[js.Array[Double] | Double])] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var tooltips: js.UndefOr[Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    behaviour: String = null,
    connect: lower | upper | Boolean | js.Array[Boolean] = null,
    direction: ltr | rtl = null,
    format: js.Object | (js.Function1[/* repeated */ js.Any, _]) = null,
    limit: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    orientation: vertical | horizontal = null,
    padding: js.UndefOr[Double] = js.undefined,
    pips: PipsOptions = null,
    range: StringDictionary[Double | js.Array[Double]] = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    start: Double | (js.Array[js.Array[Double] | Double]) = null,
    step: js.UndefOr[Double] = js.undefined,
    tooltips: Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _]) = null
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (behaviour != null) __obj.updateDynamic("behaviour")(behaviour.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (pips != null) __obj.updateDynamic("pips")(pips.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

