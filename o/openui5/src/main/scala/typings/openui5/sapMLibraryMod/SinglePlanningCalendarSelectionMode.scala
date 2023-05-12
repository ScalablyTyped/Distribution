package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SinglePlanningCalendarSelectionMode extends StObject
@JSImport("sap/m/library", "SinglePlanningCalendarSelectionMode")
@js.native
object SinglePlanningCalendarSelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SinglePlanningCalendarSelectionMode & String] = js.native
  
  /**
    * Мore than one date will be available to selection.
    */
  @js.native
  sealed trait MultiSelect
    extends StObject
       with SinglePlanningCalendarSelectionMode
  /* "MultiSelect" */ val MultiSelect: typings.openui5.sapMLibraryMod.SinglePlanningCalendarSelectionMode.MultiSelect & String = js.native
  
  /**
    * Single date selection.
    */
  @js.native
  sealed trait SingleSelect
    extends StObject
       with SinglePlanningCalendarSelectionMode
  /* "SingleSelect" */ val SingleSelect: typings.openui5.sapMLibraryMod.SinglePlanningCalendarSelectionMode.SingleSelect & String = js.native
}
