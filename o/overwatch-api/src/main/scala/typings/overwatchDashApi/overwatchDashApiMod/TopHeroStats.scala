package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopHeroStats extends js.Object {
  var hero: OverwatchHero
  var img: String
}

object TopHeroStats {
  @scala.inline
  def apply(hero: OverwatchHero, img: String): TopHeroStats = {
    val __obj = js.Dynamic.literal(hero = hero, img = img)
  
    __obj.asInstanceOf[TopHeroStats]
  }
}

