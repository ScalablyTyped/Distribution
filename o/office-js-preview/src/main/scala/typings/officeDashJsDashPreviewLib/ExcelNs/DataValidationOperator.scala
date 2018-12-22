package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationOperator extends js.Object

/**
     *
     * Represents Data validation operator enum.
     *
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.DataValidationOperator")
@js.native
object DataValidationOperator extends js.Object {
  @js.native
  sealed trait between
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  @js.native
  sealed trait equalTo
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  @js.native
  sealed trait greaterThan
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  @js.native
  sealed trait greaterThanOrEqualTo
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  @js.native
  sealed trait lessThan
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  @js.native
  sealed trait lessThanOrEqualTo
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  @js.native
  sealed trait notBetween
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  @js.native
  sealed trait notEqualTo
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator
  
  /* "Between" */ val between: between with java.lang.String = js.native
  /* "EqualTo" */ val equalTo: equalTo with java.lang.String = js.native
  /* "GreaterThan" */ val greaterThan: greaterThan with java.lang.String = js.native
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: greaterThanOrEqualTo with java.lang.String = js.native
  /* "LessThan" */ val lessThan: lessThan with java.lang.String = js.native
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: lessThanOrEqualTo with java.lang.String = js.native
  /* "NotBetween" */ val notBetween: notBetween with java.lang.String = js.native
  /* "NotEqualTo" */ val notEqualTo: notEqualTo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DataValidationOperator with java.lang.String] = js.native
}

