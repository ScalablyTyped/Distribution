package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaselineDate extends js.Object {
  var baselineDate: js.UndefOr[Anon_AutoConverter] = js.undefined
  var baselineEnd: js.UndefOr[Anon_AutoConverter] = js.undefined
  var baselineStart: js.UndefOr[Anon_AutoConverter] = js.undefined
  var date: js.UndefOr[Anon_AutoConverter] = js.undefined
  var end: js.UndefOr[Anon_AutoConverter] = js.undefined
  var label: js.UndefOr[Anon_AutoOffTooltipDisplayTooltipLabel] = js.undefined
  var progress: js.UndefOr[Anon_AutoConverterOff] = js.undefined
  var row: js.UndefOr[Anon_AutoOffTooltipDisplayTooltipLabel] = js.undefined
  var start: js.UndefOr[Anon_AutoConverter] = js.undefined
}

object Anon_BaselineDate {
  @scala.inline
  def apply(
    baselineDate: Anon_AutoConverter = null,
    baselineEnd: Anon_AutoConverter = null,
    baselineStart: Anon_AutoConverter = null,
    date: Anon_AutoConverter = null,
    end: Anon_AutoConverter = null,
    label: Anon_AutoOffTooltipDisplayTooltipLabel = null,
    progress: Anon_AutoConverterOff = null,
    row: Anon_AutoOffTooltipDisplayTooltipLabel = null,
    start: Anon_AutoConverter = null
  ): Anon_BaselineDate = {
    val __obj = js.Dynamic.literal()
    if (baselineDate != null) __obj.updateDynamic("baselineDate")(baselineDate)
    if (baselineEnd != null) __obj.updateDynamic("baselineEnd")(baselineEnd)
    if (baselineStart != null) __obj.updateDynamic("baselineStart")(baselineStart)
    if (date != null) __obj.updateDynamic("date")(date)
    if (end != null) __obj.updateDynamic("end")(end)
    if (label != null) __obj.updateDynamic("label")(label)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (row != null) __obj.updateDynamic("row")(row)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_BaselineDate]
  }
}

