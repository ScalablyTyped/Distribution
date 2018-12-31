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

