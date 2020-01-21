package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Learnset extends js.Object {
  var egg_move: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var move: String
  var tm: js.UndefOr[String] = js.undefined
  var variations: js.UndefOr[js.Array[String]] = js.undefined
}

object Learnset {
  @scala.inline
  def apply(
    move: String,
    egg_move: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null,
    tm: String = null,
    variations: js.Array[String] = null
  ): Learnset = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    if (!js.isUndefined(egg_move)) __obj.updateDynamic("egg_move")(egg_move.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (tm != null) __obj.updateDynamic("tm")(tm.asInstanceOf[js.Any])
    if (variations != null) __obj.updateDynamic("variations")(variations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Learnset]
  }
}

