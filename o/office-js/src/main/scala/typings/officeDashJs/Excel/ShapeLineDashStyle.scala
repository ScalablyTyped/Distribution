package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ShapeLineDashStyle.dash
import typings.officeDashJs.Excel.ShapeLineDashStyle.dashDot
import typings.officeDashJs.Excel.ShapeLineDashStyle.dashDotDot
import typings.officeDashJs.Excel.ShapeLineDashStyle.longDash
import typings.officeDashJs.Excel.ShapeLineDashStyle.longDashDot
import typings.officeDashJs.Excel.ShapeLineDashStyle.longDashDotDot
import typings.officeDashJs.Excel.ShapeLineDashStyle.roundDot
import typings.officeDashJs.Excel.ShapeLineDashStyle.solid
import typings.officeDashJs.Excel.ShapeLineDashStyle.squareDot
import typings.officeDashJs.Excel.ShapeLineDashStyle.systemDash
import typings.officeDashJs.Excel.ShapeLineDashStyle.systemDashDot
import typings.officeDashJs.Excel.ShapeLineDashStyle.systemDot
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeLineDashStyle with String] = js.native
  /* "Dash" */ @js.native
  object dash extends TopLevel[dash with String]
  
  /* "DashDot" */ @js.native
  object dashDot extends TopLevel[dashDot with String]
  
  /* "DashDotDot" */ @js.native
  object dashDotDot extends TopLevel[dashDotDot with String]
  
  /* "LongDash" */ @js.native
  object longDash extends TopLevel[longDash with String]
  
  /* "LongDashDot" */ @js.native
  object longDashDot extends TopLevel[longDashDot with String]
  
  /* "LongDashDotDot" */ @js.native
  object longDashDotDot extends TopLevel[longDashDotDot with String]
  
  /* "RoundDot" */ @js.native
  object roundDot extends TopLevel[roundDot with String]
  
  /* "Solid" */ @js.native
  object solid extends TopLevel[solid with String]
  
  /* "SquareDot" */ @js.native
  object squareDot extends TopLevel[squareDot with String]
  
  /* "SystemDash" */ @js.native
  object systemDash extends TopLevel[systemDash with String]
  
  /* "SystemDashDot" */ @js.native
  object systemDashDot extends TopLevel[systemDashDot with String]
  
  /* "SystemDot" */ @js.native
  object systemDot extends TopLevel[systemDot with String]
  
}

