package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickplayTopHeroData extends js.Object {
  var games_won: js.Array[HeroGamesWon]
  var played: js.Array[HeroTimePlayed]
}

object QuickplayTopHeroData {
  @scala.inline
  def apply(games_won: js.Array[HeroGamesWon], played: js.Array[HeroTimePlayed]): QuickplayTopHeroData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("games_won")(games_won)
    __obj.updateDynamic("played")(played)
    __obj.asInstanceOf[QuickplayTopHeroData]
  }
}

