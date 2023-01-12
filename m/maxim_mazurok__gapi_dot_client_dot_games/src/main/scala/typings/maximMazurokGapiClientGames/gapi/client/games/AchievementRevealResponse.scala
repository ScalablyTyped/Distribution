package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementRevealResponse extends StObject {
  
  /** The current state of the achievement for which a reveal was attempted. This might be `UNLOCKED` if the achievement was already unlocked. */
  var currentState: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementRevealResponse`. */
  var kind: js.UndefOr[String] = js.undefined
}
object AchievementRevealResponse {
  
  inline def apply(): AchievementRevealResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementRevealResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AchievementRevealResponse] (val x: Self) extends AnyVal {
    
    inline def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
