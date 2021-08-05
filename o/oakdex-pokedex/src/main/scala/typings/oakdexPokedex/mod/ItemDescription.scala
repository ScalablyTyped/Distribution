package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDescription extends StObject {
  
  var games: js.Array[String]
  
  var translations: Translations
}
object ItemDescription {
  
  inline def apply(games: js.Array[String], translations: Translations): ItemDescription = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDescription]
  }
  
  extension [Self <: ItemDescription](x: Self) {
    
    inline def setGames(value: js.Array[String]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setGamesVarargs(value: String*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    inline def setTranslations(value: Translations): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
  }
}
