package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanningCalendarStickyMode extends StObject
@JSImport("sap/m/library", "PlanningCalendarStickyMode")
@js.native
object PlanningCalendarStickyMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlanningCalendarStickyMode & String] = js.native
  
  /**
    * Actions toolbar, navigation toolbar and the column headers will be sticky.
    */
  @js.native
  sealed trait All
    extends StObject
       with PlanningCalendarStickyMode
  /* "All" */ val All: typings.openui5.sapMLibraryMod.PlanningCalendarStickyMode.All & String = js.native
  
  /**
    * Only the navigation toolbar and column headers will be sticky.
    */
  @js.native
  sealed trait NavBarAndColHeaders
    extends StObject
       with PlanningCalendarStickyMode
  /* "NavBarAndColHeaders" */ val NavBarAndColHeaders: typings.openui5.sapMLibraryMod.PlanningCalendarStickyMode.NavBarAndColHeaders & String = js.native
  
  /**
    * Nothing will stick at the top.
    */
  @js.native
  sealed trait None
    extends StObject
       with PlanningCalendarStickyMode
  /* "None" */ val None: typings.openui5.sapMLibraryMod.PlanningCalendarStickyMode.None & String = js.native
}
