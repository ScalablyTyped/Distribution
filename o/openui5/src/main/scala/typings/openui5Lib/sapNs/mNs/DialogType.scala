package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Message
    extends openui5Lib.sapNs.mNs.DialogType
  
  @js.native
  sealed trait Standard
    extends openui5Lib.sapNs.mNs.DialogType
  
  /* 0 */ val Message: Message with scala.Double = js.native
  /* 1 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.DialogType with scala.Double] = js.native
}

