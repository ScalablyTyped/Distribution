package typings.overwatchApi

import typings.overwatchApi.mod.QuickplayCompetitiveStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssists extends js.Object {
  var assists: QuickplayCompetitiveStats
  var average: QuickplayCompetitiveStats
  var best: QuickplayCompetitiveStats
  var combat: QuickplayCompetitiveStats
  var game: QuickplayCompetitiveStats
  var match_awards: QuickplayCompetitiveStats
  var miscellaneous: QuickplayCompetitiveStats
  var top_heroes: AnonCompetitiveQuickplay
}

object AnonAssists {
  @scala.inline
  def apply(
    assists: QuickplayCompetitiveStats,
    average: QuickplayCompetitiveStats,
    best: QuickplayCompetitiveStats,
    combat: QuickplayCompetitiveStats,
    game: QuickplayCompetitiveStats,
    match_awards: QuickplayCompetitiveStats,
    miscellaneous: QuickplayCompetitiveStats,
    top_heroes: AnonCompetitiveQuickplay
  ): AnonAssists = {
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], average = average.asInstanceOf[js.Any], best = best.asInstanceOf[js.Any], combat = combat.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], match_awards = match_awards.asInstanceOf[js.Any], miscellaneous = miscellaneous.asInstanceOf[js.Any], top_heroes = top_heroes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssists]
  }
}

