package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Marker for the correctness of the current value.
  */
@JSGlobal("sap.ui.core.ValueState")
@js.native
object ValueState extends js.Object {
  /* 0 */ val Error: typings.openui5.sap.ui.core.ValueState.Error with Double = js.native
  /* 1 */ val None: typings.openui5.sap.ui.core.ValueState.None with Double = js.native
  /* 2 */ val Success: typings.openui5.sap.ui.core.ValueState.Success with Double = js.native
  /* 3 */ val Warning: typings.openui5.sap.ui.core.ValueState.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.ValueState with Double] = js.native
}

