package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait double extends ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait none extends ConditionalRangeFontUnderlineStyle
  
  @js.native
  sealed trait single extends ConditionalRangeFontUnderlineStyle
  
  /* "Double" */ val double: typings.officeDashJsDashPreview.ExcelNs.ConditionalRangeFontUnderlineStyle.double with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.ExcelNs.ConditionalRangeFontUnderlineStyle.none with String = js.native
  /* "Single" */ val single: typings.officeDashJsDashPreview.ExcelNs.ConditionalRangeFontUnderlineStyle.single with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeFontUnderlineStyle with String] = js.native
}

