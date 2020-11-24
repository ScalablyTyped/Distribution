package typings.overwatchApi.anon

import typings.overwatchApi.mod.HeroAccuracy
import typings.overwatchApi.mod.HeroElimsPerLife
import typings.overwatchApi.mod.HeroMultiKillBest
import typings.overwatchApi.mod.HeroObjectiveKillsAverage
import typings.overwatchApi.mod.HeroPlaytime
import typings.overwatchApi.mod.HeroWinRate
import typings.overwatchApi.mod.HeroWins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gameswon extends js.Object {
  
  var eliminations_per_life: js.Array[HeroElimsPerLife] = js.native
  
  var games_won: js.Array[HeroWins] = js.native
  
  var multikill_best: js.Array[HeroMultiKillBest] = js.native
  
  var objective_kills_average: js.Array[HeroObjectiveKillsAverage] = js.native
  
  var played: js.Array[HeroPlaytime] = js.native
  
  var weapon_accuracy: js.Array[HeroAccuracy] = js.native
  
  var win_rate: js.Array[HeroWinRate] = js.native
}
object Gameswon {
  
  @scala.inline
  def apply(
    eliminations_per_life: js.Array[HeroElimsPerLife],
    games_won: js.Array[HeroWins],
    multikill_best: js.Array[HeroMultiKillBest],
    objective_kills_average: js.Array[HeroObjectiveKillsAverage],
    played: js.Array[HeroPlaytime],
    weapon_accuracy: js.Array[HeroAccuracy],
    win_rate: js.Array[HeroWinRate]
  ): Gameswon = {
    val __obj = js.Dynamic.literal(eliminations_per_life = eliminations_per_life.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], multikill_best = multikill_best.asInstanceOf[js.Any], objective_kills_average = objective_kills_average.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], weapon_accuracy = weapon_accuracy.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gameswon]
  }
  
  @scala.inline
  implicit class GameswonOps[Self <: Gameswon] (val x: Self) extends AnyVal {
    
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
    def setEliminations_per_lifeVarargs(value: HeroElimsPerLife*): Self = this.set("eliminations_per_life", js.Array(value :_*))
    
    @scala.inline
    def setEliminations_per_life(value: js.Array[HeroElimsPerLife]): Self = this.set("eliminations_per_life", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGames_wonVarargs(value: HeroWins*): Self = this.set("games_won", js.Array(value :_*))
    
    @scala.inline
    def setGames_won(value: js.Array[HeroWins]): Self = this.set("games_won", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultikill_bestVarargs(value: HeroMultiKillBest*): Self = this.set("multikill_best", js.Array(value :_*))
    
    @scala.inline
    def setMultikill_best(value: js.Array[HeroMultiKillBest]): Self = this.set("multikill_best", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjective_kills_averageVarargs(value: HeroObjectiveKillsAverage*): Self = this.set("objective_kills_average", js.Array(value :_*))
    
    @scala.inline
    def setObjective_kills_average(value: js.Array[HeroObjectiveKillsAverage]): Self = this.set("objective_kills_average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayedVarargs(value: HeroPlaytime*): Self = this.set("played", js.Array(value :_*))
    
    @scala.inline
    def setPlayed(value: js.Array[HeroPlaytime]): Self = this.set("played", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeapon_accuracyVarargs(value: HeroAccuracy*): Self = this.set("weapon_accuracy", js.Array(value :_*))
    
    @scala.inline
    def setWeapon_accuracy(value: js.Array[HeroAccuracy]): Self = this.set("weapon_accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin_rateVarargs(value: HeroWinRate*): Self = this.set("win_rate", js.Array(value :_*))
    
    @scala.inline
    def setWin_rate(value: js.Array[HeroWinRate]): Self = this.set("win_rate", value.asInstanceOf[js.Any])
  }
}
