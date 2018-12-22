package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeUnderlineStyle extends js.Object

/**
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.RangeUnderlineStyle")
@js.native
object RangeUnderlineStyle extends js.Object {
  @js.native
  sealed trait double
    extends officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle
  
  @js.native
  sealed trait doubleAccountant
    extends officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle
  
  @js.native
  sealed trait single
    extends officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle
  
  @js.native
  sealed trait singleAccountant
    extends officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle
  
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "DoubleAccountant" */ val doubleAccountant: doubleAccountant with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Single" */ val single: single with java.lang.String = js.native
  /* "SingleAccountant" */ val singleAccountant: singleAccountant with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle with java.lang.String] = js.native
}

