package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmpmWheelLabel extends js.Object {
  var ampmWheelLabel: js.UndefOr[String] = js.undefined
  var cancelText: js.UndefOr[String] = js.undefined
  var currentTimeText: js.UndefOr[String] = js.undefined
  var dateTimeRange: js.UndefOr[Anon_HintMessageDetail] = js.undefined
  var hourWheelLabel: js.UndefOr[String] = js.undefined
  var minuteWheelLabel: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[Anon_MessageDetail] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
  var tooltipTime: js.UndefOr[String] = js.undefined
  var tooltipTimeDisabled: js.UndefOr[String] = js.undefined
}

object Anon_AmpmWheelLabel {
  @scala.inline
  def apply(
    ampmWheelLabel: String = null,
    cancelText: String = null,
    currentTimeText: String = null,
    dateTimeRange: Anon_HintMessageDetail = null,
    hourWheelLabel: String = null,
    minuteWheelLabel: String = null,
    okText: String = null,
    regexp: Anon_MessageDetail = null,
    required: Anon_Hint = null,
    tooltipTime: String = null,
    tooltipTimeDisabled: String = null
  ): Anon_AmpmWheelLabel = {
    val __obj = js.Dynamic.literal()
    if (ampmWheelLabel != null) __obj.updateDynamic("ampmWheelLabel")(ampmWheelLabel)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (currentTimeText != null) __obj.updateDynamic("currentTimeText")(currentTimeText)
    if (dateTimeRange != null) __obj.updateDynamic("dateTimeRange")(dateTimeRange)
    if (hourWheelLabel != null) __obj.updateDynamic("hourWheelLabel")(hourWheelLabel)
    if (minuteWheelLabel != null) __obj.updateDynamic("minuteWheelLabel")(minuteWheelLabel)
    if (okText != null) __obj.updateDynamic("okText")(okText)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    if (required != null) __obj.updateDynamic("required")(required)
    if (tooltipTime != null) __obj.updateDynamic("tooltipTime")(tooltipTime)
    if (tooltipTimeDisabled != null) __obj.updateDynamic("tooltipTimeDisabled")(tooltipTimeDisabled)
    __obj.asInstanceOf[Anon_AmpmWheelLabel]
  }
}

