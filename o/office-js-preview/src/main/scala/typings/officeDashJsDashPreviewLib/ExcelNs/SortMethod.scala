package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait pinYin
    extends officeDashJsDashPreviewLib.ExcelNs.SortMethod
  
  @js.native
  sealed trait strokeCount
    extends officeDashJsDashPreviewLib.ExcelNs.SortMethod
  
  /* "PinYin" */ val pinYin: pinYin with java.lang.String = js.native
  /* "StrokeCount" */ val strokeCount: strokeCount with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.SortMethod with java.lang.String] = js.native
}

