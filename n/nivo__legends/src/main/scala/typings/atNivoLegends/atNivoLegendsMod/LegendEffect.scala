package typings.atNivoLegends.atNivoLegendsMod

import typings.atNivoLegends.Anon_ItemBackground
import typings.atNivoLegends.atNivoLegendsStrings.hover
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEffect extends js.Object {
  var on: hover
  var style: Partial[Anon_ItemBackground]
}

object LegendEffect {
  @scala.inline
  def apply(on: hover, style: Partial[Anon_ItemBackground]): LegendEffect = {
    val __obj = js.Dynamic.literal(on = on, style = style)
  
    __obj.asInstanceOf[LegendEffect]
  }
}

