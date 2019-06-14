package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputType extends js.Object

/**
  * A subset of input types that fits to a simple API returning one string.Not available on purpose:
  * button, checkbox, hidden, image, password, radio, range, reset, search, submit.
  */
@JSGlobal("sap.m.InputType")
@js.native
object InputType extends js.Object {
  @js.native
  sealed trait Date
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Datetime
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait DatetimeLocale
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Email
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Month
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Number
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Password
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Tel
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Text
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Time
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Url
    extends openui5Lib.sapNs.mNs.InputType
  
  @js.native
  sealed trait Week
    extends openui5Lib.sapNs.mNs.InputType
  
  /* 0 */ val Date: Date with scala.Double = js.native
  /* 1 */ val Datetime: Datetime with scala.Double = js.native
  /* 2 */ val DatetimeLocale: DatetimeLocale with scala.Double = js.native
  /* 3 */ val Email: Email with scala.Double = js.native
  /* 4 */ val Month: Month with scala.Double = js.native
  /* 5 */ val Number: Number with scala.Double = js.native
  /* 6 */ val Password: Password with scala.Double = js.native
  /* 7 */ val Tel: Tel with scala.Double = js.native
  /* 8 */ val Text: Text with scala.Double = js.native
  /* 9 */ val Time: Time with scala.Double = js.native
  /* 10 */ val Url: Url with scala.Double = js.native
  /* 11 */ val Week: Week with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.InputType with scala.Double] = js.native
}

