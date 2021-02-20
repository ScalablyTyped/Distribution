package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementResetAllResponse extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#achievementResetAllResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The achievement reset results. */
  var results: js.UndefOr[js.Array[AchievementResetResponse]] = js.native
}
object AchievementResetAllResponse {
  
  @scala.inline
  def apply(): AchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementResetAllResponse]
  }
  
  @scala.inline
  implicit class AchievementResetAllResponseMutableBuilder[Self <: AchievementResetAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[AchievementResetResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: AchievementResetResponse*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
