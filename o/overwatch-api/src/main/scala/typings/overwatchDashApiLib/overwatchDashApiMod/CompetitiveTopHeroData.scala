package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompetitiveTopHeroData extends QuickplayTopHeroData {
  var win_rate: js.Array[HeroWinRate]
}

object CompetitiveTopHeroData {
  @scala.inline
  def apply(
    games_won: js.Array[HeroGamesWon],
    played: js.Array[HeroTimePlayed],
    win_rate: js.Array[HeroWinRate]
  ): CompetitiveTopHeroData = {
    val __obj = js.Dynamic.literal(games_won = games_won, played = played, win_rate = win_rate)
  
    __obj.asInstanceOf[CompetitiveTopHeroData]
  }
}

