package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaselineDate extends js.Object {
  var baselineDate: js.UndefOr[ConverterTooltipDisplay] = js.undefined
  var baselineEnd: js.UndefOr[ConverterTooltipDisplay] = js.undefined
  var baselineStart: js.UndefOr[ConverterTooltipDisplay] = js.undefined
  var date: js.UndefOr[ConverterTooltipDisplay] = js.undefined
  var end: js.UndefOr[ConverterTooltipDisplay] = js.undefined
  var label: js.UndefOr[TooltipDisplayTooltipLabel] = js.undefined
  var progress: js.UndefOr[ConverterTooltipDisplayTooltipLabel] = js.undefined
  var row: js.UndefOr[TooltipDisplayTooltipLabel] = js.undefined
  var start: js.UndefOr[ConverterTooltipDisplay] = js.undefined
}

object BaselineDate {
  @scala.inline
  def apply(
    baselineDate: ConverterTooltipDisplay = null,
    baselineEnd: ConverterTooltipDisplay = null,
    baselineStart: ConverterTooltipDisplay = null,
    date: ConverterTooltipDisplay = null,
    end: ConverterTooltipDisplay = null,
    label: TooltipDisplayTooltipLabel = null,
    progress: ConverterTooltipDisplayTooltipLabel = null,
    row: TooltipDisplayTooltipLabel = null,
    start: ConverterTooltipDisplay = null
  ): BaselineDate = {
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
    __obj.asInstanceOf[BaselineDate]
  }
}

