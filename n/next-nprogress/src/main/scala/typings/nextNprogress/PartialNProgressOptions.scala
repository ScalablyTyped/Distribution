package typings.nextNprogress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<nprogress.nprogress.NProgressOptions> */
trait PartialNProgressOptions extends js.Object {
  var barSelector: js.UndefOr[String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
  var positionUsing: js.UndefOr[String] = js.undefined
  var showSpinner: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var spinnerSelector: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var trickle: js.UndefOr[Boolean] = js.undefined
  var trickleSpeed: js.UndefOr[Double] = js.undefined
}

object PartialNProgressOptions {
  @scala.inline
  def apply(
    barSelector: String = null,
    easing: String = null,
    minimum: Int | Double = null,
    parent: String = null,
    positionUsing: String = null,
    showSpinner: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    spinnerSelector: String = null,
    template: String = null,
    trickle: js.UndefOr[Boolean] = js.undefined,
    trickleSpeed: Int | Double = null
  ): PartialNProgressOptions = {
    val __obj = js.Dynamic.literal()
    if (barSelector != null) __obj.updateDynamic("barSelector")(barSelector.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (positionUsing != null) __obj.updateDynamic("positionUsing")(positionUsing.asInstanceOf[js.Any])
    if (!js.isUndefined(showSpinner)) __obj.updateDynamic("showSpinner")(showSpinner.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (spinnerSelector != null) __obj.updateDynamic("spinnerSelector")(spinnerSelector.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(trickle)) __obj.updateDynamic("trickle")(trickle.asInstanceOf[js.Any])
    if (trickleSpeed != null) __obj.updateDynamic("trickleSpeed")(trickleSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialNProgressOptions]
  }
}

