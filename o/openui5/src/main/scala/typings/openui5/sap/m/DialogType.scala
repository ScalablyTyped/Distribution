package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogType extends js.Object

/**
  * Enum for the type of sap.m.Dialog control.
  */
@JSGlobal("sap.m.DialogType")
@js.native
object DialogType extends js.Object {
  @js.native
  sealed trait Message extends DialogType
  
  @js.native
  sealed trait Standard extends DialogType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogType with Double] = js.native
  /* 0 */ @js.native
  object Message extends TopLevel[Message with Double]
  
  /* 1 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
}

