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
  
  val Message: Message with java.lang.String = js.native
  val Standard: Standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.DialogType with java.lang.String] = js.native
}

