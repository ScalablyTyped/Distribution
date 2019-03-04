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
    val __obj = js.Dynamic.literal(games_won = games_won, hero = hero, img = img)
  
    __obj.asInstanceOf[HeroGamesWon]
  }
}

