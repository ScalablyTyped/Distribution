package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameHighScore extends StObject {
  
  var position: Double
  
  var score: Double
  
  var user: User
}
object GameHighScore {
  
  @scala.inline
  def apply(position: Double, score: Double, user: User): GameHighScore = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameHighScore]
  }
  
  @scala.inline
  implicit class GameHighScoreMutableBuilder[Self <: GameHighScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
