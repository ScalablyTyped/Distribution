package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oakdexPokedex.anon.Female
import typings.oakdexPokedex.anon.Jump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pokemon extends js.Object {
  var abilities: js.Array[PokemonAbility]
  var alola_id: Double | Null
  var base_exp_yield: Double
  var base_friendship: Double
  var base_stats: StatObject
  var catch_rate: Double
  var categories: Translations
  var color: String
  var egg_groups: js.Array[String]
  var ev_yield: StatObject
  var evolution_from: String | Null
  var evolutions: js.Array[PokemonEvolution]
  var gender_ratios: Null | Female
  var hatch_time: js.Array[Double]
  var height_eu: String
  var height_us: String
  var hoenn_id: Double | Null
  var johto_id: Double | Null
  var kalos_id: Double | Null
  var kanto_id: Double | Null
  var leveling_rate: String
  var mega_evolutions: js.Array[MegaEvolution]
  var move_learnsets: js.Array[MoveLearnset]
  var names: Translations
  var national_id: Double
  var pokeathlon_stats: js.UndefOr[Jump] = js.undefined
  var pokedex_entries: StringDictionary[Translations]
  var sinnoh_id: Double | Null
  var types: js.Array[String]
  var ultra_alola_id: Double | Null
  var unova_id: Double | Null
  var variation_names: js.UndefOr[Translations] = js.undefined
  var variations: js.Array[PokemonVariation]
  var weight_eu: String
  var weight_us: String
}

object Pokemon {
  @scala.inline
  def apply(
    abilities: js.Array[PokemonAbility],
    base_exp_yield: Double,
    base_friendship: Double,
    base_stats: StatObject,
    catch_rate: Double,
    categories: Translations,
    color: String,
    egg_groups: js.Array[String],
    ev_yield: StatObject,
    evolutions: js.Array[PokemonEvolution],
    hatch_time: js.Array[Double],
    height_eu: String,
    height_us: String,
    leveling_rate: String,
    mega_evolutions: js.Array[MegaEvolution],
    move_learnsets: js.Array[MoveLearnset],
    names: Translations,
    national_id: Double,
    pokedex_entries: StringDictionary[Translations],
    types: js.Array[String],
    variations: js.Array[PokemonVariation],
    weight_eu: String,
    weight_us: String,
    alola_id: Double = null.asInstanceOf[Double],
    evolution_from: String = null,
    gender_ratios: Female = null,
    hoenn_id: Double = null.asInstanceOf[Double],
    johto_id: Double = null.asInstanceOf[Double],
    kalos_id: Double = null.asInstanceOf[Double],
    kanto_id: Double = null.asInstanceOf[Double],
    pokeathlon_stats: Jump = null,
    sinnoh_id: Double = null.asInstanceOf[Double],
    ultra_alola_id: Double = null.asInstanceOf[Double],
    unova_id: Double = null.asInstanceOf[Double],
    variation_names: Translations = null
  ): Pokemon = {
    val __obj = js.Dynamic.literal(abilities = abilities.asInstanceOf[js.Any], base_exp_yield = base_exp_yield.asInstanceOf[js.Any], base_friendship = base_friendship.asInstanceOf[js.Any], base_stats = base_stats.asInstanceOf[js.Any], catch_rate = catch_rate.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], egg_groups = egg_groups.asInstanceOf[js.Any], ev_yield = ev_yield.asInstanceOf[js.Any], evolutions = evolutions.asInstanceOf[js.Any], hatch_time = hatch_time.asInstanceOf[js.Any], height_eu = height_eu.asInstanceOf[js.Any], height_us = height_us.asInstanceOf[js.Any], leveling_rate = leveling_rate.asInstanceOf[js.Any], mega_evolutions = mega_evolutions.asInstanceOf[js.Any], move_learnsets = move_learnsets.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], national_id = national_id.asInstanceOf[js.Any], pokedex_entries = pokedex_entries.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any], weight_eu = weight_eu.asInstanceOf[js.Any], weight_us = weight_us.asInstanceOf[js.Any], alola_id = alola_id.asInstanceOf[js.Any], evolution_from = evolution_from.asInstanceOf[js.Any], gender_ratios = gender_ratios.asInstanceOf[js.Any], hoenn_id = hoenn_id.asInstanceOf[js.Any], johto_id = johto_id.asInstanceOf[js.Any], kalos_id = kalos_id.asInstanceOf[js.Any], kanto_id = kanto_id.asInstanceOf[js.Any], sinnoh_id = sinnoh_id.asInstanceOf[js.Any], ultra_alola_id = ultra_alola_id.asInstanceOf[js.Any], unova_id = unova_id.asInstanceOf[js.Any])
    if (pokeathlon_stats != null) __obj.updateDynamic("pokeathlon_stats")(pokeathlon_stats.asInstanceOf[js.Any])
    if (variation_names != null) __obj.updateDynamic("variation_names")(variation_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pokemon]
  }
}

