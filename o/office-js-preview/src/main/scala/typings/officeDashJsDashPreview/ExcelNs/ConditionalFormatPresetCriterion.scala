package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "AboveAverage" */ val aboveAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.aboveAverage with String = js.native
  /* "BelowAverage" */ val belowAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.belowAverage with String = js.native
  /* "Blanks" */ val blanks: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.blanks with String = js.native
  /* "DuplicateValues" */ val duplicateValues: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.duplicateValues with String = js.native
  /* "EqualOrAboveAverage" */ val equalOrAboveAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.equalOrAboveAverage with String = js.native
  /* "EqualOrBelowAverage" */ val equalOrBelowAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.equalOrBelowAverage with String = js.native
  /* "Errors" */ val errors: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.errors with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.invalid with String = js.native
  /* "LastMonth" */ val lastMonth: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.lastMonth with String = js.native
  /* "LastSevenDays" */ val lastSevenDays: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.lastSevenDays with String = js.native
  /* "LastWeek" */ val lastWeek: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.lastWeek with String = js.native
  /* "NextMonth" */ val nextMonth: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.nextMonth with String = js.native
  /* "NextWeek" */ val nextWeek: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.nextWeek with String = js.native
  /* "NonBlanks" */ val nonBlanks: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.nonBlanks with String = js.native
  /* "NonErrors" */ val nonErrors: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.nonErrors with String = js.native
  /* "OneStdDevAboveAverage" */ val oneStdDevAboveAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.oneStdDevAboveAverage with String = js.native
  /* "OneStdDevBelowAverage" */ val oneStdDevBelowAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.oneStdDevBelowAverage with String = js.native
  /* "ThisMonth" */ val thisMonth: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.thisMonth with String = js.native
  /* "ThisWeek" */ val thisWeek: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.thisWeek with String = js.native
  /* "ThreeStdDevAboveAverage" */ val threeStdDevAboveAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.threeStdDevAboveAverage with String = js.native
  /* "ThreeStdDevBelowAverage" */ val threeStdDevBelowAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.threeStdDevBelowAverage with String = js.native
  /* "Today" */ val today: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.today with String = js.native
  /* "Tomorrow" */ val tomorrow: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.tomorrow with String = js.native
  /* "TwoStdDevAboveAverage" */ val twoStdDevAboveAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.twoStdDevAboveAverage with String = js.native
  /* "TwoStdDevBelowAverage" */ val twoStdDevBelowAverage: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.twoStdDevBelowAverage with String = js.native
  /* "UniqueValues" */ val uniqueValues: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.uniqueValues with String = js.native
  /* "Yesterday" */ val yesterday: typings.officeDashJsDashPreview.ExcelNs.ConditionalFormatPresetCriterion.yesterday with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatPresetCriterion with String] = js.native
}

