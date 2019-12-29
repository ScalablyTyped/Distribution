package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Clear extends DraftIndicatorState
  
  @js.native
  sealed trait Saved extends DraftIndicatorState
  
  @js.native
  sealed trait Saving extends DraftIndicatorState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftIndicatorState with Double] = js.native
  /* 0 */ @js.native
  object Clear extends TopLevel[Clear with Double]
  
  /* 1 */ @js.native
  object Saved extends TopLevel[Saved with Double]
  
  /* 2 */ @js.native
  object Saving extends TopLevel[Saving with Double]
  
}

