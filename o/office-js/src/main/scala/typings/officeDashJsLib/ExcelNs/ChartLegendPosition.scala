package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLegendPosition extends js.Object

/**
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartLegendPosition")
@js.native
object ChartLegendPosition extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsLib.ExcelNs.ChartLegendPosition
  
  @js.native
  sealed trait corner
    extends officeDashJsLib.ExcelNs.ChartLegendPosition
  
  @js.native
  sealed trait custom
    extends officeDashJsLib.ExcelNs.ChartLegendPosition
  
  @js.native
  sealed trait invalid
    extends officeDashJsLib.ExcelNs.ChartLegendPosition
  
  @js.native
  sealed trait left
    extends officeDashJsLib.ExcelNs.ChartLegendPosition
  
  @js.native
  sealed trait right
    extends officeDashJsLib.ExcelNs.ChartLegendPosition
  
  @js.native
  sealed trait top
    extends officeDashJsLib.ExcelNs.ChartLegendPosition
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Corner" */ val corner: corner with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartLegendPosition with java.lang.String] = js.native
}

