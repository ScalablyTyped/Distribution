package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementResetAllResponse extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#achievementResetAllResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The achievement reset results. */
  var results: js.UndefOr[js.Array[AchievementResetResponse]] = js.undefined
}
object AchievementResetAllResponse {
  
  inline def apply(): AchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementResetAllResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AchievementResetAllResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResults(value: js.Array[AchievementResetResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: AchievementResetResponse*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
