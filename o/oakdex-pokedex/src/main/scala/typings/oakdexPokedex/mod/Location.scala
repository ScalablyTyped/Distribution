package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var names: Translations
  
  var pokemon: js.Array[LocationPokemon]
}
object Location {
  
  inline def apply(names: Translations, pokemon: js.Array[LocationPokemon]): Location = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setPokemon(value: js.Array[LocationPokemon]): Self = StObject.set(x, "pokemon", value.asInstanceOf[js.Any])
    
    inline def setPokemonVarargs(value: LocationPokemon*): Self = StObject.set(x, "pokemon", js.Array(value :_*))
  }
}
