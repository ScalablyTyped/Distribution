package typings
package officeDashJsLib.ExcelNs

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
  sealed trait aboveAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait belowAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait blanks
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait duplicateValues
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrAboveAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrBelowAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait errors
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait invalid
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastMonth
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastSevenDays
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastWeek
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextMonth
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextWeek
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonBlanks
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonErrors
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevAboveAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevBelowAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisMonth
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisWeek
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevAboveAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevBelowAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait today
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait tomorrow
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevAboveAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevBelowAverage
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait uniqueValues
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait yesterday
    extends officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion
  
  /* "AboveAverage" */ val aboveAverage: aboveAverage with java.lang.String = js.native
  /* "BelowAverage" */ val belowAverage: belowAverage with java.lang.String = js.native
  /* "Blanks" */ val blanks: blanks with java.lang.String = js.native
  /* "DuplicateValues" */ val duplicateValues: duplicateValues with java.lang.String = js.native
  /* "EqualOrAboveAverage" */ val equalOrAboveAverage: equalOrAboveAverage with java.lang.String = js.native
  /* "EqualOrBelowAverage" */ val equalOrBelowAverage: equalOrBelowAverage with java.lang.String = js.native
  /* "Errors" */ val errors: errors with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "LastMonth" */ val lastMonth: lastMonth with java.lang.String = js.native
  /* "LastSevenDays" */ val lastSevenDays: lastSevenDays with java.lang.String = js.native
  /* "LastWeek" */ val lastWeek: lastWeek with java.lang.String = js.native
  /* "NextMonth" */ val nextMonth: nextMonth with java.lang.String = js.native
  /* "NextWeek" */ val nextWeek: nextWeek with java.lang.String = js.native
  /* "NonBlanks" */ val nonBlanks: nonBlanks with java.lang.String = js.native
  /* "NonErrors" */ val nonErrors: nonErrors with java.lang.String = js.native
  /* "OneStdDevAboveAverage" */ val oneStdDevAboveAverage: oneStdDevAboveAverage with java.lang.String = js.native
  /* "OneStdDevBelowAverage" */ val oneStdDevBelowAverage: oneStdDevBelowAverage with java.lang.String = js.native
  /* "ThisMonth" */ val thisMonth: thisMonth with java.lang.String = js.native
  /* "ThisWeek" */ val thisWeek: thisWeek with java.lang.String = js.native
  /* "ThreeStdDevAboveAverage" */ val threeStdDevAboveAverage: threeStdDevAboveAverage with java.lang.String = js.native
  /* "ThreeStdDevBelowAverage" */ val threeStdDevBelowAverage: threeStdDevBelowAverage with java.lang.String = js.native
  /* "Today" */ val today: today with java.lang.String = js.native
  /* "Tomorrow" */ val tomorrow: tomorrow with java.lang.String = js.native
  /* "TwoStdDevAboveAverage" */ val twoStdDevAboveAverage: twoStdDevAboveAverage with java.lang.String = js.native
  /* "TwoStdDevBelowAverage" */ val twoStdDevBelowAverage: twoStdDevBelowAverage with java.lang.String = js.native
  /* "UniqueValues" */ val uniqueValues: uniqueValues with java.lang.String = js.native
  /* "Yesterday" */ val yesterday: yesterday with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConditionalFormatPresetCriterion with java.lang.String] = js.native
}

