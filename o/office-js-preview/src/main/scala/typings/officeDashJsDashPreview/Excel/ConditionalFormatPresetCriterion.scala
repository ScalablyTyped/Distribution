package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatPresetCriterion with String] = js.native
  /* "AboveAverage" */ @js.native
  object aboveAverage extends TopLevel[aboveAverage with String]
  
  /* "BelowAverage" */ @js.native
  object belowAverage extends TopLevel[belowAverage with String]
  
  /* "Blanks" */ @js.native
  object blanks extends TopLevel[blanks with String]
  
  /* "DuplicateValues" */ @js.native
  object duplicateValues extends TopLevel[duplicateValues with String]
  
  /* "EqualOrAboveAverage" */ @js.native
  object equalOrAboveAverage extends TopLevel[equalOrAboveAverage with String]
  
  /* "EqualOrBelowAverage" */ @js.native
  object equalOrBelowAverage extends TopLevel[equalOrBelowAverage with String]
  
  /* "Errors" */ @js.native
  object errors extends TopLevel[errors with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "LastMonth" */ @js.native
  object lastMonth extends TopLevel[lastMonth with String]
  
  /* "LastSevenDays" */ @js.native
  object lastSevenDays extends TopLevel[lastSevenDays with String]
  
  /* "LastWeek" */ @js.native
  object lastWeek extends TopLevel[lastWeek with String]
  
  /* "NextMonth" */ @js.native
  object nextMonth extends TopLevel[nextMonth with String]
  
  /* "NextWeek" */ @js.native
  object nextWeek extends TopLevel[nextWeek with String]
  
  /* "NonBlanks" */ @js.native
  object nonBlanks extends TopLevel[nonBlanks with String]
  
  /* "NonErrors" */ @js.native
  object nonErrors extends TopLevel[nonErrors with String]
  
  /* "OneStdDevAboveAverage" */ @js.native
  object oneStdDevAboveAverage extends TopLevel[oneStdDevAboveAverage with String]
  
  /* "OneStdDevBelowAverage" */ @js.native
  object oneStdDevBelowAverage extends TopLevel[oneStdDevBelowAverage with String]
  
  /* "ThisMonth" */ @js.native
  object thisMonth extends TopLevel[thisMonth with String]
  
  /* "ThisWeek" */ @js.native
  object thisWeek extends TopLevel[thisWeek with String]
  
  /* "ThreeStdDevAboveAverage" */ @js.native
  object threeStdDevAboveAverage extends TopLevel[threeStdDevAboveAverage with String]
  
  /* "ThreeStdDevBelowAverage" */ @js.native
  object threeStdDevBelowAverage extends TopLevel[threeStdDevBelowAverage with String]
  
  /* "Today" */ @js.native
  object today extends TopLevel[today with String]
  
  /* "Tomorrow" */ @js.native
  object tomorrow extends TopLevel[tomorrow with String]
  
  /* "TwoStdDevAboveAverage" */ @js.native
  object twoStdDevAboveAverage extends TopLevel[twoStdDevAboveAverage with String]
  
  /* "TwoStdDevBelowAverage" */ @js.native
  object twoStdDevBelowAverage extends TopLevel[twoStdDevBelowAverage with String]
  
  /* "UniqueValues" */ @js.native
  object uniqueValues extends TopLevel[uniqueValues with String]
  
  /* "Yesterday" */ @js.native
  object yesterday extends TopLevel[yesterday with String]
  
}

