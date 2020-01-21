package typings.oakdexPokedex.mod

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
    val __obj = js.Dynamic.literal(ability = ability.asInstanceOf[js.Any], base_stats = base_stats.asInstanceOf[js.Any], height_eu = height_eu.asInstanceOf[js.Any], height_us = height_us.asInstanceOf[js.Any], mega_stone = mega_stone.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], weight_eu = weight_eu.asInstanceOf[js.Any], weight_us = weight_us.asInstanceOf[js.Any])
    if (image_suffix != null) __obj.updateDynamic("image_suffix")(image_suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MegaEvolution]
  }
}

