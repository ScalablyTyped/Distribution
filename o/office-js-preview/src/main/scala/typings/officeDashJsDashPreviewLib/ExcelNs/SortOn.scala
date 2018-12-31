package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOn extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOn")
@js.native
object SortOn extends js.Object {
  @js.native
  sealed trait cellColor
    extends officeDashJsDashPreviewLib.ExcelNs.SortOn
  
  @js.native
  sealed trait fontColor
    extends officeDashJsDashPreviewLib.ExcelNs.SortOn
  
  @js.native
  sealed trait icon
    extends officeDashJsDashPreviewLib.ExcelNs.SortOn
  
  @js.native
  sealed trait value
    extends officeDashJsDashPreviewLib.ExcelNs.SortOn
  
  /* "CellColor" */ val cellColor: cellColor with java.lang.String = js.native
  /* "FontColor" */ val fontColor: fontColor with java.lang.String = js.native
  /* "Icon" */ val icon: icon with java.lang.String = js.native
  /* "Value" */ val value: value with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.SortOn with java.lang.String] = js.native
}

