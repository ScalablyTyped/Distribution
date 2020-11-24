package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScoreSubmissionList extends js.Object {
  
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
  implicit class PlayerScoreSubmissionListOps[Self <: PlayerScoreSubmissionList] (val x: Self) extends AnyVal {
    
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
    def setScoresVarargs(value: ScoreSubmission*): Self = this.set("scores", js.Array(value :_*))
    
    @scala.inline
    def setScores(value: js.Array[ScoreSubmission]): Self = this.set("scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScores: Self = this.set("scores", js.undefined)
  }
}
