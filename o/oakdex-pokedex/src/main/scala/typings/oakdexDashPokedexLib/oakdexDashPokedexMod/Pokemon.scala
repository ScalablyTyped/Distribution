package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pokemon extends js.Object {
  var abilities: js.Array[PokemonAbility]
  var alola_id: scala.Double | scala.Null
  var base_exp_yield: scala.Double
  var base_friendship: scala.Double
  var base_stats: StatObject
  var catch_rate: scala.Double
  var categories: Translations
  var color: java.lang.String
  var egg_groups: js.Array[java.lang.String]
  var ev_yield: StatObject
  var evolution_from: java.lang.String | scala.Null
  var evolutions: js.Array[PokemonEvolution]
  var gender_ratios: scala.Null | oakdexDashPokedexLib.Anon_Female
  var hatch_time: js.Array[scala.Double]
  var height_eu: java.lang.String
  var height_us: java.lang.String
  var hoenn_id: scala.Double | scala.Null
  var johto_id: scala.Double | scala.Null
  var kalos_id: scala.Double | scala.Null
  var kanto_id: scala.Double | scala.Null
  var leveling_rate: java.lang.String
  var mega_evolutions: js.Array[MegaEvolution]
  var move_learnsets: js.Array[MoveLearnset]
  var names: Translations
  var national_id: scala.Double
  var pokeathlon_stats: js.UndefOr[oakdexDashPokedexLib.Anon_Jump] = js.undefined
  var pokedex_entries: org.scalablytyped.runtime.StringDictionary[Translations]
  var sinnoh_id: scala.Double | scala.Null
  var types: js.Array[java.lang.String]
  var ultra_alola_id: scala.Double | scala.Null
  var unova_id: scala.Double | scala.Null
  var variation_names: js.UndefOr[Translations] = js.undefined
  var variations: js.Array[PokemonVariation]
  var weight_eu: java.lang.String
  var weight_us: java.lang.String
}

object Pokemon {
  @scala.inline
  def apply(
    abilities: js.Array[PokemonAbility],
    base_exp_yield: scala.Double,
    base_friendship: scala.Double,
    base_stats: StatObject,
    catch_rate: scala.Double,
    categories: Translations,
    color: java.lang.String,
    egg_groups: js.Array[java.lang.String],
    ev_yield: StatObject,
    evolutions: js.Array[PokemonEvolution],
    hatch_time: js.Array[scala.Double],
    height_eu: java.lang.String,
    height_us: java.lang.String,
    leveling_rate: java.lang.String,
    mega_evolutions: js.Array[MegaEvolution],
    move_learnsets: js.Array[MoveLearnset],
    names: Translations,
    national_id: scala.Double,
    pokedex_entries: org.scalablytyped.runtime.StringDictionary[Translations],
    types: js.Array[java.lang.String],
    variations: js.Array[PokemonVariation],
    weight_eu: java.lang.String,
    weight_us: java.lang.String,
    alola_id: scala.Int | scala.Double = null,
    evolution_from: java.lang.String = null,
    gender_ratios: oakdexDashPokedexLib.Anon_Female = null,
    hoenn_id: scala.Int | scala.Double = null,
    johto_id: scala.Int | scala.Double = null,
    kalos_id: scala.Int | scala.Double = null,
    kanto_id: scala.Int | scala.Double = null,
    pokeathlon_stats: oakdexDashPokedexLib.Anon_Jump = null,
    sinnoh_id: scala.Int | scala.Double = null,
    ultra_alola_id: scala.Int | scala.Double = null,
    unova_id: scala.Int | scala.Double = null,
    variation_names: Translations = null
  ): Pokemon = {
    val __obj = js.Dynamic.literal(abilities = abilities, base_exp_yield = base_exp_yield, base_friendship = base_friendship, base_stats = base_stats, catch_rate = catch_rate, categories = categories, color = color, egg_groups = egg_groups, ev_yield = ev_yield, evolutions = evolutions, hatch_time = hatch_time, height_eu = height_eu, height_us = height_us, leveling_rate = leveling_rate, mega_evolutions = mega_evolutions, move_learnsets = move_learnsets, names = names, national_id = national_id, pokedex_entries = pokedex_entries, types = types, variations = variations, weight_eu = weight_eu, weight_us = weight_us)
    if (alola_id != null) __obj.updateDynamic("alola_id")(alola_id.asInstanceOf[js.Any])
    if (evolution_from != null) __obj.updateDynamic("evolution_from")(evolution_from)
    if (gender_ratios != null) __obj.updateDynamic("gender_ratios")(gender_ratios)
    if (hoenn_id != null) __obj.updateDynamic("hoenn_id")(hoenn_id.asInstanceOf[js.Any])
    if (johto_id != null) __obj.updateDynamic("johto_id")(johto_id.asInstanceOf[js.Any])
    if (kalos_id != null) __obj.updateDynamic("kalos_id")(kalos_id.asInstanceOf[js.Any])
    if (kanto_id != null) __obj.updateDynamic("kanto_id")(kanto_id.asInstanceOf[js.Any])
    if (pokeathlon_stats != null) __obj.updateDynamic("pokeathlon_stats")(pokeathlon_stats)
    if (sinnoh_id != null) __obj.updateDynamic("sinnoh_id")(sinnoh_id.asInstanceOf[js.Any])
    if (ultra_alola_id != null) __obj.updateDynamic("ultra_alola_id")(ultra_alola_id.asInstanceOf[js.Any])
    if (unova_id != null) __obj.updateDynamic("unova_id")(unova_id.asInstanceOf[js.Any])
    if (variation_names != null) __obj.updateDynamic("variation_names")(variation_names)
    __obj.asInstanceOf[Pokemon]
  }
}

