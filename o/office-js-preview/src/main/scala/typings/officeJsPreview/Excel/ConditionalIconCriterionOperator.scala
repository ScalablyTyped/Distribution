package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalIconCriterionOperator extends StObject
/**
  *
  * Represents the operator for each icon criteria.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalIconCriterionOperator")
@js.native
object ConditionalIconCriterionOperator extends StObject {
  
  @js.native
  sealed trait greaterThan extends ConditionalIconCriterionOperator
  
  @js.native
  sealed trait greaterThanOrEqual extends ConditionalIconCriterionOperator
  
  @js.native
  sealed trait invalid extends ConditionalIconCriterionOperator
}
