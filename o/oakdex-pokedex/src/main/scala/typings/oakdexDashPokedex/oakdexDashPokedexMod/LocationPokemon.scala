package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationPokemon extends js.Object {
  var day_times: js.UndefOr[js.Array[String]] = js.undefined
  var games: js.Array[String]
  var location: String
  var max_level: Double
  var min_level: Double
  var pokemon: String
  var rarity: String
  var seasons: js.UndefOr[js.Array[String]] = js.undefined
  var variation: js.UndefOr[String] = js.undefined
}

object LocationPokemon {
  @scala.inline
  def apply(
    games: js.Array[String],
    location: String,
    max_level: Double,
    min_level: Double,
    pokemon: String,
    rarity: String,
    day_times: js.Array[String] = null,
    seasons: js.Array[String] = null,
    variation: String = null
  ): LocationPokemon = {
    val __obj = js.Dynamic.literal(games = games, location = location, max_level = max_level, min_level = min_level, pokemon = pokemon, rarity = rarity)
    if (day_times != null) __obj.updateDynamic("day_times")(day_times)
    if (seasons != null) __obj.updateDynamic("seasons")(seasons)
    if (variation != null) __obj.updateDynamic("variation")(variation)
    __obj.asInstanceOf[LocationPokemon]
  }
}

