package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonVariation extends js.Object {
  var abilities: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var base_stats: js.UndefOr[StatObject] = js.undefined
  var condition: js.UndefOr[java.lang.String] = js.undefined
  var height_eu: js.UndefOr[java.lang.String] = js.undefined
  var height_us: js.UndefOr[java.lang.String] = js.undefined
  var image_suffix: js.UndefOr[java.lang.String] = js.undefined
  var names: Translations
  var pokeathlon_stats: js.UndefOr[oakdexDashPokedexLib.Anon_Jump] = js.undefined
  var types: js.Array[java.lang.String]
  var weight_eu: js.UndefOr[java.lang.String] = js.undefined
  var weight_us: js.UndefOr[java.lang.String] = js.undefined
}

object PokemonVariation {
  @scala.inline
  def apply(
    names: Translations,
    types: js.Array[java.lang.String],
    abilities: js.Array[java.lang.String] = null,
    base_stats: StatObject = null,
    condition: java.lang.String = null,
    height_eu: java.lang.String = null,
    height_us: java.lang.String = null,
    image_suffix: java.lang.String = null,
    pokeathlon_stats: oakdexDashPokedexLib.Anon_Jump = null,
    weight_eu: java.lang.String = null,
    weight_us: java.lang.String = null
  ): PokemonVariation = {
    val __obj = js.Dynamic.literal(names = names, types = types)
    if (abilities != null) __obj.updateDynamic("abilities")(abilities)
    if (base_stats != null) __obj.updateDynamic("base_stats")(base_stats)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (height_eu != null) __obj.updateDynamic("height_eu")(height_eu)
    if (height_us != null) __obj.updateDynamic("height_us")(height_us)
    if (image_suffix != null) __obj.updateDynamic("image_suffix")(image_suffix)
    if (pokeathlon_stats != null) __obj.updateDynamic("pokeathlon_stats")(pokeathlon_stats)
    if (weight_eu != null) __obj.updateDynamic("weight_eu")(weight_eu)
    if (weight_us != null) __obj.updateDynamic("weight_us")(weight_us)
    __obj.asInstanceOf[PokemonVariation]
  }
}

