package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenState extends js.Object

/**
  * Defines the different possible states of an element that can be open or closed and does not
  * onlytoggle between these states, but also spends some time in between (e.g. because of an
  * animation).
  */
@JSGlobal("sap.ui.core.OpenState")
@js.native
object OpenState extends js.Object {
  @js.native
  sealed trait CLOSED extends OpenState
  
  @js.native
  sealed trait CLOSING extends OpenState
  
  @js.native
  sealed trait OPEN extends OpenState
  
  @js.native
  sealed trait OPENING extends OpenState
  
}

