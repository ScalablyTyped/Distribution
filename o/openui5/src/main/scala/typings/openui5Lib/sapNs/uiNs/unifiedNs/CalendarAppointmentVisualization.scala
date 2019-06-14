package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarAppointmentVisualization extends js.Object

/**
  * Visualisation of an <code>CalendarAppoinment</code> in a <code>CalendarRow</code>.
  */
@JSGlobal("sap.ui.unified.CalendarAppointmentVisualization")
@js.native
object CalendarAppointmentVisualization extends js.Object {
  @js.native
  sealed trait Filled
    extends openui5Lib.sapNs.uiNs.unifiedNs.CalendarAppointmentVisualization
  
  @js.native
  sealed trait Standard
    extends openui5Lib.sapNs.uiNs.unifiedNs.CalendarAppointmentVisualization
  
  /* 0 */ val Filled: Filled with scala.Double = js.native
  /* 1 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    openui5Lib.sapNs.uiNs.unifiedNs.CalendarAppointmentVisualization with scala.Double
  ] = js.native
}

