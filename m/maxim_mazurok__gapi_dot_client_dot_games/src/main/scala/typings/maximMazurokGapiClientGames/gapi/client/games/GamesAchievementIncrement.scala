package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamesAchievementIncrement extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#GamesAchievementIncrement`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The requestId associated with an increment to an achievement. */
  var requestId: js.UndefOr[String] = js.native
  
  /** The number of steps to be incremented. */
  var steps: js.UndefOr[Double] = js.native
}
object GamesAchievementIncrement {
  
  @scala.inline
  def apply(): GamesAchievementIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesAchievementIncrement]
  }
  
  @scala.inline
  implicit class GamesAchievementIncrementMutableBuilder[Self <: GamesAchievementIncrement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
