package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Full
    extends openui5Lib.sapNs.mNs.RatingIndicatorVisualMode
  
  @js.native
  sealed trait Half
    extends openui5Lib.sapNs.mNs.RatingIndicatorVisualMode
  
  /* 0 */ val Full: Full with scala.Double = js.native
  /* 1 */ val Half: Half with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.RatingIndicatorVisualMode with scala.Double] = js.native
}

