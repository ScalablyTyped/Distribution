package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveLearnset extends StObject {
  
  var games: js.Array[String]
  
  var learnset: js.Array[Learnset]
}
object MoveLearnset {
  
  inline def apply(games: js.Array[String], learnset: js.Array[Learnset]): MoveLearnset = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], learnset = learnset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveLearnset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveLearnset] (val x: Self) extends AnyVal {
    
    inline def setGames(value: js.Array[String]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setGamesVarargs(value: String*): Self = StObject.set(x, "games", js.Array(value*))
    
    inline def setLearnset(value: js.Array[Learnset]): Self = StObject.set(x, "learnset", value.asInstanceOf[js.Any])
    
    inline def setLearnsetVarargs(value: Learnset*): Self = StObject.set(x, "learnset", js.Array(value*))
  }
}
