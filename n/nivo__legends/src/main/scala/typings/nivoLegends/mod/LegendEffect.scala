package typings.nivoLegends.mod

import typings.nivoLegends.PartialitemTextColorstrin
import typings.nivoLegends.nivoLegendsStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEffect extends js.Object {
  var on: hover
  var style: PartialitemTextColorstrin
}

object LegendEffect {
  @scala.inline
  def apply(on: hover, style: PartialitemTextColorstrin): LegendEffect = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LegendEffect]
  }
}

