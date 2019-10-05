package typings.officeDashJsDashPreview.Excel

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
  
  /* "AboveAverage" */ val aboveAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.aboveAverage with String = js.native
  /* "BelowAverage" */ val belowAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.belowAverage with String = js.native
  /* "Blanks" */ val blanks: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.blanks with String = js.native
  /* "DuplicateValues" */ val duplicateValues: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.duplicateValues with String = js.native
  /* "EqualOrAboveAverage" */ val equalOrAboveAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.equalOrAboveAverage with String = js.native
  /* "EqualOrBelowAverage" */ val equalOrBelowAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.equalOrBelowAverage with String = js.native
  /* "Errors" */ val errors: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.errors with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.invalid with String = js.native
  /* "LastMonth" */ val lastMonth: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.lastMonth with String = js.native
  /* "LastSevenDays" */ val lastSevenDays: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.lastSevenDays with String = js.native
  /* "LastWeek" */ val lastWeek: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.lastWeek with String = js.native
  /* "NextMonth" */ val nextMonth: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.nextMonth with String = js.native
  /* "NextWeek" */ val nextWeek: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.nextWeek with String = js.native
  /* "NonBlanks" */ val nonBlanks: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.nonBlanks with String = js.native
  /* "NonErrors" */ val nonErrors: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.nonErrors with String = js.native
  /* "OneStdDevAboveAverage" */ val oneStdDevAboveAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.oneStdDevAboveAverage with String = js.native
  /* "OneStdDevBelowAverage" */ val oneStdDevBelowAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.oneStdDevBelowAverage with String = js.native
  /* "ThisMonth" */ val thisMonth: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.thisMonth with String = js.native
  /* "ThisWeek" */ val thisWeek: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.thisWeek with String = js.native
  /* "ThreeStdDevAboveAverage" */ val threeStdDevAboveAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.threeStdDevAboveAverage with String = js.native
  /* "ThreeStdDevBelowAverage" */ val threeStdDevBelowAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.threeStdDevBelowAverage with String = js.native
  /* "Today" */ val today: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.today with String = js.native
  /* "Tomorrow" */ val tomorrow: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.tomorrow with String = js.native
  /* "TwoStdDevAboveAverage" */ val twoStdDevAboveAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.twoStdDevAboveAverage with String = js.native
  /* "TwoStdDevBelowAverage" */ val twoStdDevBelowAverage: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.twoStdDevBelowAverage with String = js.native
  /* "UniqueValues" */ val uniqueValues: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.uniqueValues with String = js.native
  /* "Yesterday" */ val yesterday: typings.officeDashJsDashPreview.Excel.ConditionalFormatPresetCriterion.yesterday with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatPresetCriterion with String] = js.native
}

