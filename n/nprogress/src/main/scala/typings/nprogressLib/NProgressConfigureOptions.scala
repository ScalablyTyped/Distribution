package typings
package nprogressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NProgressConfigureOptions extends js.Object {
  /**
    * The CSS easing animation to use. Default is 'linear'.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The minimum progress percentage. Default is 0.08.
    */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS selector to change the parent DOM element of the progress. Default is body.
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to show the spinner. Defaults to true. Default is true.
    */
  var showSpinner: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The animation speed in milliseconds. Default is 200.
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTML markup inserted for the progress indicator. To keep the progress bar working, keep an element with role='bar' in there.
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable trickling the progress. Default is true.
    */
  var trickle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How often to trickle, in milliseconds. Default is 800.
    */
  var trickleSpeed: js.UndefOr[scala.Double] = js.undefined
}

object NProgressConfigureOptions {
  @scala.inline
  def apply(
    easing: java.lang.String = null,
    minimum: scala.Int | scala.Double = null,
    parent: java.lang.String = null,
    showSpinner: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    template: java.lang.String = null,
    trickle: js.UndefOr[scala.Boolean] = js.undefined,
    trickleSpeed: scala.Int | scala.Double = null
  ): NProgressConfigureOptions = {
    val __obj = js.Dynamic.literal()
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(showSpinner)) __obj.updateDynamic("showSpinner")(showSpinner)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(trickle)) __obj.updateDynamic("trickle")(trickle)
    if (trickleSpeed != null) __obj.updateDynamic("trickleSpeed")(trickleSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[NProgressConfigureOptions]
  }
}

