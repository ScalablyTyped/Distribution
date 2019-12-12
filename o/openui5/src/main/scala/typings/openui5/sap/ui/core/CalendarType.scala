package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.CalendarType.Gregorian
import typings.openui5.sap.ui.core.CalendarType.Islamic
import typings.openui5.sap.ui.core.CalendarType.Japanese
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CalendarType with Double] = js.native
  /* 0 */ @js.native
  object Gregorian extends TopLevel[Gregorian with Double]
  
  /* 1 */ @js.native
  object Islamic extends TopLevel[Islamic with Double]
  
  /* 2 */ @js.native
  object Japanese extends TopLevel[Japanese with Double]
  
}

