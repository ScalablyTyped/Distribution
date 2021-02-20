package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generation extends StObject {
  
  var dex_name: String = js.native
  
  var games: js.Array[Translations] = js.native
  
  var names: Translations = js.native
  
  var number: Double = js.native
}
object Generation {
  
  @scala.inline
  def apply(dex_name: String, games: js.Array[Translations], names: Translations, number: Double): Generation = {
    val __obj = js.Dynamic.literal(dex_name = dex_name.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generation]
  }
  
  @scala.inline
  implicit class GenerationMutableBuilder[Self <: Generation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDex_name(value: String): Self = StObject.set(x, "dex_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGames(value: js.Array[Translations]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamesVarargs(value: Translations*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
