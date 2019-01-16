package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeLineDashStyle extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ShapeLineDashStyle")
@js.native
object ShapeLineDashStyle extends js.Object {
  @js.native
  sealed trait dash
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait dashDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait dashDotDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait longDash
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDotDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait roundDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait solid
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait squareDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait systemDash
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait systemDashDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait systemDot
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle
  
  /* "Dash" */ val dash: dash with java.lang.String = js.native
  /* "DashDot" */ val dashDot: dashDot with java.lang.String = js.native
  /* "DashDotDot" */ val dashDotDot: dashDotDot with java.lang.String = js.native
  /* "LongDash" */ val longDash: longDash with java.lang.String = js.native
  /* "LongDashDot" */ val longDashDot: longDashDot with java.lang.String = js.native
  /* "LongDashDotDot" */ val longDashDotDot: longDashDotDot with java.lang.String = js.native
  /* "RoundDot" */ val roundDot: roundDot with java.lang.String = js.native
  /* "Solid" */ val solid: solid with java.lang.String = js.native
  /* "SquareDot" */ val squareDot: squareDot with java.lang.String = js.native
  /* "SystemDash" */ val systemDash: systemDash with java.lang.String = js.native
  /* "SystemDashDot" */ val systemDashDot: systemDashDot with java.lang.String = js.native
  /* "SystemDot" */ val systemDot: systemDot with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeLineDashStyle with java.lang.String] = js.native
}

