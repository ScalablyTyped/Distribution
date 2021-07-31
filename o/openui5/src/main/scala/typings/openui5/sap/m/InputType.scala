package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputType extends StObject
/**
  * A subset of input types that fits to a simple API returning one string.Not available on purpose:
  * button, checkbox, hidden, image, password, radio, range, reset, search, submit.
  */
@JSGlobal("sap.m.InputType")
@js.native
object InputType extends StObject {
  
  @js.native
  sealed trait Date
    extends StObject
       with InputType
  
  @js.native
  sealed trait Datetime
    extends StObject
       with InputType
  
  @js.native
  sealed trait DatetimeLocale
    extends StObject
       with InputType
  
  @js.native
  sealed trait Email
    extends StObject
       with InputType
  
  @js.native
  sealed trait Month
    extends StObject
       with InputType
  
  @js.native
  sealed trait Number
    extends StObject
       with InputType
  
  @js.native
  sealed trait Password
    extends StObject
       with InputType
  
  @js.native
  sealed trait Tel
    extends StObject
       with InputType
  
  @js.native
  sealed trait Text
    extends StObject
       with InputType
  
  @js.native
  sealed trait Time
    extends StObject
       with InputType
  
  @js.native
  sealed trait Url
    extends StObject
       with InputType
  
  @js.native
  sealed trait Week
    extends StObject
       with InputType
}
