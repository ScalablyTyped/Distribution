package typings
package atNivoLegendsLib.atNivoLegendsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEffect extends js.Object {
  var on: atNivoLegendsLib.atNivoLegendsLibStrings.hover
  var style: stdLib.Partial[atNivoLegendsLib.Anon_ItemBackground]
}

object LegendEffect {
  @scala.inline
  def apply(
    on: atNivoLegendsLib.atNivoLegendsLibStrings.hover,
    style: stdLib.Partial[atNivoLegendsLib.Anon_ItemBackground]
  ): LegendEffect = {
    val __obj = js.Dynamic.literal(on = on, style = style)
  
    __obj.asInstanceOf[LegendEffect]
  }
}

