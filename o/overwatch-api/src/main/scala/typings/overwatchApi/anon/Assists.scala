package typings.overwatchApi.anon

import typings.overwatchApi.mod.QuickplayCompetitiveStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assists extends js.Object {
  
  var assists: QuickplayCompetitiveStats = js.native
  
  var average: QuickplayCompetitiveStats = js.native
  
  var best: QuickplayCompetitiveStats = js.native
  
  var combat: QuickplayCompetitiveStats = js.native
  
  var game: QuickplayCompetitiveStats = js.native
  
  var match_awards: QuickplayCompetitiveStats = js.native
  
  var miscellaneous: QuickplayCompetitiveStats = js.native
  
  var top_heroes: CompetitiveQuickplay = js.native
}
object Assists {
  
  @scala.inline
  def apply(
    assists: QuickplayCompetitiveStats,
    average: QuickplayCompetitiveStats,
    best: QuickplayCompetitiveStats,
    combat: QuickplayCompetitiveStats,
    game: QuickplayCompetitiveStats,
    match_awards: QuickplayCompetitiveStats,
    miscellaneous: QuickplayCompetitiveStats,
    top_heroes: CompetitiveQuickplay
  ): Assists = {
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], average = average.asInstanceOf[js.Any], best = best.asInstanceOf[js.Any], combat = combat.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], match_awards = match_awards.asInstanceOf[js.Any], miscellaneous = miscellaneous.asInstanceOf[js.Any], top_heroes = top_heroes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assists]
  }
  
  @scala.inline
  implicit class AssistsOps[Self <: Assists] (val x: Self) extends AnyVal {
    
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
    def setAssists(value: QuickplayCompetitiveStats): Self = this.set("assists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverage(value: QuickplayCompetitiveStats): Self = this.set("average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBest(value: QuickplayCompetitiveStats): Self = this.set("best", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombat(value: QuickplayCompetitiveStats): Self = this.set("combat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGame(value: QuickplayCompetitiveStats): Self = this.set("game", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch_awards(value: QuickplayCompetitiveStats): Self = this.set("match_awards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiscellaneous(value: QuickplayCompetitiveStats): Self = this.set("miscellaneous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_heroes(value: CompetitiveQuickplay): Self = this.set("top_heroes", value.asInstanceOf[js.Any])
  }
}
