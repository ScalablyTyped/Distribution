package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalTextOperator extends js.Object

/**
     *
     * Represents the operator of the text conditional format type.
     *
     * [Api set: ExcelApi 1.6]
     */
@JSGlobal("Excel.ConditionalTextOperator")
@js.native
object ConditionalTextOperator extends js.Object {
  @js.native
  sealed trait beginsWith
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait contains
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait endsWith
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTextOperator
  
  @js.native
  sealed trait notContains
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalTextOperator
  
  /* "BeginsWith" */ val beginsWith: beginsWith with java.lang.String = js.native
  /* "Contains" */ val contains: contains with java.lang.String = js.native
  /* "EndsWith" */ val endsWith: endsWith with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "NotContains" */ val notContains: notContains with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ConditionalTextOperator with java.lang.String] = js.native
}

