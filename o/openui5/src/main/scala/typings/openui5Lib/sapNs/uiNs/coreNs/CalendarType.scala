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
  
  val Gregorian: Gregorian with java.lang.String = js.native
  val Islamic: Islamic with java.lang.String = js.native
  val Japanese: Japanese with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.CalendarType with java.lang.String] = js.native
}

