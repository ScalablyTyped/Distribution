package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nature extends js.Object {
  var decreased_stat: String | Null
  var disliked_flavor: String | Null
  var favorite_flavor: String | Null
  var increased_stat: String | Null
  var names: Translations
}

object Nature {
  @scala.inline
  def apply(
    names: Translations,
    decreased_stat: String = null,
    disliked_flavor: String = null,
    favorite_flavor: String = null,
    increased_stat: String = null
  ): Nature = {
    val __obj = js.Dynamic.literal(names = names)
    if (decreased_stat != null) __obj.updateDynamic("decreased_stat")(decreased_stat)
    if (disliked_flavor != null) __obj.updateDynamic("disliked_flavor")(disliked_flavor)
    if (favorite_flavor != null) __obj.updateDynamic("favorite_flavor")(favorite_flavor)
    if (increased_stat != null) __obj.updateDynamic("increased_stat")(increased_stat)
    __obj.asInstanceOf[Nature]
  }
}

