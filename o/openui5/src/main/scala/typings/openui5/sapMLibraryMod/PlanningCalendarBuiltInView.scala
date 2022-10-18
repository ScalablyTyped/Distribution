package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanningCalendarBuiltInView extends StObject
@JSImport("sap/m/library", "PlanningCalendarBuiltInView")
@js.native
object PlanningCalendarBuiltInView extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlanningCalendarBuiltInView & String] = js.native
  
  /**
    * Represents the key of the built-in view, in which the intervals have the size of one day.
    */
  @js.native
  sealed trait Day
    extends StObject
       with PlanningCalendarBuiltInView
  /* "Day" */ val Day: typings.openui5.sapMLibraryMod.PlanningCalendarBuiltInView.Day & String = js.native
  
  /**
    * Represents the key of the built-in view, in which the intervals have the size of one hour.
    */
  @js.native
  sealed trait Hour
    extends StObject
       with PlanningCalendarBuiltInView
  /* "Hour" */ val Hour: typings.openui5.sapMLibraryMod.PlanningCalendarBuiltInView.Hour & String = js.native
  
  /**
    * Represents the key of the built-in view, in which the intervals have the size of one month.
    */
  @js.native
  sealed trait Month
    extends StObject
       with PlanningCalendarBuiltInView
  /* "Month" */ val Month: typings.openui5.sapMLibraryMod.PlanningCalendarBuiltInView.Month & String = js.native
  
  /**
    * Represents the key of the built-in view, in which the intervals have the size of one day where 31 days
    * are displayed, starting with the first day of the month.
    */
  @js.native
  sealed trait OneMonth
    extends StObject
       with PlanningCalendarBuiltInView
  /* "One Month" */ val OneMonth: typings.openui5.sapMLibraryMod.PlanningCalendarBuiltInView.OneMonth & String = js.native
  
  /**
    * Represents the key of the built-in view, in which the intervals have the size of one day where 7 days
    * are displayed, starting with the first day of the week.
    */
  @js.native
  sealed trait Week
    extends StObject
       with PlanningCalendarBuiltInView
  /* "Week" */ val Week: typings.openui5.sapMLibraryMod.PlanningCalendarBuiltInView.Week & String = js.native
}
