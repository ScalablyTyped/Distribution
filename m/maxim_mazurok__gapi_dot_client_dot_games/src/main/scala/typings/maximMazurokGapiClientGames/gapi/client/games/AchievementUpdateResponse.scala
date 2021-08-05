package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementUpdateResponse extends StObject {
  
  /** The achievement this update is was applied to. */
  var achievementId: js.UndefOr[String] = js.undefined
  
  /** The current state of the achievement. */
  var currentState: js.UndefOr[String] = js.undefined
  
  /** The current steps recorded for this achievement if it is incremental. */
  var currentSteps: js.UndefOr[Double] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the requested updates actually affected the achievement. */
  var updateOccurred: js.UndefOr[Boolean] = js.undefined
}
object AchievementUpdateResponse {
  
  inline def apply(): AchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateResponse]
  }
  
  extension [Self <: AchievementUpdateResponse](x: Self) {
    
    inline def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    inline def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    inline def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewlyUnlocked(value: Boolean): Self = StObject.set(x, "newlyUnlocked", value.asInstanceOf[js.Any])
    
    inline def setNewlyUnlockedUndefined: Self = StObject.set(x, "newlyUnlocked", js.undefined)
    
    inline def setUpdateOccurred(value: Boolean): Self = StObject.set(x, "updateOccurred", value.asInstanceOf[js.Any])
    
    inline def setUpdateOccurredUndefined: Self = StObject.set(x, "updateOccurred", js.undefined)
  }
}
