package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait greaterThan
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalIconCriterionOperator
  
  @js.native
  sealed trait greaterThanOrEqual
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalIconCriterionOperator
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalIconCriterionOperator
  
  /* "GreaterThan" */ val greaterThan: greaterThan with java.lang.String = js.native
  /* "GreaterThanOrEqual" */ val greaterThanOrEqual: greaterThanOrEqual with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalIconCriterionOperator with java.lang.String
  ] = js.native
}

