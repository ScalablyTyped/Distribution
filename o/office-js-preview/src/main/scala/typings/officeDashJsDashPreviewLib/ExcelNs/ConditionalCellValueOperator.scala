package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalCellValueOperator extends js.Object

/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalCellValueOperator")
@js.native
object ConditionalCellValueOperator extends js.Object {
  @js.native
  sealed trait between
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait equalTo
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThan
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThanOrEqual
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThan
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThanOrEqual
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait notBetween
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  @js.native
  sealed trait notEqualTo
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator
  
  /* "Between" */ val between: between with java.lang.String = js.native
  /* "EqualTo" */ val equalTo: equalTo with java.lang.String = js.native
  /* "GreaterThan" */ val greaterThan: greaterThan with java.lang.String = js.native
  /* "GreaterThanOrEqual" */ val greaterThanOrEqual: greaterThanOrEqual with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "LessThan" */ val lessThan: lessThan with java.lang.String = js.native
  /* "LessThanOrEqual" */ val lessThanOrEqual: lessThanOrEqual with java.lang.String = js.native
  /* "NotBetween" */ val notBetween: notBetween with java.lang.String = js.native
  /* "NotEqualTo" */ val notEqualTo: notEqualTo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalCellValueOperator with java.lang.String
  ] = js.native
}

