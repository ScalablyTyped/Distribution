package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartDataLabelPosition extends js.Object

/**
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartDataLabelPosition")
@js.native
object ChartDataLabelPosition extends js.Object {
  @js.native
  sealed trait bestFit
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait bottom
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait callout
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait center
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait insideBase
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait insideEnd
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait invalid
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait left
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait outsideEnd
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait right
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  @js.native
  sealed trait top
    extends officeDashJsLib.ExcelNs.ChartDataLabelPosition
  
  /* "BestFit" */ val bestFit: bestFit with java.lang.String = js.native
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Callout" */ val callout: callout with java.lang.String = js.native
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "InsideBase" */ val insideBase: insideBase with java.lang.String = js.native
  /* "InsideEnd" */ val insideEnd: insideEnd with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "OutsideEnd" */ val outsideEnd: outsideEnd with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartDataLabelPosition with java.lang.String] = js.native
}

