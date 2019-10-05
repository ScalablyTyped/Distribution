package typings.officeDashJs.Excel

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
  
  /* "AboveAverage" */ val aboveAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.aboveAverage with String = js.native
  /* "BelowAverage" */ val belowAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.belowAverage with String = js.native
  /* "Blanks" */ val blanks: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.blanks with String = js.native
  /* "DuplicateValues" */ val duplicateValues: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.duplicateValues with String = js.native
  /* "EqualOrAboveAverage" */ val equalOrAboveAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.equalOrAboveAverage with String = js.native
  /* "EqualOrBelowAverage" */ val equalOrBelowAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.equalOrBelowAverage with String = js.native
  /* "Errors" */ val errors: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.errors with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.invalid with String = js.native
  /* "LastMonth" */ val lastMonth: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.lastMonth with String = js.native
  /* "LastSevenDays" */ val lastSevenDays: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.lastSevenDays with String = js.native
  /* "LastWeek" */ val lastWeek: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.lastWeek with String = js.native
  /* "NextMonth" */ val nextMonth: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.nextMonth with String = js.native
  /* "NextWeek" */ val nextWeek: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.nextWeek with String = js.native
  /* "NonBlanks" */ val nonBlanks: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.nonBlanks with String = js.native
  /* "NonErrors" */ val nonErrors: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.nonErrors with String = js.native
  /* "OneStdDevAboveAverage" */ val oneStdDevAboveAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.oneStdDevAboveAverage with String = js.native
  /* "OneStdDevBelowAverage" */ val oneStdDevBelowAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.oneStdDevBelowAverage with String = js.native
  /* "ThisMonth" */ val thisMonth: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.thisMonth with String = js.native
  /* "ThisWeek" */ val thisWeek: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.thisWeek with String = js.native
  /* "ThreeStdDevAboveAverage" */ val threeStdDevAboveAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.threeStdDevAboveAverage with String = js.native
  /* "ThreeStdDevBelowAverage" */ val threeStdDevBelowAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.threeStdDevBelowAverage with String = js.native
  /* "Today" */ val today: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.today with String = js.native
  /* "Tomorrow" */ val tomorrow: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.tomorrow with String = js.native
  /* "TwoStdDevAboveAverage" */ val twoStdDevAboveAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.twoStdDevAboveAverage with String = js.native
  /* "TwoStdDevBelowAverage" */ val twoStdDevBelowAverage: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.twoStdDevBelowAverage with String = js.native
  /* "UniqueValues" */ val uniqueValues: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.uniqueValues with String = js.native
  /* "Yesterday" */ val yesterday: typings.officeDashJs.Excel.ConditionalFormatPresetCriterion.yesterday with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatPresetCriterion with String] = js.native
}

