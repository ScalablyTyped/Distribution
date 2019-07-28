package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var currentText: js.UndefOr[String] = js.undefined
  var dateRestriction: js.UndefOr[Anon_Hint] = js.undefined
  var dateTimeRange: js.UndefOr[Anon_HintMessageDetail] = js.undefined
  var done: js.UndefOr[String] = js.undefined
  var nextText: js.UndefOr[String] = js.undefined
  var prevText: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[Anon_MessageDetail] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
  var tooltipCalendar: js.UndefOr[String] = js.undefined
  var tooltipCalendarDisabled: js.UndefOr[String] = js.undefined
  var tooltipCalendarTime: js.UndefOr[String] = js.undefined
  var tooltipCalendarTimeDisabled: js.UndefOr[String] = js.undefined
  var weekHeader: js.UndefOr[String] = js.undefined
}

object Anon_Cancel {
  @scala.inline
  def apply(
    cancel: String = null,
    currentText: String = null,
    dateRestriction: Anon_Hint = null,
    dateTimeRange: Anon_HintMessageDetail = null,
    done: String = null,
    nextText: String = null,
    prevText: String = null,
    regexp: Anon_MessageDetail = null,
    required: Anon_Hint = null,
    tooltipCalendar: String = null,
    tooltipCalendarDisabled: String = null,
    tooltipCalendarTime: String = null,
    tooltipCalendarTimeDisabled: String = null,
    weekHeader: String = null
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (currentText != null) __obj.updateDynamic("currentText")(currentText)
    if (dateRestriction != null) __obj.updateDynamic("dateRestriction")(dateRestriction)
    if (dateTimeRange != null) __obj.updateDynamic("dateTimeRange")(dateTimeRange)
    if (done != null) __obj.updateDynamic("done")(done)
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    if (required != null) __obj.updateDynamic("required")(required)
    if (tooltipCalendar != null) __obj.updateDynamic("tooltipCalendar")(tooltipCalendar)
    if (tooltipCalendarDisabled != null) __obj.updateDynamic("tooltipCalendarDisabled")(tooltipCalendarDisabled)
    if (tooltipCalendarTime != null) __obj.updateDynamic("tooltipCalendarTime")(tooltipCalendarTime)
    if (tooltipCalendarTimeDisabled != null) __obj.updateDynamic("tooltipCalendarTimeDisabled")(tooltipCalendarTimeDisabled)
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

