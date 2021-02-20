package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeInputType extends StObject
/**
  * A subset of DateTimeInput types that fit to a simple API returning one string.
  */
@JSGlobal("sap.m.DateTimeInputType")
@js.native
object DateTimeInputType extends StObject {
  
  @js.native
  sealed trait Date extends DateTimeInputType
  
  @js.native
  sealed trait DateTime extends DateTimeInputType
  
  @js.native
  sealed trait Time extends DateTimeInputType
}
