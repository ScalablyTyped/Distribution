package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScore extends js.Object {
  
  /** The formatted score for this player score. */
  var formattedScore: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScore`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The numerical value for this player score. */
  var score: js.UndefOr[String] = js.native
  
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  
  /** The time span for this player score. */
  var timeSpan: js.UndefOr[String] = js.native
}
object PlayerScore {
  
  @scala.inline
  def apply(): PlayerScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScore]
  }
  
  @scala.inline
  implicit class PlayerScoreOps[Self <: PlayerScore] (val x: Self) extends AnyVal {
    
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
    def setFormattedScore(value: String): Self = this.set("formattedScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedScore: Self = this.set("formattedScore", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setScore(value: String): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setScoreTag(value: String): Self = this.set("scoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreTag: Self = this.set("scoreTag", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: String): Self = this.set("timeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSpan: Self = this.set("timeSpan", js.undefined)
  }
}
