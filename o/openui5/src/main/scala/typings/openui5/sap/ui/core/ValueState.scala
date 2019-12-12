package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.ValueState.Error
import typings.openui5.sap.ui.core.ValueState.None
import typings.openui5.sap.ui.core.ValueState.Success
import typings.openui5.sap.ui.core.ValueState.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueState with Double] = js.native
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  /* 3 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

