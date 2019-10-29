package typings.overwatchDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Played extends js.Object {
  var played: js.UndefOr[scala.Nothing] = js.undefined
  var won: Double
}

object Anon_Played {
  @scala.inline
  def apply(won: Double, played: js.UndefOr[scala.Nothing] = js.undefined): Anon_Played = {
    val __obj = js.Dynamic.literal(won = won)
    if (!js.isUndefined(played)) __obj.updateDynamic("played")(played)
    __obj.asInstanceOf[Anon_Played]
  }
}

