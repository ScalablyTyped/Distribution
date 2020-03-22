package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaselineDate extends js.Object {
  var baselineDate: js.UndefOr[AnonConverterTooltipDisplay] = js.undefined
  var baselineEnd: js.UndefOr[AnonConverterTooltipDisplay] = js.undefined
  var baselineStart: js.UndefOr[AnonConverterTooltipDisplay] = js.undefined
  var date: js.UndefOr[AnonConverterTooltipDisplay] = js.undefined
  var end: js.UndefOr[AnonConverterTooltipDisplay] = js.undefined
  var label: js.UndefOr[AnonTooltipDisplayTooltipLabel] = js.undefined
  var progress: js.UndefOr[AnonConverterTooltipDisplayTooltipLabel] = js.undefined
  var row: js.UndefOr[AnonTooltipDisplayTooltipLabel] = js.undefined
  var start: js.UndefOr[AnonConverterTooltipDisplay] = js.undefined
}

object AnonBaselineDate {
  @scala.inline
  def apply(
    baselineDate: AnonConverterTooltipDisplay = null,
    baselineEnd: AnonConverterTooltipDisplay = null,
    baselineStart: AnonConverterTooltipDisplay = null,
    date: AnonConverterTooltipDisplay = null,
    end: AnonConverterTooltipDisplay = null,
    label: AnonTooltipDisplayTooltipLabel = null,
    progress: AnonConverterTooltipDisplayTooltipLabel = null,
    row: AnonTooltipDisplayTooltipLabel = null,
    start: AnonConverterTooltipDisplay = null
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

