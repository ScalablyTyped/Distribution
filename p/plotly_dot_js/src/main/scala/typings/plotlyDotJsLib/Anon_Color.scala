package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: plotlyDotJsLib.plotlyDotJsMod.Color
  var colorsrc: js.Any
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.radial | plotlyDotJsLib.plotlyDotJsLibStrings.horizontal | plotlyDotJsLib.plotlyDotJsLibStrings.vertical | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var typesrc: js.Any
}

object Anon_Color {
  @scala.inline
  def apply(
    color: plotlyDotJsLib.plotlyDotJsMod.Color,
    colorsrc: js.Any,
    `type`: plotlyDotJsLib.plotlyDotJsLibStrings.radial | plotlyDotJsLib.plotlyDotJsLibStrings.horizontal | plotlyDotJsLib.plotlyDotJsLibStrings.vertical | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    typesrc: js.Any
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorsrc = colorsrc, typesrc = typesrc)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

