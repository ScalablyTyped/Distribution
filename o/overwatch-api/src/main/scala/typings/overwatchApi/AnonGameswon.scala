package typings.overwatchApi

import typings.overwatchApi.mod.HeroAccuracy
import typings.overwatchApi.mod.HeroElimsPerLife
import typings.overwatchApi.mod.HeroMultiKillBest
import typings.overwatchApi.mod.HeroObjectiveKillsAverage
import typings.overwatchApi.mod.HeroPlaytime
import typings.overwatchApi.mod.HeroWinRate
import typings.overwatchApi.mod.HeroWins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGameswon extends js.Object {
  var eliminations_per_life: js.Array[HeroElimsPerLife]
  var games_won: js.Array[HeroWins]
  var multikill_best: js.Array[HeroMultiKillBest]
  var objective_kills_average: js.Array[HeroObjectiveKillsAverage]
  var played: js.Array[HeroPlaytime]
  var weapon_accuracy: js.Array[HeroAccuracy]
  var win_rate: js.Array[HeroWinRate]
}

object AnonGameswon {
  @scala.inline
  def apply(
    eliminations_per_life: js.Array[HeroElimsPerLife],
    games_won: js.Array[HeroWins],
    multikill_best: js.Array[HeroMultiKillBest],
    objective_kills_average: js.Array[HeroObjectiveKillsAverage],
    played: js.Array[HeroPlaytime],
    weapon_accuracy: js.Array[HeroAccuracy],
    win_rate: js.Array[HeroWinRate]
  ): AnonGameswon = {
    val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGameswon]
  }
}

