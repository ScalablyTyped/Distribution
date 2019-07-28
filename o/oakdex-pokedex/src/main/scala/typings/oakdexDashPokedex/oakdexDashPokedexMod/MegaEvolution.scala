package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MegaEvolution extends js.Object {
  var ability: String
  var base_stats: StatObject
  var height_eu: String
  var height_us: String
  var image_suffix: js.UndefOr[String] = js.undefined
  var mega_stone: String
  var types: js.Array[String]
  var weight_eu: String
  var weight_us: String
}

object MegaEvolution {
  @scala.inline
  def apply(
    ability: String,
    base_stats: StatObject,
    height_eu: String,
    height_us: String,
    mega_stone: String,
    types: js.Array[String],
    weight_eu: String,
    weight_us: String,
    image_suffix: String = null
  ): MegaEvolution = {
    val __obj = js.Dynamic.literal(ability = ability, base_stats = base_stats, height_eu = height_eu, height_us = height_us, mega_stone = mega_stone, types = types, weight_eu = weight_eu, weight_us = weight_us)
    if (image_suffix != null) __obj.updateDynamic("image_suffix")(image_suffix)
    __obj.asInstanceOf[MegaEvolution]
  }
}

