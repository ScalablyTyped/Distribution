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
  
  val Full: Full with java.lang.String = js.native
  val Half: Half with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.RatingIndicatorVisualMode with java.lang.String] = js.native
}

