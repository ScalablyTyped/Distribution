package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerScoreResetResponse extends StObject {
  
  /** The ID of an leaderboard for which player state has been updated. */
  var definitionId: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#playerScoreResetResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The time spans of the updated score. Possible values are: - "`ALL_TIME`" - The score is an all-time score. - "`WEEKLY`" - The score is a weekly score. - "`DAILY`" - The score is a
    * daily score.
    */
  var resetScoreTimeSpans: js.UndefOr[js.Array[String]] = js.undefined
}
object PlayerScoreResetResponse {
  
  inline def apply(): PlayerScoreResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreResetResponse]
  }
  
  extension [Self <: PlayerScoreResetResponse](x: Self) {
    
    inline def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResetScoreTimeSpans(value: js.Array[String]): Self = StObject.set(x, "resetScoreTimeSpans", value.asInstanceOf[js.Any])
    
    inline def setResetScoreTimeSpansUndefined: Self = StObject.set(x, "resetScoreTimeSpans", js.undefined)
    
    inline def setResetScoreTimeSpansVarargs(value: String*): Self = StObject.set(x, "resetScoreTimeSpans", js.Array(value :_*))
  }
}
