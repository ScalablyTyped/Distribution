package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementUpdateMultipleRequest extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateMultipleRequest`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The individual achievement update requests. */
  var updates: js.UndefOr[js.Array[AchievementUpdateRequest]] = js.native
}
object AchievementUpdateMultipleRequest {
  
  @scala.inline
  def apply(): AchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateMultipleRequest]
  }
  
  @scala.inline
  implicit class AchievementUpdateMultipleRequestMutableBuilder[Self <: AchievementUpdateMultipleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdates(value: js.Array[AchievementUpdateRequest]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: AchievementUpdateRequest*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
