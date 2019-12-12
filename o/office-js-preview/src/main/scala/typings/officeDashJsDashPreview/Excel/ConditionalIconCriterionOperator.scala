package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ConditionalIconCriterionOperator.greaterThan
import typings.officeDashJsDashPreview.Excel.ConditionalIconCriterionOperator.greaterThanOrEqual
import typings.officeDashJsDashPreview.Excel.ConditionalIconCriterionOperator.invalid
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalIconCriterionOperator with String] = js.native
  /* "GreaterThan" */ @js.native
  object greaterThan extends TopLevel[greaterThan with String]
  
  /* "GreaterThanOrEqual" */ @js.native
  object greaterThanOrEqual extends TopLevel[greaterThanOrEqual with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
}

