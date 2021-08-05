package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Generation extends StObject {
  
  var dex_name: String
  
  var games: js.Array[Translations]
  
  var names: Translations
  
  var number: Double
}
object Generation {
  
  inline def apply(dex_name: String, games: js.Array[Translations], names: Translations, number: Double): Generation = {
    val __obj = js.Dynamic.literal(dex_name = dex_name.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generation]
  }
  
  extension [Self <: Generation](x: Self) {
    
    inline def setDex_name(value: String): Self = StObject.set(x, "dex_name", value.asInstanceOf[js.Any])
    
    inline def setGames(value: js.Array[Translations]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setGamesVarargs(value: Translations*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
