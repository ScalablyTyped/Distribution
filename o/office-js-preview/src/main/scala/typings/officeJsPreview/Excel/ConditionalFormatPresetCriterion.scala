package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalFormatPresetCriterion extends StObject
/**
  *
  * Represents the criteria for the Preset Criteria conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatPresetCriterion")
@js.native
object ConditionalFormatPresetCriterion extends StObject {
  
  @js.native
  sealed trait aboveAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait belowAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait blanks
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait duplicateValues
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrAboveAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait equalOrBelowAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait errors
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait invalid
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastMonth
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastSevenDays
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait lastWeek
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextMonth
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nextWeek
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonBlanks
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait nonErrors
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevAboveAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait oneStdDevBelowAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisMonth
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait thisWeek
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevAboveAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait threeStdDevBelowAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait today
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait tomorrow
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevAboveAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait twoStdDevBelowAverage
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait uniqueValues
    extends StObject
       with ConditionalFormatPresetCriterion
  
  @js.native
  sealed trait yesterday
    extends StObject
       with ConditionalFormatPresetCriterion
}
