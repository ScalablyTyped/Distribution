package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueState extends js.Object
/**
  * Marker for the correctness of the current value.
  */
@JSGlobal("sap.ui.core.ValueState")
@js.native
object ValueState extends js.Object {
  
  @js.native
  sealed trait Error extends ValueState
  
  @js.native
  sealed trait None extends ValueState
  
  @js.native
  sealed trait Success extends ValueState
  
  @js.native
  sealed trait Warning extends ValueState
}
