package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StandardCalendarLegendItem extends StObject
@JSImport("sap/ui/unified/library", "StandardCalendarLegendItem")
@js.native
object StandardCalendarLegendItem extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StandardCalendarLegendItem & String] = js.native
  
  /**
    * Type used for visualization of the non-working days.
    */
  @js.native
  sealed trait NonWorkingDay
    extends StObject
       with StandardCalendarLegendItem
  /* "NonWorkingDay" */ val NonWorkingDay: typings.openui5.sapUiUnifiedLibraryMod.StandardCalendarLegendItem.NonWorkingDay & String = js.native
  
  /**
    * Type used for visualization of the currently selected day.
    */
  @js.native
  sealed trait Selected
    extends StObject
       with StandardCalendarLegendItem
  /* "Selected" */ val Selected: typings.openui5.sapUiUnifiedLibraryMod.StandardCalendarLegendItem.Selected & String = js.native
  
  /**
    * Type used for visualization of the current date.
    */
  @js.native
  sealed trait Today
    extends StObject
       with StandardCalendarLegendItem
  /* "Today" */ val Today: typings.openui5.sapUiUnifiedLibraryMod.StandardCalendarLegendItem.Today & String = js.native
  
  /**
    * Type used for visualization of the regular work days.
    */
  @js.native
  sealed trait WorkingDay
    extends StObject
       with StandardCalendarLegendItem
  /* "WorkingDay" */ val WorkingDay: typings.openui5.sapUiUnifiedLibraryMod.StandardCalendarLegendItem.WorkingDay & String = js.native
}
