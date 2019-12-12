package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.OpenState.CLOSED
import typings.openui5.sap.ui.core.OpenState.CLOSING
import typings.openui5.sap.ui.core.OpenState.OPEN
import typings.openui5.sap.ui.core.OpenState.OPENING
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenState with Double] = js.native
  /* 0 */ @js.native
  object CLOSED extends TopLevel[CLOSED with Double]
  
  /* 1 */ @js.native
  object CLOSING extends TopLevel[CLOSING with Double]
  
  /* 2 */ @js.native
  object OPEN extends TopLevel[OPEN with Double]
  
  /* 3 */ @js.native
  object OPENING extends TopLevel[OPENING with Double]
  
}

