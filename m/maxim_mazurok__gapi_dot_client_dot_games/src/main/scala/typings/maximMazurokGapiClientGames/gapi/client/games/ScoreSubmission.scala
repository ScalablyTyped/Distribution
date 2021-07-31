package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoreSubmission extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#scoreSubmission`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The leaderboard this score is being submitted to. */
  var leaderboardId: js.UndefOr[String] = js.undefined
  
  /** The new score being submitted. */
  var score: js.UndefOr[String] = js.undefined
  
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.undefined
  
  /** Signature Values will contain URI-safe characters as defined by section 2.3 of RFC 3986. */
  var signature: js.UndefOr[String] = js.undefined
}
object ScoreSubmission {
  
  @scala.inline
  def apply(): ScoreSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoreSubmission]
  }
  
  @scala.inline
  implicit class ScoreSubmissionMutableBuilder[Self <: ScoreSubmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
    
    @scala.inline
    def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
