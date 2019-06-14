package typings
package openui5Lib.sapNs.uiNs.unifiedNs

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
  sealed trait Day
    extends openui5Lib.sapNs.uiNs.unifiedNs.CalendarIntervalType
  
  @js.native
  sealed trait Hour
    extends openui5Lib.sapNs.uiNs.unifiedNs.CalendarIntervalType
  
  @js.native
  sealed trait Month
    extends openui5Lib.sapNs.uiNs.unifiedNs.CalendarIntervalType
  
  /* 0 */ val Day: Day with scala.Double = js.native
  /* 1 */ val Hour: Hour with scala.Double = js.native
  /* 2 */ val Month: Month with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.unifiedNs.CalendarIntervalType with scala.Double] = js.native
}

