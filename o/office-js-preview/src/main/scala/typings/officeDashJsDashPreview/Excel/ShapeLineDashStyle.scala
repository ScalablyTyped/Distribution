package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeLineDashStyle extends js.Object

/**
  *
  * The dash style for a line.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineDashStyle")
@js.native
object ShapeLineDashStyle extends js.Object {
  @js.native
  sealed trait dash extends ShapeLineDashStyle
  
  @js.native
  sealed trait dashDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait dashDotDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait longDash extends ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDotDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait roundDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait solid extends ShapeLineDashStyle
  
  @js.native
  sealed trait squareDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait systemDash extends ShapeLineDashStyle
  
  @js.native
  sealed trait systemDashDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait systemDot extends ShapeLineDashStyle
  
  /* "Dash" */ val dash: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.dash with String = js.native
  /* "DashDot" */ val dashDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.dashDot with String = js.native
  /* "DashDotDot" */ val dashDotDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.dashDotDot with String = js.native
  /* "LongDash" */ val longDash: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.longDash with String = js.native
  /* "LongDashDot" */ val longDashDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.longDashDot with String = js.native
  /* "LongDashDotDot" */ val longDashDotDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.longDashDotDot with String = js.native
  /* "RoundDot" */ val roundDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.roundDot with String = js.native
  /* "Solid" */ val solid: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.solid with String = js.native
  /* "SquareDot" */ val squareDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.squareDot with String = js.native
  /* "SystemDash" */ val systemDash: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.systemDash with String = js.native
  /* "SystemDashDot" */ val systemDashDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.systemDashDot with String = js.native
  /* "SystemDot" */ val systemDot: typings.officeDashJsDashPreview.Excel.ShapeLineDashStyle.systemDot with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeLineDashStyle with String] = js.native
}

