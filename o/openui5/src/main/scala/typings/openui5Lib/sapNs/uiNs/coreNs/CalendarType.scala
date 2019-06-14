package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Gregorian
    extends openui5Lib.sapNs.uiNs.coreNs.CalendarType
  
  @js.native
  sealed trait Islamic
    extends openui5Lib.sapNs.uiNs.coreNs.CalendarType
  
  @js.native
  sealed trait Japanese
    extends openui5Lib.sapNs.uiNs.coreNs.CalendarType
  
  /* 0 */ val Gregorian: Gregorian with scala.Double = js.native
  /* 1 */ val Islamic: Islamic with scala.Double = js.native
  /* 2 */ val Japanese: Japanese with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.CalendarType with scala.Double] = js.native
}

