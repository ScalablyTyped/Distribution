package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait CLOSED
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  @js.native
  sealed trait CLOSING
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  @js.native
  sealed trait OPEN
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  @js.native
  sealed trait OPENING
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  val CLOSED: CLOSED with java.lang.String = js.native
  val CLOSING: CLOSING with java.lang.String = js.native
  val OPEN: OPEN with java.lang.String = js.native
  val OPENING: OPENING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.OpenState with java.lang.String] = js.native
}

