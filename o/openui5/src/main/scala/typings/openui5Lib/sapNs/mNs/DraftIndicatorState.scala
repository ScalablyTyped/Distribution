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
  
  val Clear: Clear with java.lang.String = js.native
  val Saved: Saved with java.lang.String = js.native
  val Saving: Saving with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.DraftIndicatorState with java.lang.String] = js.native
}

