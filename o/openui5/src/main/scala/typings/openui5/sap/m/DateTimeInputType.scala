package typings.openui5.sap.m

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
  
  /* 0 */ val Date: typings.openui5.sap.m.DateTimeInputType.Date with Double = js.native
  /* 1 */ val DateTime: typings.openui5.sap.m.DateTimeInputType.DateTime with Double = js.native
  /* 2 */ val Time: typings.openui5.sap.m.DateTimeInputType.Time with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeInputType with Double] = js.native
}

