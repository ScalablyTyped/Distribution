package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MegaEvolution extends js.Object {
  var ability: java.lang.String
  var base_stats: StatObject
  var height_eu: java.lang.String
  var height_us: java.lang.String
  var image_suffix: js.UndefOr[java.lang.String] = js.undefined
  var mega_stone: java.lang.String
  var types: js.Array[java.lang.String]
  var weight_eu: java.lang.String
  var weight_us: java.lang.String
}

object MegaEvolution {
  @scala.inline
  def apply(
    ability: java.lang.String,
    base_stats: StatObject,
    height_eu: java.lang.String,
    height_us: java.lang.String,
    mega_stone: java.lang.String,
    types: js.Array[java.lang.String],
    weight_eu: java.lang.String,
    weight_us: java.lang.String,
    image_suffix: java.lang.String = null
  ): MegaEvolution = {
    val __obj = js.Dynamic.literal(ability = ability, base_stats = base_stats, height_eu = height_eu, height_us = height_us, mega_stone = mega_stone, types = types, weight_eu = weight_eu, weight_us = weight_us)
    if (image_suffix != null) __obj.updateDynamic("image_suffix")(image_suffix)
    __obj.asInstanceOf[MegaEvolution]
  }
}

