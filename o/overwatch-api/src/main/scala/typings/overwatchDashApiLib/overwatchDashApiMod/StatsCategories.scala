package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsCategories extends js.Object {
  var assists: StatsByGameType[Stat]
  var average: StatsByGameType[Stat]
  var best: StatsByGameType[Stat]
  var combat: StatsByGameType[Stat]
  var game: StatsByGameType[Stat]
  var match_awards: StatsByGameType[Stat]
  var miscellaneous: StatsByGameType[Stat]
  var top_heroes: StatByGameType[QuickplayTopHeroData, CompetitiveTopHeroData]
}

object StatsCategories {
  @scala.inline
  def apply(
    assists: StatsByGameType[Stat],
    average: StatsByGameType[Stat],
    best: StatsByGameType[Stat],
    combat: StatsByGameType[Stat],
    game: StatsByGameType[Stat],
    match_awards: StatsByGameType[Stat],
    miscellaneous: StatsByGameType[Stat],
    top_heroes: StatByGameType[QuickplayTopHeroData, CompetitiveTopHeroData]
  ): StatsCategories = {
    val __obj = js.Dynamic.literal(assists = assists, average = average, best = best, combat = combat, game = game, match_awards = match_awards, miscellaneous = miscellaneous, top_heroes = top_heroes)
  
    __obj.asInstanceOf[StatsCategories]
  }
}

