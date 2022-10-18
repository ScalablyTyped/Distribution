package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalendarAppointmentVisualization extends StObject
@JSImport("sap/ui/unified/library", "CalendarAppointmentVisualization")
@js.native
object CalendarAppointmentVisualization extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalendarAppointmentVisualization & String] = js.native
  
  /**
    * Visualization with fill color depending on the used theme.
    */
  @js.native
  sealed trait Filled
    extends StObject
       with CalendarAppointmentVisualization
  /* "Filled" */ val Filled: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentVisualization.Filled & String = js.native
  
  /**
    * Standard visualization with no fill color.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with CalendarAppointmentVisualization
  /* "Standard" */ val Standard: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentVisualization.Standard & String = js.native
}
