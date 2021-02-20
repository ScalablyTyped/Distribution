package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveLearnset extends StObject {
  
  var games: js.Array[String] = js.native
  
  var learnset: js.Array[Learnset] = js.native
}
object MoveLearnset {
  
  @scala.inline
  def apply(games: js.Array[String], learnset: js.Array[Learnset]): MoveLearnset = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], learnset = learnset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveLearnset]
  }
  
  @scala.inline
  implicit class MoveLearnsetMutableBuilder[Self <: MoveLearnset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGames(value: js.Array[String]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamesVarargs(value: String*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    @scala.inline
    def setLearnset(value: js.Array[Learnset]): Self = StObject.set(x, "learnset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnsetVarargs(value: Learnset*): Self = StObject.set(x, "learnset", js.Array(value :_*))
  }
}
