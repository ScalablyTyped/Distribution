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
  
  val Day: Day with java.lang.String = js.native
  val Hour: Hour with java.lang.String = js.native
  val Month: Month with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.unifiedNs.CalendarIntervalType with java.lang.String] = js.native
}

