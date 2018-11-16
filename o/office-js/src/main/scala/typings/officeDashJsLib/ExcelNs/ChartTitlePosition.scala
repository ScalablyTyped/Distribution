package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTitlePosition extends js.Object

/**
     *
     * Represents the position of chart title.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.ChartTitlePosition")
@js.native
object ChartTitlePosition extends js.Object {
  @js.native
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.ChartTitlePosition
  
  @js.native
  sealed trait bottom
    extends officeDashJsLib.ExcelNs.ChartTitlePosition
  
  @js.native
  sealed trait left
    extends officeDashJsLib.ExcelNs.ChartTitlePosition
  
  @js.native
  sealed trait right
    extends officeDashJsLib.ExcelNs.ChartTitlePosition
  
  @js.native
  sealed trait top
    extends officeDashJsLib.ExcelNs.ChartTitlePosition
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartTitlePosition with java.lang.String] = js.native
}

