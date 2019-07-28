package typings.momentDashRound.momentDashRoundMod.momentMod

import typings.momentDashRound.momentDashRoundStrings.ceil
import typings.momentDashRound.momentDashRoundStrings.floor
import typings.momentDashRound.momentDashRoundStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def ceil(precision: Double, key: String): Moment = js.native
  def floor(precision: Double, key: String): Moment = js.native
  def round(precision: Double, key: String): Moment = js.native
  @JSName("round")
  def round_ceil(precision: Double, key: String, direction: ceil): Moment = js.native
  @JSName("round")
  def round_floor(precision: Double, key: String, direction: floor): Moment = js.native
  @JSName("round")
  def round_round(precision: Double, key: String, direction: round): Moment = js.native
}

