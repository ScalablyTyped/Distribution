package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalFormatRuleType extends StObject
/**
  *
  * Represents the types of conditional format values.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatRuleType")
@js.native
object ConditionalFormatRuleType extends StObject {
  
  @js.native
  sealed trait automatic
    extends StObject
       with ConditionalFormatRuleType
  
  @js.native
  sealed trait formula
    extends StObject
       with ConditionalFormatRuleType
  
  @js.native
  sealed trait highestValue
    extends StObject
       with ConditionalFormatRuleType
  
  @js.native
  sealed trait invalid
    extends StObject
       with ConditionalFormatRuleType
  
  @js.native
  sealed trait lowestValue
    extends StObject
       with ConditionalFormatRuleType
  
  @js.native
  sealed trait number
    extends StObject
       with ConditionalFormatRuleType
  
  @js.native
  sealed trait percent
    extends StObject
       with ConditionalFormatRuleType
  
  @js.native
  sealed trait percentile
    extends StObject
       with ConditionalFormatRuleType
}
