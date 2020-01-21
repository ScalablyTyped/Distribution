package typings.oakdexPokedex.mod

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
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], max_level = max_level.asInstanceOf[js.Any], min_level = min_level.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any], rarity = rarity.asInstanceOf[js.Any])
    if (day_times != null) __obj.updateDynamic("day_times")(day_times.asInstanceOf[js.Any])
    if (seasons != null) __obj.updateDynamic("seasons")(seasons.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPokemon]
  }
}

