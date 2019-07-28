package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.auto
import typings.plotlyDotJs.plotlyDotJsStrings.bottom
import typings.plotlyDotJs.plotlyDotJsStrings.center
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.middle
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.plotlyDotJs.plotlyDotJsStrings.top
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelector extends Label {
  var activecolor: String
  var borderwidth: Double
  var buttons: js.Array[Partial[RangeSelectorButton]]
  var visible: Boolean
  var x: Double
  var xanchor: auto | left | center | right
  var y: Double
  var yanchor: auto | top | middle | bottom
}

object RangeSelector {
  @scala.inline
  def apply(
    activecolor: String,
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    buttons: js.Array[Partial[RangeSelectorButton]],
    font: Partial[Font],
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): RangeSelector = {
    val __obj = js.Dynamic.literal(activecolor = activecolor, bgcolor = bgcolor, bordercolor = bordercolor, borderwidth = borderwidth, buttons = buttons, font = font, visible = visible, x = x, xanchor = xanchor.asInstanceOf[js.Any], y = y, yanchor = yanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelector]
  }
}

