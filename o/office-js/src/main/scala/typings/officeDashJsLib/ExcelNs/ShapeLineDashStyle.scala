package typings
package officeDashJsLib.ExcelNs

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
  sealed trait dash
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait dashDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait dashDotDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait longDash
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDotDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait roundDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait solid
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait squareDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait systemDash
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait systemDashDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
  @js.native
  sealed trait systemDot
    extends officeDashJsLib.ExcelNs.ShapeLineDashStyle
  
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
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeLineDashStyle with java.lang.String] = js.native
}

