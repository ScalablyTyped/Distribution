package typings.openui5.sap.m

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
  
}

