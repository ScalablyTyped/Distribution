package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
