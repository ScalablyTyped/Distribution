package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.unified.CalendarAppointmentVisualization.Filled
import typings.openui5.sap.ui.unified.CalendarAppointmentVisualization.Standard
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarAppointmentVisualization with Double] = js.native
  /* 0 */ @js.native
  object Filled extends TopLevel[Filled with Double]
  
  /* 1 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
}

