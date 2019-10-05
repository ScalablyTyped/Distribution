package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalendarType extends js.Object

/**
  * The types of Calendar
  */
@JSGlobal("sap.ui.core.CalendarType")
@js.native
object CalendarType extends js.Object {
  @js.native
  sealed trait Gregorian extends CalendarType
  
  @js.native
  sealed trait Islamic extends CalendarType
  
  @js.native
  sealed trait Japanese extends CalendarType
  
  /* 0 */ val Gregorian: typings.openui5.sap.ui.core.CalendarType.Gregorian with Double = js.native
  /* 1 */ val Islamic: typings.openui5.sap.ui.core.CalendarType.Islamic with Double = js.native
  /* 2 */ val Japanese: typings.openui5.sap.ui.core.CalendarType.Japanese with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarType with Double] = js.native
}

