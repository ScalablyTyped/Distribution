package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait single
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalRangeFontUnderlineStyle
  
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Single" */ val single: single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalRangeFontUnderlineStyle with java.lang.String
  ] = js.native
}

