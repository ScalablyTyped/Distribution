package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalIconCriterionOperator extends js.Object

/**
  *
  * Represents the operator for each icon criteria.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalIconCriterionOperator")
@js.native
object ConditionalIconCriterionOperator extends js.Object {
  @js.native
  sealed trait greaterThan extends ConditionalIconCriterionOperator
  
  @js.native
  sealed trait greaterThanOrEqual extends ConditionalIconCriterionOperator
  
  @js.native
  sealed trait invalid extends ConditionalIconCriterionOperator
  
}

