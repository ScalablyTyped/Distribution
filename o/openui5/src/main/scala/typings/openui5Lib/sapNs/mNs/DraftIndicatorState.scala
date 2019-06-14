package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraftIndicatorState extends js.Object

/**
  * Enum for the state of sap.m.DraftIndicator control.
  */
@JSGlobal("sap.m.DraftIndicatorState")
@js.native
object DraftIndicatorState extends js.Object {
  @js.native
  sealed trait Clear
    extends openui5Lib.sapNs.mNs.DraftIndicatorState
  
  @js.native
  sealed trait Saved
    extends openui5Lib.sapNs.mNs.DraftIndicatorState
  
  @js.native
  sealed trait Saving
    extends openui5Lib.sapNs.mNs.DraftIndicatorState
  
  /* 0 */ val Clear: Clear with scala.Double = js.native
  /* 1 */ val Saved: Saved with scala.Double = js.native
  /* 2 */ val Saving: Saving with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.DraftIndicatorState with scala.Double] = js.native
}

