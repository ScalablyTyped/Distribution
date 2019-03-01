package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var font: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Font]
  var pad: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Padding]
  var text: java.lang.String
  var x: scala.Double
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var xref: plotlyDotJsLib.plotlyDotJsLibStrings.container | plotlyDotJsLib.plotlyDotJsLibStrings.paper
  var y: scala.Double
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var yref: plotlyDotJsLib.plotlyDotJsLibStrings.container | plotlyDotJsLib.plotlyDotJsLibStrings.paper
}

object Anon_Auto {
  @scala.inline
  def apply(
    font: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Font],
    pad: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Padding],
    text: java.lang.String,
    x: scala.Double,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    xref: plotlyDotJsLib.plotlyDotJsLibStrings.container | plotlyDotJsLib.plotlyDotJsLibStrings.paper,
    y: scala.Double,
    yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom,
    yref: plotlyDotJsLib.plotlyDotJsLibStrings.container | plotlyDotJsLib.plotlyDotJsLibStrings.paper
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("pad")(pad)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

