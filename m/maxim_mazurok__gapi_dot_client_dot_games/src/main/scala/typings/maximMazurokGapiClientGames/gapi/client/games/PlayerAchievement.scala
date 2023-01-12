package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerAchievement extends StObject {
  
  /** The state of the achievement. */
  var achievementState: js.UndefOr[String] = js.undefined
  
  /** The current steps for an incremental achievement. */
  var currentSteps: js.UndefOr[Double] = js.undefined
  
  /**
    * Experience points earned for the achievement. This field is absent for achievements that have not yet been unlocked and 0 for achievements that have been unlocked by testers but
    * that are unpublished.
    */
  var experiencePoints: js.UndefOr[String] = js.undefined
  
  /** The current steps for an incremental achievement as a string. */
  var formattedCurrentStepsString: js.UndefOr[String] = js.undefined
  
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerAchievement`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The timestamp of the last modification to this achievement's state. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
}
object PlayerAchievement {
  
  inline def apply(): PlayerAchievement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerAchievement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerAchievement] (val x: Self) extends AnyVal {
    
    inline def setAchievementState(value: String): Self = StObject.set(x, "achievementState", value.asInstanceOf[js.Any])
    
    inline def setAchievementStateUndefined: Self = StObject.set(x, "achievementState", js.undefined)
    
    inline def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    inline def setExperiencePoints(value: String): Self = StObject.set(x, "experiencePoints", value.asInstanceOf[js.Any])
    
    inline def setExperiencePointsUndefined: Self = StObject.set(x, "experiencePoints", js.undefined)
    
    inline def setFormattedCurrentStepsString(value: String): Self = StObject.set(x, "formattedCurrentStepsString", value.asInstanceOf[js.Any])
    
    inline def setFormattedCurrentStepsStringUndefined: Self = StObject.set(x, "formattedCurrentStepsString", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
  }
}
