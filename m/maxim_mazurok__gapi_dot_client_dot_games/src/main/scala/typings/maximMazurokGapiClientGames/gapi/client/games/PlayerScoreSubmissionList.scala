package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScoreSubmissionList extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScoreSubmissionList`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The score submissions. */
  var scores: js.UndefOr[js.Array[ScoreSubmission]] = js.native
}
object PlayerScoreSubmissionList {
  
  @scala.inline
  def apply(): PlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreSubmissionList]
  }
  
  @scala.inline
  implicit class PlayerScoreSubmissionListMutableBuilder[Self <: PlayerScoreSubmissionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setScores(value: js.Array[ScoreSubmission]): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
    
    @scala.inline
    def setScoresVarargs(value: ScoreSubmission*): Self = StObject.set(x, "scores", js.Array(value :_*))
  }
}
