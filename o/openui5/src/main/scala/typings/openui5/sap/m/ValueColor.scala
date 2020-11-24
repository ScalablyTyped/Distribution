package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueColor extends js.Object
/**
  * Enumeration of possible value color settings.
  */
@JSGlobal("sap.m.ValueColor")
@js.native
object ValueColor extends js.Object {
  
  @js.native
  sealed trait Critical extends ValueColor
  
  @js.native
  sealed trait Error extends ValueColor
  
  @js.native
  sealed trait Good extends ValueColor
  
  @js.native
  sealed trait Neutral extends ValueColor
}
