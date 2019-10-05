package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartLineStyle")
@js.native
object ChartLineStyle extends js.Object {
  @js.native
  sealed trait automatic extends ChartLineStyle
  
  @js.native
  sealed trait continuous extends ChartLineStyle
  
  @js.native
  sealed trait dash extends ChartLineStyle
  
  @js.native
  sealed trait dashDot extends ChartLineStyle
  
  @js.native
  sealed trait dashDotDot extends ChartLineStyle
  
  @js.native
  sealed trait dot extends ChartLineStyle
  
  @js.native
  sealed trait grey25 extends ChartLineStyle
  
  @js.native
  sealed trait grey50 extends ChartLineStyle
  
  @js.native
  sealed trait grey75 extends ChartLineStyle
  
  @js.native
  sealed trait none extends ChartLineStyle
  
  @js.native
  sealed trait roundDot extends ChartLineStyle
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.Excel.ChartLineStyle.automatic with String = js.native
  /* "Continuous" */ val continuous: typings.officeDashJsDashPreview.Excel.ChartLineStyle.continuous with String = js.native
  /* "Dash" */ val dash: typings.officeDashJsDashPreview.Excel.ChartLineStyle.dash with String = js.native
  /* "DashDot" */ val dashDot: typings.officeDashJsDashPreview.Excel.ChartLineStyle.dashDot with String = js.native
  /* "DashDotDot" */ val dashDotDot: typings.officeDashJsDashPreview.Excel.ChartLineStyle.dashDotDot with String = js.native
  /* "Dot" */ val dot: typings.officeDashJsDashPreview.Excel.ChartLineStyle.dot with String = js.native
  /* "Grey25" */ val grey25: typings.officeDashJsDashPreview.Excel.ChartLineStyle.grey25 with String = js.native
  /* "Grey50" */ val grey50: typings.officeDashJsDashPreview.Excel.ChartLineStyle.grey50 with String = js.native
  /* "Grey75" */ val grey75: typings.officeDashJsDashPreview.Excel.ChartLineStyle.grey75 with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Excel.ChartLineStyle.none with String = js.native
  /* "RoundDot" */ val roundDot: typings.officeDashJsDashPreview.Excel.ChartLineStyle.roundDot with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartLineStyle with String] = js.native
}

