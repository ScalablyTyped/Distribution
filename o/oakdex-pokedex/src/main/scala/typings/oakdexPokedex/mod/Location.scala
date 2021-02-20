package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  var names: Translations = js.native
  
  var pokemon: js.Array[LocationPokemon] = js.native
}
object Location {
  
  @scala.inline
  def apply(names: Translations, pokemon: js.Array[LocationPokemon]): Location = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPokemon(value: js.Array[LocationPokemon]): Self = StObject.set(x, "pokemon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPokemonVarargs(value: LocationPokemon*): Self = StObject.set(x, "pokemon", js.Array(value :_*))
  }
}
