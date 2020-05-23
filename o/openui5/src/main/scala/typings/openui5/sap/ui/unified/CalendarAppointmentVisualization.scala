package typings.openui5.sap.ui.unified

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
  
}

