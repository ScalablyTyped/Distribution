package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalRangeFontUnderlineStyle extends js.Object

/**
     * [Api set: ExcelApi 1.6]
     */
@JSGlobal("Excel.ConditionalRangeFontUnderlineStyle")
@js.native
object ConditionalRangeFontUnderlineStyle extends js.Object {
  @js.native
  sealed trait double
    extends officeDashJsLib.ExcelNs.ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait single
    extends officeDashJsLib.ExcelNs.ConditionalRangeFontUnderlineStyle
  
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Single" */ val single: single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ConditionalRangeFontUnderlineStyle with java.lang.String] = js.native
}

