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
  
  val Date: Date with java.lang.String = js.native
  val Datetime: Datetime with java.lang.String = js.native
  val DatetimeLocale: DatetimeLocale with java.lang.String = js.native
  val Email: Email with java.lang.String = js.native
  val Month: Month with java.lang.String = js.native
  val Number: Number with java.lang.String = js.native
  val Password: Password with java.lang.String = js.native
  val Tel: Tel with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  val Time: Time with java.lang.String = js.native
  val Url: Url with java.lang.String = js.native
  val Week: Week with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.InputType with java.lang.String] = js.native
}

