package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortMethod extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortMethod")
@js.native
object SortMethod extends js.Object {
  @js.native
  sealed trait pinYin extends SortMethod
  
  @js.native
  sealed trait strokeCount extends SortMethod
  
  /* "PinYin" */ val pinYin: typings.officeDashJsDashPreview.ExcelNs.SortMethod.pinYin with String = js.native
  /* "StrokeCount" */ val strokeCount: typings.officeDashJsDashPreview.ExcelNs.SortMethod.strokeCount with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortMethod with String] = js.native
}

