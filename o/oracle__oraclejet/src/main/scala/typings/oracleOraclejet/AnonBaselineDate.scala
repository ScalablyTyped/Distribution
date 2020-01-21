package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaselineDate extends js.Object {
  var baselineDate: js.UndefOr[AnonAutoConverter] = js.undefined
  var baselineEnd: js.UndefOr[AnonAutoConverter] = js.undefined
  var baselineStart: js.UndefOr[AnonAutoConverter] = js.undefined
  var date: js.UndefOr[AnonAutoConverter] = js.undefined
  var end: js.UndefOr[AnonAutoConverter] = js.undefined
  var label: js.UndefOr[AnonAutoOffTooltipDisplayTooltipLabel] = js.undefined
  var progress: js.UndefOr[AnonAutoConverterOff] = js.undefined
  var row: js.UndefOr[AnonAutoOffTooltipDisplayTooltipLabel] = js.undefined
  var start: js.UndefOr[AnonAutoConverter] = js.undefined
}

object AnonBaselineDate {
  @scala.inline
  def apply(
    baselineDate: AnonAutoConverter = null,
    baselineEnd: AnonAutoConverter = null,
    baselineStart: AnonAutoConverter = null,
    date: AnonAutoConverter = null,
    end: AnonAutoConverter = null,
    label: AnonAutoOffTooltipDisplayTooltipLabel = null,
    progress: AnonAutoConverterOff = null,
    row: AnonAutoOffTooltipDisplayTooltipLabel = null,
    start: AnonAutoConverter = null
  ): AnonBaselineDate = {
    val __obj = js.Dynamic.literal()
    if (baselineDate != null) __obj.updateDynamic("baselineDate")(baselineDate.asInstanceOf[js.Any])
    if (baselineEnd != null) __obj.updateDynamic("baselineEnd")(baselineEnd.asInstanceOf[js.Any])
    if (baselineStart != null) __obj.updateDynamic("baselineStart")(baselineStart.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaselineDate]
  }
}

