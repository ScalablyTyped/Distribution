package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementUnlockResponse extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUnlockResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[Boolean] = js.undefined
}
object AchievementUnlockResponse {
  
  @scala.inline
  def apply(): AchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUnlockResponse]
  }
  
  @scala.inline
  implicit class AchievementUnlockResponseMutableBuilder[Self <: AchievementUnlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewlyUnlocked(value: Boolean): Self = StObject.set(x, "newlyUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewlyUnlockedUndefined: Self = StObject.set(x, "newlyUnlocked", js.undefined)
  }
}
