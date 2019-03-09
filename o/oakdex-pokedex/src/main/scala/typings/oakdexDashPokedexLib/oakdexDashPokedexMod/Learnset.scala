package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Learnset extends js.Object {
  var egg_move: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var move: java.lang.String
  var tm: js.UndefOr[java.lang.String] = js.undefined
  var variations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Learnset {
  @scala.inline
  def apply(
    move: java.lang.String,
    egg_move: js.UndefOr[scala.Boolean] = js.undefined,
    level: scala.Int | scala.Double = null,
    tm: java.lang.String = null,
    variations: js.Array[java.lang.String] = null
  ): Learnset = {
    val __obj = js.Dynamic.literal(move = move)
    if (!js.isUndefined(egg_move)) __obj.updateDynamic("egg_move")(egg_move)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (tm != null) __obj.updateDynamic("tm")(tm)
    if (variations != null) __obj.updateDynamic("variations")(variations)
    __obj.asInstanceOf[Learnset]
  }
}

