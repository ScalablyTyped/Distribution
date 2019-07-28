package typings.openui5.sapNs.mNs

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
  sealed trait Date extends InputType
  
  @js.native
  sealed trait Datetime extends InputType
  
  @js.native
  sealed trait DatetimeLocale extends InputType
  
  @js.native
  sealed trait Email extends InputType
  
  @js.native
  sealed trait Month extends InputType
  
  @js.native
  sealed trait Number extends InputType
  
  @js.native
  sealed trait Password extends InputType
  
  @js.native
  sealed trait Tel extends InputType
  
  @js.native
  sealed trait Text extends InputType
  
  @js.native
  sealed trait Time extends InputType
  
  @js.native
  sealed trait Url extends InputType
  
  @js.native
  sealed trait Week extends InputType
  
  /* 0 */ val Date: typings.openui5.sapNs.mNs.InputType.Date with Double = js.native
  /* 1 */ val Datetime: typings.openui5.sapNs.mNs.InputType.Datetime with Double = js.native
  /* 2 */ val DatetimeLocale: typings.openui5.sapNs.mNs.InputType.DatetimeLocale with Double = js.native
  /* 3 */ val Email: typings.openui5.sapNs.mNs.InputType.Email with Double = js.native
  /* 4 */ val Month: typings.openui5.sapNs.mNs.InputType.Month with Double = js.native
  /* 5 */ val Number: typings.openui5.sapNs.mNs.InputType.Number with Double = js.native
  /* 6 */ val Password: typings.openui5.sapNs.mNs.InputType.Password with Double = js.native
  /* 7 */ val Tel: typings.openui5.sapNs.mNs.InputType.Tel with Double = js.native
  /* 8 */ val Text: typings.openui5.sapNs.mNs.InputType.Text with Double = js.native
  /* 9 */ val Time: typings.openui5.sapNs.mNs.InputType.Time with Double = js.native
  /* 10 */ val Url: typings.openui5.sapNs.mNs.InputType.Url with Double = js.native
  /* 11 */ val Week: typings.openui5.sapNs.mNs.InputType.Week with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputType with Double] = js.native
}

