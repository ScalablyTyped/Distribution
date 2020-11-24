package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScoreListResponse extends js.Object {
  
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
  implicit class PlayerScoreListResponseOps[Self <: PlayerScoreListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSubmittedScoresVarargs(value: PlayerScoreResponse*): Self = this.set("submittedScores", js.Array(value :_*))
    
    @scala.inline
    def setSubmittedScores(value: js.Array[PlayerScoreResponse]): Self = this.set("submittedScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedScores: Self = this.set("submittedScores", js.undefined)
  }
}
