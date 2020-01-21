package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlayed extends js.Object {
  var played: js.UndefOr[scala.Nothing] = js.undefined
  var won: Double
}

object AnonPlayed {
  @scala.inline
  def apply(won: Double, played: js.UndefOr[scala.Nothing] = js.undefined): AnonPlayed = {
    val __obj = js.Dynamic.literal(won = won.asInstanceOf[js.Any])
    if (!js.isUndefined(played)) __obj.updateDynamic("played")(played.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlayed]
  }
}

