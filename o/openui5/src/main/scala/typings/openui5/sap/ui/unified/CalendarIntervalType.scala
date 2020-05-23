package typings.openui5.sap.ui.unified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarIntervalType extends js.Object

/**
  * Type of a interval in a <code>CalendarRow</code>.
  */
@JSGlobal("sap.ui.unified.CalendarIntervalType")
@js.native
object CalendarIntervalType extends js.Object {
  @js.native
  sealed trait Day extends CalendarIntervalType
  
  @js.native
  sealed trait Hour extends CalendarIntervalType
  
  @js.native
  sealed trait Month extends CalendarIntervalType
  
}

