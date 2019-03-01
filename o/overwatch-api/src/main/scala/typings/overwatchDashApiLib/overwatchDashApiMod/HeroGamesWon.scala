package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroGamesWon extends TopHeroStats {
  var games_won: java.lang.String
}

object HeroGamesWon {
  @scala.inline
  def apply(games_won: java.lang.String, hero: OverwatchHero, img: java.lang.String): HeroGamesWon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("games_won")(games_won)
    __obj.updateDynamic("hero")(hero)
    __obj.updateDynamic("img")(img)
    __obj.asInstanceOf[HeroGamesWon]
  }
}

