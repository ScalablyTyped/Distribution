package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Played extends js.Object {
  var played: js.UndefOr[scala.Nothing] = js.undefined
  var won: Double
}

object Played {
  @scala.inline
  def apply(won: Double): Played = {
    val __obj = js.Dynamic.literal(won = won.asInstanceOf[js.Any])
    __obj.asInstanceOf[Played]
  }
}

