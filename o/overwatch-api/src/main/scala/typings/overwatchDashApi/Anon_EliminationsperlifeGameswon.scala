package typings.overwatchDashApi

import typings.overwatchDashApi.overwatchDashApiMod.HeroAccuracy
import typings.overwatchDashApi.overwatchDashApiMod.HeroElimsPerLife
import typings.overwatchDashApi.overwatchDashApiMod.HeroMultiKillBest
import typings.overwatchDashApi.overwatchDashApiMod.HeroObjectiveKillsAverage
import typings.overwatchDashApi.overwatchDashApiMod.HeroPlaytime
import typings.overwatchDashApi.overwatchDashApiMod.HeroWinRate
import typings.overwatchDashApi.overwatchDashApiMod.HeroWins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EliminationsperlifeGameswon extends js.Object {
  var eliminations_per_life: js.Array[HeroElimsPerLife]
  var games_won: js.Array[HeroWins]
  var multikill_best: js.Array[HeroMultiKillBest]
  var objective_kills_average: js.Array[HeroObjectiveKillsAverage]
  var played: js.Array[HeroPlaytime]
  var weapon_accuracy: js.Array[HeroAccuracy]
  var win_rate: js.Array[HeroWinRate]
}

object Anon_EliminationsperlifeGameswon {
  @scala.inline
  def apply(
    eliminations_per_life: js.Array[HeroElimsPerLife],
    games_won: js.Array[HeroWins],
    multikill_best: js.Array[HeroMultiKillBest],
    objective_kills_average: js.Array[HeroObjectiveKillsAverage],
    played: js.Array[HeroPlaytime],
    weapon_accuracy: js.Array[HeroAccuracy],
    win_rate: js.Array[HeroWinRate]
  ): Anon_EliminationsperlifeGameswon = {
    val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life, games_won = games_won, multikill_best = multikill_best, objective_kills_average = objective_kills_average, played = played, weapon_accuracy = weapon_accuracy, win_rate = win_rate)
  
    __obj.asInstanceOf[Anon_EliminationsperlifeGameswon]
  }
}

