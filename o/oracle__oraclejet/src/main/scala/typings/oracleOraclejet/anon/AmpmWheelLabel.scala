package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpmWheelLabel extends js.Object {
  var ampmWheelLabel: js.UndefOr[String] = js.native
  var cancelText: js.UndefOr[String] = js.native
  var currentTimeText: js.UndefOr[String] = js.native
  var dateTimeRange: js.UndefOr[MessageDetail] = js.native
  var hourWheelLabel: js.UndefOr[String] = js.native
  var minuteWheelLabel: js.UndefOr[String] = js.native
  var okText: js.UndefOr[String] = js.native
  var regexp: js.UndefOr[MessageSummary] = js.native
  var required: js.UndefOr[Hint] = js.native
  var tooltipTime: js.UndefOr[String] = js.native
  var tooltipTimeDisabled: js.UndefOr[String] = js.native
}

object AmpmWheelLabel {
  @scala.inline
  def apply(): AmpmWheelLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpmWheelLabel]
  }
  @scala.inline
  implicit class AmpmWheelLabelOps[Self <: AmpmWheelLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmpmWheelLabel(value: String): Self = this.set("ampmWheelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmpmWheelLabel: Self = this.set("ampmWheelLabel", js.undefined)
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setCurrentTimeText(value: String): Self = this.set("currentTimeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTimeText: Self = this.set("currentTimeText", js.undefined)
    @scala.inline
    def setDateTimeRange(value: MessageDetail): Self = this.set("dateTimeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeRange: Self = this.set("dateTimeRange", js.undefined)
    @scala.inline
    def setHourWheelLabel(value: String): Self = this.set("hourWheelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourWheelLabel: Self = this.set("hourWheelLabel", js.undefined)
    @scala.inline
    def setMinuteWheelLabel(value: String): Self = this.set("minuteWheelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteWheelLabel: Self = this.set("minuteWheelLabel", js.undefined)
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setRegexp(value: MessageSummary): Self = this.set("regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    @scala.inline
    def setRequired(value: Hint): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTooltipTime(value: String): Self = this.set("tooltipTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTime: Self = this.set("tooltipTime", js.undefined)
    @scala.inline
    def setTooltipTimeDisabled(value: String): Self = this.set("tooltipTimeDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTimeDisabled: Self = this.set("tooltipTimeDisabled", js.undefined)
  }
  
}

