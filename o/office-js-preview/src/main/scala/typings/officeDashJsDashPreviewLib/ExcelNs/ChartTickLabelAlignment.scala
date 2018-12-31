package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTickLabelAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartTickLabelAlignment")
@js.native
object ChartTickLabelAlignment extends js.Object {
  @js.native
  sealed trait center
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTickLabelAlignment
  
  @js.native
  sealed trait left
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTickLabelAlignment
  
  @js.native
  sealed trait right
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTickLabelAlignment
  
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartTickLabelAlignment with java.lang.String] = js.native
}

