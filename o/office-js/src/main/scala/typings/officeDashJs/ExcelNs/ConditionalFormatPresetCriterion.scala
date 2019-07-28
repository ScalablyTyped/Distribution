package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatPresetCriterion extends js.Object

/**
  *
  * Represents the criteria for the Preset Criteria conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatPresetCriterion")
@js.native
object ConditionalFormatPresetCriterion extends js.Object {
  @js.native
  sealed trait aboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait belowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait blanks extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait duplicateValues extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait errors extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait invalid extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastMonth extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastSevenDays extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastWeek extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextMonth extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextWeek extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonBlanks extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonErrors extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisMonth extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisWeek extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait today extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait tomorrow extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevAboveAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevBelowAverage extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait uniqueValues extends ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait yesterday extends ConditionalFormatPresetCriterion
  
  /* "AboveAverage" */ val aboveAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.aboveAverage with String = js.native
  /* "BelowAverage" */ val belowAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.belowAverage with String = js.native
  /* "Blanks" */ val blanks: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.blanks with String = js.native
  /* "DuplicateValues" */ val duplicateValues: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.duplicateValues with String = js.native
  /* "EqualOrAboveAverage" */ val equalOrAboveAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.equalOrAboveAverage with String = js.native
  /* "EqualOrBelowAverage" */ val equalOrBelowAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.equalOrBelowAverage with String = js.native
  /* "Errors" */ val errors: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.errors with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.invalid with String = js.native
  /* "LastMonth" */ val lastMonth: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.lastMonth with String = js.native
  /* "LastSevenDays" */ val lastSevenDays: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.lastSevenDays with String = js.native
  /* "LastWeek" */ val lastWeek: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.lastWeek with String = js.native
  /* "NextMonth" */ val nextMonth: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.nextMonth with String = js.native
  /* "NextWeek" */ val nextWeek: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.nextWeek with String = js.native
  /* "NonBlanks" */ val nonBlanks: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.nonBlanks with String = js.native
  /* "NonErrors" */ val nonErrors: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.nonErrors with String = js.native
  /* "OneStdDevAboveAverage" */ val oneStdDevAboveAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.oneStdDevAboveAverage with String = js.native
  /* "OneStdDevBelowAverage" */ val oneStdDevBelowAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.oneStdDevBelowAverage with String = js.native
  /* "ThisMonth" */ val thisMonth: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.thisMonth with String = js.native
  /* "ThisWeek" */ val thisWeek: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.thisWeek with String = js.native
  /* "ThreeStdDevAboveAverage" */ val threeStdDevAboveAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.threeStdDevAboveAverage with String = js.native
  /* "ThreeStdDevBelowAverage" */ val threeStdDevBelowAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.threeStdDevBelowAverage with String = js.native
  /* "Today" */ val today: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.today with String = js.native
  /* "Tomorrow" */ val tomorrow: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.tomorrow with String = js.native
  /* "TwoStdDevAboveAverage" */ val twoStdDevAboveAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.twoStdDevAboveAverage with String = js.native
  /* "TwoStdDevBelowAverage" */ val twoStdDevBelowAverage: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.twoStdDevBelowAverage with String = js.native
  /* "UniqueValues" */ val uniqueValues: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.uniqueValues with String = js.native
  /* "Yesterday" */ val yesterday: typings.officeDashJs.ExcelNs.ConditionalFormatPresetCriterion.yesterday with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatPresetCriterion with String] = js.native
}

