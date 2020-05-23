package typings.openui5.sap.m

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
  
}

