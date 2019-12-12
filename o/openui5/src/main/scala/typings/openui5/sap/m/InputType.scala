package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.InputType.Date
import typings.openui5.sap.m.InputType.Datetime
import typings.openui5.sap.m.InputType.DatetimeLocale
import typings.openui5.sap.m.InputType.Email
import typings.openui5.sap.m.InputType.Month
import typings.openui5.sap.m.InputType.Number
import typings.openui5.sap.m.InputType.Password
import typings.openui5.sap.m.InputType.Tel
import typings.openui5.sap.m.InputType.Time
import typings.openui5.sap.m.InputType.Url
import typings.openui5.sap.m.InputType.Week
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputType with Double] = js.native
  /* 0 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  /* 1 */ @js.native
  object Datetime extends TopLevel[Datetime with Double]
  
  /* 2 */ @js.native
  object DatetimeLocale extends TopLevel[DatetimeLocale with Double]
  
  /* 3 */ @js.native
  object Email extends TopLevel[Email with Double]
  
  /* 4 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  /* 5 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  /* 6 */ @js.native
  object Password extends TopLevel[Password with Double]
  
  /* 7 */ @js.native
  object Tel extends TopLevel[Tel with Double]
  
  /* 8 */ @js.native
  object Text
    extends TopLevel[typings.openui5.sap.m.InputType.Text with Double]
  
  /* 9 */ @js.native
  object Time extends TopLevel[Time with Double]
  
  /* 10 */ @js.native
  object Url extends TopLevel[Url with Double]
  
  /* 11 */ @js.native
  object Week extends TopLevel[Week with Double]
  
}

