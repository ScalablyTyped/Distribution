package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementUpdateMultipleResponse extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateMultipleResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The updated state of the achievements. */
  var updatedAchievements: js.UndefOr[js.Array[AchievementUpdateResponse]] = js.undefined
}
object AchievementUpdateMultipleResponse {
  
  inline def apply(): AchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateMultipleResponse]
  }
  
  extension [Self <: AchievementUpdateMultipleResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdatedAchievements(value: js.Array[AchievementUpdateResponse]): Self = StObject.set(x, "updatedAchievements", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAchievementsUndefined: Self = StObject.set(x, "updatedAchievements", js.undefined)
    
    inline def setUpdatedAchievementsVarargs(value: AchievementUpdateResponse*): Self = StObject.set(x, "updatedAchievements", js.Array(value*))
  }
}
