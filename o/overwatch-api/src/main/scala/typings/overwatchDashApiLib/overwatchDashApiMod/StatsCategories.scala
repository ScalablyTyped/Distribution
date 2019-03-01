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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assists")(assists)
    __obj.updateDynamic("average")(average)
    __obj.updateDynamic("best")(best)
    __obj.updateDynamic("combat")(combat)
    __obj.updateDynamic("game")(game)
    __obj.updateDynamic("match_awards")(match_awards)
    __obj.updateDynamic("miscellaneous")(miscellaneous)
    __obj.updateDynamic("top_heroes")(top_heroes)
    __obj.asInstanceOf[StatsCategories]
  }
}

