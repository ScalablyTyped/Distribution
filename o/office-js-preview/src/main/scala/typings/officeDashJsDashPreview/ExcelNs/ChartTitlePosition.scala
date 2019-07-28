package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait automatic extends ChartTitlePosition
  
  @js.native
  sealed trait bottom extends ChartTitlePosition
  
  @js.native
  sealed trait left extends ChartTitlePosition
  
  @js.native
  sealed trait right extends ChartTitlePosition
  
  @js.native
  sealed trait top extends ChartTitlePosition
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.ExcelNs.ChartTitlePosition.automatic with String = js.native
  /* "Bottom" */ val bottom: typings.officeDashJsDashPreview.ExcelNs.ChartTitlePosition.bottom with String = js.native
  /* "Left" */ val left: typings.officeDashJsDashPreview.ExcelNs.ChartTitlePosition.left with String = js.native
  /* "Right" */ val right: typings.officeDashJsDashPreview.ExcelNs.ChartTitlePosition.right with String = js.native
  /* "Top" */ val top: typings.officeDashJsDashPreview.ExcelNs.ChartTitlePosition.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTitlePosition with String] = js.native
}

