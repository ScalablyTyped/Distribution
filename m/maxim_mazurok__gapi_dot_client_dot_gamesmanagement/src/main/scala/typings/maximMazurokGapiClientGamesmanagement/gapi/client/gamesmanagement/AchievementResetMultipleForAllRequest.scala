package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementResetMultipleForAllRequest extends StObject {
  
  /** The IDs of achievements to reset. */
  var achievement_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#achievementResetMultipleForAllRequest`. */
  var kind: js.UndefOr[String] = js.undefined
}
object AchievementResetMultipleForAllRequest {
  
  @scala.inline
  def apply(): AchievementResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementResetMultipleForAllRequest]
  }
  
  @scala.inline
  implicit class AchievementResetMultipleForAllRequestMutableBuilder[Self <: AchievementResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievement_ids(value: js.Array[String]): Self = StObject.set(x, "achievement_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievement_idsUndefined: Self = StObject.set(x, "achievement_ids", js.undefined)
    
    @scala.inline
    def setAchievement_idsVarargs(value: String*): Self = StObject.set(x, "achievement_ids", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
