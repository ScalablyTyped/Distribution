package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalendarType extends StObject
/**
  * The types of Calendar
  */
@JSGlobal("sap.ui.core.CalendarType")
@js.native
object CalendarType extends StObject {
  
  @js.native
  sealed trait Gregorian
    extends StObject
       with CalendarType
  
  @js.native
  sealed trait Islamic
    extends StObject
       with CalendarType
  
  @js.native
  sealed trait Japanese
    extends StObject
       with CalendarType
}
