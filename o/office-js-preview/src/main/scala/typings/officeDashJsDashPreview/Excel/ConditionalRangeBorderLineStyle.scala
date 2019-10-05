package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalRangeBorderLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeBorderLineStyle")
@js.native
object ConditionalRangeBorderLineStyle extends js.Object {
  @js.native
  sealed trait continuous extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dash extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dashDot extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dashDotDot extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait dot extends ConditionalRangeBorderLineStyle
  
  @js.native
  sealed trait none extends ConditionalRangeBorderLineStyle
  
  /* "Continuous" */ val continuous: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderLineStyle.continuous with String = js.native
  /* "Dash" */ val dash: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderLineStyle.dash with String = js.native
  /* "DashDot" */ val dashDot: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderLineStyle.dashDot with String = js.native
  /* "DashDotDot" */ val dashDotDot: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderLineStyle.dashDotDot with String = js.native
  /* "Dot" */ val dot: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderLineStyle.dot with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderLineStyle.none with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeBorderLineStyle with String] = js.native
}

