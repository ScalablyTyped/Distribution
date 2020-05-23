package typings.oakdexPokedex.mod

import typings.oakdexPokedex.anon.Jump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonVariation extends js.Object {
  var abilities: js.UndefOr[js.Array[String]] = js.undefined
  var base_stats: js.UndefOr[StatObject] = js.undefined
  var condition: js.UndefOr[String] = js.undefined
  var height_eu: js.UndefOr[String] = js.undefined
  var height_us: js.UndefOr[String] = js.undefined
  var image_suffix: js.UndefOr[String] = js.undefined
  var names: Translations
  var pokeathlon_stats: js.UndefOr[Jump] = js.undefined
  var types: js.Array[String]
  var weight_eu: js.UndefOr[String] = js.undefined
  var weight_us: js.UndefOr[String] = js.undefined
}

object PokemonVariation {
  @scala.inline
  def apply(
    names: Translations,
    types: js.Array[String],
    abilities: js.Array[String] = null,
    base_stats: StatObject = null,
    condition: String = null,
    height_eu: String = null,
    height_us: String = null,
    image_suffix: String = null,
    pokeathlon_stats: Jump = null,
    weight_eu: String = null,
    weight_us: String = null
  ): PokemonVariation = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (abilities != null) __obj.updateDynamic("abilities")(abilities.asInstanceOf[js.Any])
    if (base_stats != null) __obj.updateDynamic("base_stats")(base_stats.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (height_eu != null) __obj.updateDynamic("height_eu")(height_eu.asInstanceOf[js.Any])
    if (height_us != null) __obj.updateDynamic("height_us")(height_us.asInstanceOf[js.Any])
    if (image_suffix != null) __obj.updateDynamic("image_suffix")(image_suffix.asInstanceOf[js.Any])
    if (pokeathlon_stats != null) __obj.updateDynamic("pokeathlon_stats")(pokeathlon_stats.asInstanceOf[js.Any])
    if (weight_eu != null) __obj.updateDynamic("weight_eu")(weight_eu.asInstanceOf[js.Any])
    if (weight_us != null) __obj.updateDynamic("weight_us")(weight_us.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonVariation]
  }
}

