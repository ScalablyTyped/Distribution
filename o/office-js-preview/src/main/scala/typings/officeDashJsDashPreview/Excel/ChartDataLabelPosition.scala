package typings.officeDashJsDashPreview.Excel

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
  sealed trait bestFit extends ChartDataLabelPosition
  
  @js.native
  sealed trait bottom extends ChartDataLabelPosition
  
  @js.native
  sealed trait callout extends ChartDataLabelPosition
  
  @js.native
  sealed trait center extends ChartDataLabelPosition
  
  @js.native
  sealed trait insideBase extends ChartDataLabelPosition
  
  @js.native
  sealed trait insideEnd extends ChartDataLabelPosition
  
  @js.native
  sealed trait invalid extends ChartDataLabelPosition
  
  @js.native
  sealed trait left extends ChartDataLabelPosition
  
  @js.native
  sealed trait none extends ChartDataLabelPosition
  
  @js.native
  sealed trait outsideEnd extends ChartDataLabelPosition
  
  @js.native
  sealed trait right extends ChartDataLabelPosition
  
  @js.native
  sealed trait top extends ChartDataLabelPosition
  
  /* "BestFit" */ val bestFit: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.bestFit with String = js.native
  /* "Bottom" */ val bottom: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.bottom with String = js.native
  /* "Callout" */ val callout: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.callout with String = js.native
  /* "Center" */ val center: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.center with String = js.native
  /* "InsideBase" */ val insideBase: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.insideBase with String = js.native
  /* "InsideEnd" */ val insideEnd: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.insideEnd with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.invalid with String = js.native
  /* "Left" */ val left: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.left with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.none with String = js.native
  /* "OutsideEnd" */ val outsideEnd: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.outsideEnd with String = js.native
  /* "Right" */ val right: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.right with String = js.native
  /* "Top" */ val top: typings.officeDashJsDashPreview.Excel.ChartDataLabelPosition.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartDataLabelPosition with String] = js.native
}

