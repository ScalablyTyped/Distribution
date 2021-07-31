package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalendarIntervalType extends StObject
/**
  * Type of a interval in a <code>CalendarRow</code>.
  */
@JSGlobal("sap.ui.unified.CalendarIntervalType")
@js.native
object CalendarIntervalType extends StObject {
  
  @js.native
  sealed trait Day
    extends StObject
       with CalendarIntervalType
  
  @js.native
  sealed trait Hour
    extends StObject
       with CalendarIntervalType
  
  @js.native
  sealed trait Month
    extends StObject
       with CalendarIntervalType
}
