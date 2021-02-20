package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexWrap extends StObject
/**
  * Available options for the wrapping behavior of a flex container.
  */
@JSGlobal("sap.m.FlexWrap")
@js.native
object FlexWrap extends StObject {
  
  @js.native
  sealed trait NoWrap extends FlexWrap
  
  @js.native
  sealed trait Wrap extends FlexWrap
  
  @js.native
  sealed trait WrapReverse extends FlexWrap
}
