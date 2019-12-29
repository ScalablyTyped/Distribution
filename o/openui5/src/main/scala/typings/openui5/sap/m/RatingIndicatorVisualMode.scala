package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RatingIndicatorVisualMode with Double] = js.native
  /* 0 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 1 */ @js.native
  object Half extends TopLevel[Half with Double]
  
}

