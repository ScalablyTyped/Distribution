package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexWrap extends js.Object
/**
  * Available options for the wrapping behavior of a flex container.
  */
@JSGlobal("sap.m.FlexWrap")
@js.native
object FlexWrap extends js.Object {
  
  @js.native
  sealed trait NoWrap extends FlexWrap
  
  @js.native
  sealed trait Wrap extends FlexWrap
  
  @js.native
  sealed trait WrapReverse extends FlexWrap
}
