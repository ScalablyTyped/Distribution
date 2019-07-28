package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val Message: typings.openui5.sapNs.mNs.DialogType.Message with Double = js.native
  /* 1 */ val Standard: typings.openui5.sapNs.mNs.DialogType.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogType with Double] = js.native
}

