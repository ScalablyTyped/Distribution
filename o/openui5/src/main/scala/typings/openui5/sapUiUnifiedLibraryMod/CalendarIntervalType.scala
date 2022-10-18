package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalendarIntervalType extends StObject
@JSImport("sap/ui/unified/library", "CalendarIntervalType")
@js.native
object CalendarIntervalType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalendarIntervalType & String] = js.native
  
  /**
    * Intervals have the size of one day.
    */
  @js.native
  sealed trait Day
    extends StObject
       with CalendarIntervalType
  /* "Day" */ val Day: typings.openui5.sapUiUnifiedLibraryMod.CalendarIntervalType.Day & String = js.native
  
  /**
    * Intervals have the size of one hour.
    */
  @js.native
  sealed trait Hour
    extends StObject
       with CalendarIntervalType
  /* "Hour" */ val Hour: typings.openui5.sapUiUnifiedLibraryMod.CalendarIntervalType.Hour & String = js.native
  
  /**
    * Intervals have the size of one month.
    */
  @js.native
  sealed trait Month
    extends StObject
       with CalendarIntervalType
  /* "Month" */ val Month: typings.openui5.sapUiUnifiedLibraryMod.CalendarIntervalType.Month & String = js.native
}
