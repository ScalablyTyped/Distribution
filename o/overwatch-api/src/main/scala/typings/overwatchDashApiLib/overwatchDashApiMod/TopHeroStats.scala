package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopHeroStats extends js.Object {
  var hero: OverwatchHero
  var img: java.lang.String
}

object TopHeroStats {
  @scala.inline
  def apply(hero: OverwatchHero, img: java.lang.String): TopHeroStats = {
    val __obj = js.Dynamic.literal(hero = hero, img = img)
  
    __obj.asInstanceOf[TopHeroStats]
  }
}

