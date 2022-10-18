package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupAppointmentsMode extends StObject
@JSImport("sap/ui/unified/library", "GroupAppointmentsMode")
@js.native
object GroupAppointmentsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GroupAppointmentsMode & String] = js.native
  
  /**
    * Overlapping appointments are displayed as a collapsed group appointment.
    */
  @js.native
  sealed trait Collapsed
    extends StObject
       with GroupAppointmentsMode
  /* "Collapsed" */ val Collapsed: typings.openui5.sapUiUnifiedLibraryMod.GroupAppointmentsMode.Collapsed & String = js.native
  
  /**
    * Overlapping appointments are displayed individually (expanded from a group).
    */
  @js.native
  sealed trait Expanded
    extends StObject
       with GroupAppointmentsMode
  /* "Expanded" */ val Expanded: typings.openui5.sapUiUnifiedLibraryMod.GroupAppointmentsMode.Expanded & String = js.native
}
