package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hero extends js.Object {
  var assists: js.UndefOr[Statistic] = js.undefined
  var average: js.UndefOr[Statistic] = js.undefined
  var awards: js.UndefOr[Statistic] = js.undefined
  var best: js.UndefOr[Statistic] = js.undefined
  var combat: js.UndefOr[Statistic] = js.undefined
  var game: js.UndefOr[Game] = js.undefined
  var hero: js.UndefOr[Statistic] = js.undefined
  var misc: js.UndefOr[Statistic] = js.undefined
  var name: String
  var rawName: String
}

object Hero {
  @scala.inline
  def apply(
    name: String,
    rawName: String,
    assists: Statistic = null,
    average: Statistic = null,
    awards: Statistic = null,
    best: Statistic = null,
    combat: Statistic = null,
    game: Game = null,
    hero: Statistic = null,
    misc: Statistic = null
  ): Hero = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any])
    if (assists != null) __obj.updateDynamic("assists")(assists.asInstanceOf[js.Any])
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (awards != null) __obj.updateDynamic("awards")(awards.asInstanceOf[js.Any])
    if (best != null) __obj.updateDynamic("best")(best.asInstanceOf[js.Any])
    if (combat != null) __obj.updateDynamic("combat")(combat.asInstanceOf[js.Any])
    if (game != null) __obj.updateDynamic("game")(game.asInstanceOf[js.Any])
    if (hero != null) __obj.updateDynamic("hero")(hero.asInstanceOf[js.Any])
    if (misc != null) __obj.updateDynamic("misc")(misc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hero]
  }
}

