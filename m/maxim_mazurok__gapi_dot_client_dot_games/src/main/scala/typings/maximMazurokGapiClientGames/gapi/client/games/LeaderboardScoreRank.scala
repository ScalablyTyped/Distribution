package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaderboardScoreRank extends js.Object {
  
  /** The number of scores in the leaderboard as a string. */
  var formattedNumScores: js.UndefOr[String] = js.native
  
  /** The rank in the leaderboard as a string. */
  var formattedRank: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#leaderboardScoreRank`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The number of scores in the leaderboard. */
  var numScores: js.UndefOr[String] = js.native
  
  /** The rank in the leaderboard. */
  var rank: js.UndefOr[String] = js.native
}
object LeaderboardScoreRank {
  
  @scala.inline
  def apply(): LeaderboardScoreRank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardScoreRank]
  }
  
  @scala.inline
  implicit class LeaderboardScoreRankOps[Self <: LeaderboardScoreRank] (val x: Self) extends AnyVal {
    
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
    def setFormattedNumScores(value: String): Self = this.set("formattedNumScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedNumScores: Self = this.set("formattedNumScores", js.undefined)
    
    @scala.inline
    def setFormattedRank(value: String): Self = this.set("formattedRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedRank: Self = this.set("formattedRank", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNumScores(value: String): Self = this.set("numScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumScores: Self = this.set("numScores", js.undefined)
    
    @scala.inline
    def setRank(value: String): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
}
