package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroWins extends Hero {
  var games_won: String
}

object HeroWins {
  @scala.inline
  def apply(games_won: String, hero: String, img: String): HeroWins = {
    val __obj = js.Dynamic.literal(games_won = games_won.asInstanceOf[js.Any], hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeroWins]
  }
}

