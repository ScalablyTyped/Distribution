package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RatingIndicatorVisualMode extends js.Object

/**
  * Possible values for the visualization of float values in the RatingIndicator Control.
  */
@JSGlobal("sap.m.RatingIndicatorVisualMode")
@js.native
object RatingIndicatorVisualMode extends js.Object {
  @js.native
  sealed trait Full extends RatingIndicatorVisualMode
  
  @js.native
  sealed trait Half extends RatingIndicatorVisualMode
  
  /* 0 */ val Full: typings.openui5.sapNs.mNs.RatingIndicatorVisualMode.Full with Double = js.native
  /* 1 */ val Half: typings.openui5.sapNs.mNs.RatingIndicatorVisualMode.Half with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RatingIndicatorVisualMode with Double] = js.native
}

