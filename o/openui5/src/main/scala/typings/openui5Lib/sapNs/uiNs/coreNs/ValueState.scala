package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Error
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  @js.native
  sealed trait Success
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  @js.native
  sealed trait Warning
    extends openui5Lib.sapNs.uiNs.coreNs.ValueState
  
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 2 */ val Success: Success with scala.Double = js.native
  /* 3 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.ValueState with scala.Double] = js.native
}

