package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderLineStyle")
@js.native
object BorderLineStyle extends js.Object {
  @js.native
  sealed trait continuous extends BorderLineStyle
  
  @js.native
  sealed trait dash extends BorderLineStyle
  
  @js.native
  sealed trait dashDot extends BorderLineStyle
  
  @js.native
  sealed trait dashDotDot extends BorderLineStyle
  
  @js.native
  sealed trait dot extends BorderLineStyle
  
  @js.native
  sealed trait double extends BorderLineStyle
  
  @js.native
  sealed trait none extends BorderLineStyle
  
  @js.native
  sealed trait slantDashDot extends BorderLineStyle
  
  /* "Continuous" */ val continuous: typings.officeDashJs.ExcelNs.BorderLineStyle.continuous with String = js.native
  /* "Dash" */ val dash: typings.officeDashJs.ExcelNs.BorderLineStyle.dash with String = js.native
  /* "DashDot" */ val dashDot: typings.officeDashJs.ExcelNs.BorderLineStyle.dashDot with String = js.native
  /* "DashDotDot" */ val dashDotDot: typings.officeDashJs.ExcelNs.BorderLineStyle.dashDotDot with String = js.native
  /* "Dot" */ val dot: typings.officeDashJs.ExcelNs.BorderLineStyle.dot with String = js.native
  /* "Double" */ val double: typings.officeDashJs.ExcelNs.BorderLineStyle.double with String = js.native
  /* "None" */ val none: typings.officeDashJs.ExcelNs.BorderLineStyle.none with String = js.native
  /* "SlantDashDot" */ val slantDashDot: typings.officeDashJs.ExcelNs.BorderLineStyle.slantDashDot with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLineStyle with String] = js.native
}

