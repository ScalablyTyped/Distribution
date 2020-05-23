package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the different possible states of an element that can be open or closed and does not
  * onlytoggle between these states, but also spends some time in between (e.g. because of an
  * animation).
  */
@JSGlobal("sap.ui.core.OpenState")
@js.native
object OpenState extends js.Object {
  /* 0 */ val CLOSED: typings.openui5.sap.ui.core.OpenState.CLOSED with Double = js.native
  /* 1 */ val CLOSING: typings.openui5.sap.ui.core.OpenState.CLOSING with Double = js.native
  /* 2 */ val OPEN: typings.openui5.sap.ui.core.OpenState.OPEN with Double = js.native
  /* 3 */ val OPENING: typings.openui5.sap.ui.core.OpenState.OPENING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.OpenState with Double] = js.native
}

