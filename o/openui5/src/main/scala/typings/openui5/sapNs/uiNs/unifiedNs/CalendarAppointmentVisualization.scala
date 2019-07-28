package typings.openui5.sapNs.uiNs.unifiedNs

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
  sealed trait Filled extends CalendarAppointmentVisualization
  
  @js.native
  sealed trait Standard extends CalendarAppointmentVisualization
  
  /* 0 */ val Filled: typings.openui5.sapNs.uiNs.unifiedNs.CalendarAppointmentVisualization.Filled with Double = js.native
  /* 1 */ val Standard: typings.openui5.sapNs.uiNs.unifiedNs.CalendarAppointmentVisualization.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarAppointmentVisualization with Double] = js.native
}

