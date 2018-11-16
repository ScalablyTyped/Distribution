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
  
  val Filled: Filled with java.lang.String = js.native
  val Standard: Standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    openui5Lib.sapNs.uiNs.unifiedNs.CalendarAppointmentVisualization with java.lang.String
  ] = js.native
}

