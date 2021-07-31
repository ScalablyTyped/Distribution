package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerScoreResetAllResponse extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#playerScoreResetAllResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The leaderboard reset results. */
  var results: js.UndefOr[js.Array[PlayerScoreResetResponse]] = js.undefined
}
object PlayerScoreResetAllResponse {
  
  @scala.inline
  def apply(): PlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreResetAllResponse]
  }
  
  @scala.inline
  implicit class PlayerScoreResetAllResponseMutableBuilder[Self <: PlayerScoreResetAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[PlayerScoreResetResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: PlayerScoreResetResponse*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
