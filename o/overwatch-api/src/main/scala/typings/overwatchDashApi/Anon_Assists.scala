package typings.overwatchDashApi

import typings.overwatchDashApi.overwatchDashApiMod.QuickplayCompetitiveStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assists extends js.Object {
  var assists: QuickplayCompetitiveStats
  var average: QuickplayCompetitiveStats
  var best: QuickplayCompetitiveStats
  var combat: QuickplayCompetitiveStats
  var game: QuickplayCompetitiveStats
  var match_awards: QuickplayCompetitiveStats
  var miscellaneous: QuickplayCompetitiveStats
  var top_heroes: Anon_CompetitiveQuickplayAnonEliminationsperlife
}

object Anon_Assists {
  @scala.inline
  def apply(
    assists: QuickplayCompetitiveStats,
    average: QuickplayCompetitiveStats,
    best: QuickplayCompetitiveStats,
    combat: QuickplayCompetitiveStats,
    game: QuickplayCompetitiveStats,
    match_awards: QuickplayCompetitiveStats,
    miscellaneous: QuickplayCompetitiveStats,
    top_heroes: Anon_CompetitiveQuickplayAnonEliminationsperlife
  ): Anon_Assists = {
    val __obj = js.Dynamic.literal(assists = assists, average = average, best = best, combat = combat, game = game, match_awards = match_awards, miscellaneous = miscellaneous, top_heroes = top_heroes)
  
    __obj.asInstanceOf[Anon_Assists]
  }
}

