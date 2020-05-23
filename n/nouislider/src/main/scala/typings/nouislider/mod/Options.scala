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

trait Options extends js.Object {
  /**
    * Set the animate option to false to prevent the slider from animating to a new value with when calling .val().
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * The animationDuration option can be used to set the animation speed assumed by the slider library.
    * In addition to this, you must manually set the CSS (-webkit-)transition property for the .noUi-state-tap .noUi-origin selector.
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * All values on the slider are part of a range. The range has a minimum and maximum value.
    */
  var behaviour: js.UndefOr[String] = js.undefined
  /**
    * The connect option can be used to control the bar between the handles or the edges of the slider.
    * If you are using one handle, set the value to either `upper` or `lower`.
    * For sliders with 2 or more handles, pass an array with a boolean for every connecting element,
    * including the edges of the slider. The length of this array must match the handle `count + 1`.
    * Setting `true` sets the bars between the handles, but not between the handles and the sliders edges.
    */
  var connect: js.UndefOr[lower | upper | Boolean | js.Array[Boolean]] = js.undefined
  /**
    * By default the sliders are top-to-bottom and left-to-right,
    * but you can change this using the direction option,
    * which decides where the upper side of the slider is.
    */
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  /**
    * To format the slider output, noUiSlider offers a format option.
    * Simply specify to and from functions to encode and decode the values.
    * See manual formatting to the right for usage information.
    * By default, noUiSlider will format output with 2 decimals.
    */
  var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  /**
    * The limit option is the opposite of the margin option,
    * limiting the maximum distance between two handles.
    * As with the margin option, the limit option can only be used on linear sliders.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * When using two handles, the minimum distance between the handles can be set using the margin option.
    * The margin value is relative to the value set in 'range'.
    * This option is only available on standard linear sliders.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * The orientation setting can be used to set the slider to "vertical" or "horizontal".
    * Set dimensions! Vertical sliders don't assume a default height, so you'll need to set one.
    * You can use any unit you want, including % or px.
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  /**
    * Padding limits how close to the slider edges handles can be.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Allows you to generate points along the slider.
    */
  var pips: js.UndefOr[PipsOptions] = js.undefined
  /**
    * All values on the slider are part of a range. The range has a minimum and maximum value.
    * The minimum value cannot be equal to the maximum value.
    */
  var range: StringDictionary[Double | js.Array[Double]]
  /**
    * When a non-linear slider has been configured, the snap option can be set to true to force the slider to jump
    * between the specified values.
    */
  var snap: js.UndefOr[Boolean] = js.undefined
  /**
    * The start option sets the number of handles and their start positions, relative to range.
    */
  var start: Double | (js.Array[js.Array[Double] | Double])
  /**
    * By default, the slider slides fluently.
    * In order to make the handles jump between intervals, you can use this option.
    * The step option is relative to the values provided to range.
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * noUiSlider can provide a basic tooltip without using its events system.
    * Set the tooltips option to true to enable.
    * This option can also accept formatting options to format the tooltips content.
    * In that case, pass an array with a formatter for each handle, true to use the default or false to display no tooltip.
    */
  var tooltips: js.UndefOr[Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    range: StringDictionary[Double | js.Array[Double]],
    start: Double | (js.Array[js.Array[Double] | Double]),
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
    snap: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    tooltips: Boolean | js.Object | (js.Function1[/* repeated */ js.Any, _]) = null
  ): Options = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
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
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

