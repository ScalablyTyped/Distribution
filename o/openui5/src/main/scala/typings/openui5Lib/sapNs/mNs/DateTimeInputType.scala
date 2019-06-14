package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Date
    extends openui5Lib.sapNs.mNs.DateTimeInputType
  
  @js.native
  sealed trait DateTime
    extends openui5Lib.sapNs.mNs.DateTimeInputType
  
  @js.native
  sealed trait Time
    extends openui5Lib.sapNs.mNs.DateTimeInputType
  
  /* 0 */ val Date: Date with scala.Double = js.native
  /* 1 */ val DateTime: DateTime with scala.Double = js.native
  /* 2 */ val Time: Time with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.DateTimeInputType with scala.Double] = js.native
}

