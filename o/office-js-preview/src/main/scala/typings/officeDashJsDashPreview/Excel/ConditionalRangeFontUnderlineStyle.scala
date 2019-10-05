package typings.officeDashJsDashPreview.Excel

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
  
  /* "Double" */ val double: typings.officeDashJsDashPreview.Excel.ConditionalRangeFontUnderlineStyle.double with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Excel.ConditionalRangeFontUnderlineStyle.none with String = js.native
  /* "Single" */ val single: typings.officeDashJsDashPreview.Excel.ConditionalRangeFontUnderlineStyle.single with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeFontUnderlineStyle with String] = js.native
}

