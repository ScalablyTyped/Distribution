package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatColorCriterionType extends js.Object

/**
  *
  * Represents the types of color criterion for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatColorCriterionType")
@js.native
object ConditionalFormatColorCriterionType extends js.Object {
  @js.native
  sealed trait formula extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait highestValue extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait invalid extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait lowestValue extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait number extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percent extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percentile extends ConditionalFormatColorCriterionType
  
}

