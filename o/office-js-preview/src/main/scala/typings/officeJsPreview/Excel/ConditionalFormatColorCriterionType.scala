package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalFormatColorCriterionType extends StObject
/**
  *
  * Represents the types of color criterion for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatColorCriterionType")
@js.native
object ConditionalFormatColorCriterionType extends StObject {
  
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
