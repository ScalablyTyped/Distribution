package typings
package officeDashJsLib.ExcelNs

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
  sealed trait continuous
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  @js.native
  sealed trait dash
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  @js.native
  sealed trait dashDot
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  @js.native
  sealed trait dashDotDot
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  @js.native
  sealed trait dot
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  @js.native
  sealed trait double
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  @js.native
  sealed trait slantDashDot
    extends officeDashJsLib.ExcelNs.BorderLineStyle
  
  /* "Continuous" */ val continuous: continuous with java.lang.String = js.native
  /* "Dash" */ val dash: dash with java.lang.String = js.native
  /* "DashDot" */ val dashDot: dashDot with java.lang.String = js.native
  /* "DashDotDot" */ val dashDotDot: dashDotDot with java.lang.String = js.native
  /* "Dot" */ val dot: dot with java.lang.String = js.native
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "SlantDashDot" */ val slantDashDot: slantDashDot with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.BorderLineStyle with java.lang.String] = js.native
}

