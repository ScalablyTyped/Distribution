package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementDefinition extends StObject {
  
  /** The type of the achievement. */
  var achievementType: js.UndefOr[String] = js.undefined
  
  /** The description of the achievement. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Experience points which will be earned when unlocking this achievement. */
  var experiencePoints: js.UndefOr[String] = js.undefined
  
  /** The total steps for an incremental achievement as a string. */
  var formattedTotalSteps: js.UndefOr[String] = js.undefined
  
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The initial state of the achievement. */
  var initialState: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the revealed icon image being returned is a default image, or is provided by the game. */
  var isRevealedIconUrlDefault: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the unlocked icon image being returned is a default image, or is game-provided. */
  var isUnlockedIconUrlDefault: js.UndefOr[Boolean] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementDefinition`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of the achievement. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The image URL for the revealed achievement icon. */
  var revealedIconUrl: js.UndefOr[String] = js.undefined
  
  /** The total steps for an incremental achievement. */
  var totalSteps: js.UndefOr[Double] = js.undefined
  
  /** The image URL for the unlocked achievement icon. */
  var unlockedIconUrl: js.UndefOr[String] = js.undefined
}
object AchievementDefinition {
  
  inline def apply(): AchievementDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementDefinition]
  }
  
  extension [Self <: AchievementDefinition](x: Self) {
    
    inline def setAchievementType(value: String): Self = StObject.set(x, "achievementType", value.asInstanceOf[js.Any])
    
    inline def setAchievementTypeUndefined: Self = StObject.set(x, "achievementType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperiencePoints(value: String): Self = StObject.set(x, "experiencePoints", value.asInstanceOf[js.Any])
    
    inline def setExperiencePointsUndefined: Self = StObject.set(x, "experiencePoints", js.undefined)
    
    inline def setFormattedTotalSteps(value: String): Self = StObject.set(x, "formattedTotalSteps", value.asInstanceOf[js.Any])
    
    inline def setFormattedTotalStepsUndefined: Self = StObject.set(x, "formattedTotalSteps", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setIsRevealedIconUrlDefault(value: Boolean): Self = StObject.set(x, "isRevealedIconUrlDefault", value.asInstanceOf[js.Any])
    
    inline def setIsRevealedIconUrlDefaultUndefined: Self = StObject.set(x, "isRevealedIconUrlDefault", js.undefined)
    
    inline def setIsUnlockedIconUrlDefault(value: Boolean): Self = StObject.set(x, "isUnlockedIconUrlDefault", value.asInstanceOf[js.Any])
    
    inline def setIsUnlockedIconUrlDefaultUndefined: Self = StObject.set(x, "isUnlockedIconUrlDefault", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevealedIconUrl(value: String): Self = StObject.set(x, "revealedIconUrl", value.asInstanceOf[js.Any])
    
    inline def setRevealedIconUrlUndefined: Self = StObject.set(x, "revealedIconUrl", js.undefined)
    
    inline def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsUndefined: Self = StObject.set(x, "totalSteps", js.undefined)
    
    inline def setUnlockedIconUrl(value: String): Self = StObject.set(x, "unlockedIconUrl", value.asInstanceOf[js.Any])
    
    inline def setUnlockedIconUrlUndefined: Self = StObject.set(x, "unlockedIconUrl", js.undefined)
  }
}
