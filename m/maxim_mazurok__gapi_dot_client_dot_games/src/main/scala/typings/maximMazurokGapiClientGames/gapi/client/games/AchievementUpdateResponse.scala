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
  
  @scala.inline
  def apply(): AchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateResponse]
  }
  
  @scala.inline
  implicit class AchievementUpdateResponseMutableBuilder[Self <: AchievementUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    @scala.inline
    def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    @scala.inline
    def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewlyUnlocked(value: Boolean): Self = StObject.set(x, "newlyUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewlyUnlockedUndefined: Self = StObject.set(x, "newlyUnlocked", js.undefined)
    
    @scala.inline
    def setUpdateOccurred(value: Boolean): Self = StObject.set(x, "updateOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOccurredUndefined: Self = StObject.set(x, "updateOccurred", js.undefined)
  }
}
