package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerExperienceInfo extends StObject {
  
  /** The current number of experience points for the player. */
  var currentExperiencePoints: js.UndefOr[String] = js.undefined
  
  /** The current level of the player. */
  var currentLevel: js.UndefOr[PlayerLevel] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerExperienceInfo`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The timestamp when the player was leveled up, in millis since Unix epoch UTC. */
  var lastLevelUpTimestampMillis: js.UndefOr[String] = js.undefined
  
  /** The next level of the player. If the current level is the maximum level, this should be same as the current level. */
  var nextLevel: js.UndefOr[PlayerLevel] = js.undefined
}
object PlayerExperienceInfo {
  
  @scala.inline
  def apply(): PlayerExperienceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerExperienceInfo]
  }
  
  @scala.inline
  implicit class PlayerExperienceInfoMutableBuilder[Self <: PlayerExperienceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentExperiencePoints(value: String): Self = StObject.set(x, "currentExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentExperiencePointsUndefined: Self = StObject.set(x, "currentExperiencePoints", js.undefined)
    
    @scala.inline
    def setCurrentLevel(value: PlayerLevel): Self = StObject.set(x, "currentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLevelUndefined: Self = StObject.set(x, "currentLevel", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastLevelUpTimestampMillis(value: String): Self = StObject.set(x, "lastLevelUpTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLevelUpTimestampMillisUndefined: Self = StObject.set(x, "lastLevelUpTimestampMillis", js.undefined)
    
    @scala.inline
    def setNextLevel(value: PlayerLevel): Self = StObject.set(x, "nextLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLevelUndefined: Self = StObject.set(x, "nextLevel", js.undefined)
  }
}
