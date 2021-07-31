package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationPokemon extends StObject {
  
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
    rarity: String
  ): LocationPokemon = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], max_level = max_level.asInstanceOf[js.Any], min_level = min_level.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any], rarity = rarity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPokemon]
  }
  
  @scala.inline
  implicit class LocationPokemonMutableBuilder[Self <: LocationPokemon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay_times(value: js.Array[String]): Self = StObject.set(x, "day_times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay_timesUndefined: Self = StObject.set(x, "day_times", js.undefined)
    
    @scala.inline
    def setDay_timesVarargs(value: String*): Self = StObject.set(x, "day_times", js.Array(value :_*))
    
    @scala.inline
    def setGames(value: js.Array[String]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamesVarargs(value: String*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_level(value: Double): Self = StObject.set(x, "max_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_level(value: Double): Self = StObject.set(x, "min_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPokemon(value: String): Self = StObject.set(x, "pokemon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRarity(value: String): Self = StObject.set(x, "rarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasons(value: js.Array[String]): Self = StObject.set(x, "seasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonsUndefined: Self = StObject.set(x, "seasons", js.undefined)
    
    @scala.inline
    def setSeasonsVarargs(value: String*): Self = StObject.set(x, "seasons", js.Array(value :_*))
    
    @scala.inline
    def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
