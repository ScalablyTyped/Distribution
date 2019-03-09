package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationPokemon extends js.Object {
  var day_times: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var games: js.Array[java.lang.String]
  var location: java.lang.String
  var max_level: scala.Double
  var min_level: scala.Double
  var pokemon: java.lang.String
  var rarity: java.lang.String
  var seasons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var variation: js.UndefOr[java.lang.String] = js.undefined
}

object LocationPokemon {
  @scala.inline
  def apply(
    games: js.Array[java.lang.String],
    location: java.lang.String,
    max_level: scala.Double,
    min_level: scala.Double,
    pokemon: java.lang.String,
    rarity: java.lang.String,
    day_times: js.Array[java.lang.String] = null,
    seasons: js.Array[java.lang.String] = null,
    variation: java.lang.String = null
  ): LocationPokemon = {
    val __obj = js.Dynamic.literal(games = games, location = location, max_level = max_level, min_level = min_level, pokemon = pokemon, rarity = rarity)
    if (day_times != null) __obj.updateDynamic("day_times")(day_times)
    if (seasons != null) __obj.updateDynamic("seasons")(seasons)
    if (variation != null) __obj.updateDynamic("variation")(variation)
    __obj.asInstanceOf[LocationPokemon]
  }
}

