package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeInputType extends js.Object

/**
  * A subset of DateTimeInput types that fit to a simple API returning one string.
  */
@JSGlobal("sap.m.DateTimeInputType")
@js.native
object DateTimeInputType extends js.Object {
  @js.native
  sealed trait Date extends DateTimeInputType
  
  @js.native
  sealed trait DateTime extends DateTimeInputType
  
  @js.native
  sealed trait Time extends DateTimeInputType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeInputType with Double] = js.native
  /* 0 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  /* 1 */ @js.native
  object DateTime extends TopLevel[DateTime with Double]
  
  /* 2 */ @js.native
  object Time extends TopLevel[Time with Double]
  
}

