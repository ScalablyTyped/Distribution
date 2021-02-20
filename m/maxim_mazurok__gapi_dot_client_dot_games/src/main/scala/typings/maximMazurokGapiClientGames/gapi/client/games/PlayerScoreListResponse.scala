package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScoreListResponse extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScoreListResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The score submissions statuses. */
  var submittedScores: js.UndefOr[js.Array[PlayerScoreResponse]] = js.native
}
object PlayerScoreListResponse {
  
  @scala.inline
  def apply(): PlayerScoreListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreListResponse]
  }
  
  @scala.inline
  implicit class PlayerScoreListResponseMutableBuilder[Self <: PlayerScoreListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSubmittedScores(value: js.Array[PlayerScoreResponse]): Self = StObject.set(x, "submittedScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedScoresUndefined: Self = StObject.set(x, "submittedScores", js.undefined)
    
    @scala.inline
    def setSubmittedScoresVarargs(value: PlayerScoreResponse*): Self = StObject.set(x, "submittedScores", js.Array(value :_*))
  }
}
