package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerAchievementListResponse extends StObject {
  
  /** The achievements. */
  var items: js.UndefOr[js.Array[PlayerAchievement]] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerAchievementListResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object PlayerAchievementListResponse {
  
  @scala.inline
  def apply(): PlayerAchievementListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerAchievementListResponse]
  }
  
  @scala.inline
  implicit class PlayerAchievementListResponseMutableBuilder[Self <: PlayerAchievementListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PlayerAchievement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PlayerAchievement*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
