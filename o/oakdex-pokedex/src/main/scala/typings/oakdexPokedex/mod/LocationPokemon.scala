package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPokemon extends js.Object {
  var day_times: js.UndefOr[js.Array[String]] = js.native
  var games: js.Array[String] = js.native
  var location: String = js.native
  var max_level: Double = js.native
  var min_level: Double = js.native
  var pokemon: String = js.native
  var rarity: String = js.native
  var seasons: js.UndefOr[js.Array[String]] = js.native
  var variation: js.UndefOr[String] = js.native
}

object LocationPokemon {
  @scala.inline
  def apply(
    games: js.Array[String],
    location: String,
    max_level: Double,
    min_level: Double,
    pokemon: String,
    rarity: String
  ): LocationPokemon = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], max_level = max_level.asInstanceOf[js.Any], min_level = min_level.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any], rarity = rarity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPokemon]
  }
  @scala.inline
  implicit class LocationPokemonOps[Self <: LocationPokemon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGamesVarargs(value: String*): Self = this.set("games", js.Array(value :_*))
    @scala.inline
    def setGames(value: js.Array[String]): Self = this.set("games", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_level(value: Double): Self = this.set("max_level", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin_level(value: Double): Self = this.set("min_level", value.asInstanceOf[js.Any])
    @scala.inline
    def setPokemon(value: String): Self = this.set("pokemon", value.asInstanceOf[js.Any])
    @scala.inline
    def setRarity(value: String): Self = this.set("rarity", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay_timesVarargs(value: String*): Self = this.set("day_times", js.Array(value :_*))
    @scala.inline
    def setDay_times(value: js.Array[String]): Self = this.set("day_times", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay_times: Self = this.set("day_times", js.undefined)
    @scala.inline
    def setSeasonsVarargs(value: String*): Self = this.set("seasons", js.Array(value :_*))
    @scala.inline
    def setSeasons(value: js.Array[String]): Self = this.set("seasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeasons: Self = this.set("seasons", js.undefined)
    @scala.inline
    def setVariation(value: String): Self = this.set("variation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariation: Self = this.set("variation", js.undefined)
  }
  
}

