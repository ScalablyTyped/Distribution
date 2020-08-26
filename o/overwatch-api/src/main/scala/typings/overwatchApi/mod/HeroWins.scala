package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeroWins extends Hero {
  var games_won: String = js.native
}

object HeroWins {
  @scala.inline
  def apply(games_won: String, hero: String, img: String): HeroWins = {
    val __obj = js.Dynamic.literal(games_won = games_won.asInstanceOf[js.Any], hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroWins]
  }
  @scala.inline
  implicit class HeroWinsOps[Self <: HeroWins] (val x: Self) extends AnyVal {
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
    def setGames_won(value: String): Self = this.set("games_won", value.asInstanceOf[js.Any])
  }
  
}

