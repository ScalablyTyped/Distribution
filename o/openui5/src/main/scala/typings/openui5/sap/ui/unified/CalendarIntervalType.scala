package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarIntervalType with Double] = js.native
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 1 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  /* 2 */ @js.native
  object Month extends TopLevel[Month with Double]
  
}

