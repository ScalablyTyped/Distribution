package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerScoreSubmissionList extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScoreSubmissionList`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The score submissions. */
  var scores: js.UndefOr[js.Array[ScoreSubmission]] = js.undefined
}
object PlayerScoreSubmissionList {
  
  inline def apply(): PlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreSubmissionList]
  }
  
  extension [Self <: PlayerScoreSubmissionList](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setScores(value: js.Array[ScoreSubmission]): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    inline def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
    
    inline def setScoresVarargs(value: ScoreSubmission*): Self = StObject.set(x, "scores", js.Array(value :_*))
  }
}
