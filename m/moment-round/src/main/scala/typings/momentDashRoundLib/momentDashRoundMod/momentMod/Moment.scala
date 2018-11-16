package typings
package momentDashRoundLib.momentDashRoundMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def ceil(precision: scala.Double, key: java.lang.String): Moment = js.native
  def floor(precision: scala.Double, key: java.lang.String): Moment = js.native
  def round(precision: scala.Double, key: java.lang.String): Moment = js.native
  @JSName("round")
  def round_ceil(
    precision: scala.Double,
    key: java.lang.String,
    direction: momentDashRoundLib.momentDashRoundLibStrings.ceil
  ): Moment = js.native
  @JSName("round")
  def round_floor(
    precision: scala.Double,
    key: java.lang.String,
    direction: momentDashRoundLib.momentDashRoundLibStrings.floor
  ): Moment = js.native
  @JSName("round")
  def round_round(
    precision: scala.Double,
    key: java.lang.String,
    direction: momentDashRoundLib.momentDashRoundLibStrings.round
  ): Moment = js.native
}

