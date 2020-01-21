package typings.plotlyJs

import typings.plotlyJs.mod.Font
import typings.plotlyJs.mod.Padding
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.container
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuto extends js.Object {
  var font: Partial[Font]
  var pad: Partial[Padding]
  var text: String
  var x: Double
  var xanchor: auto | left | center | right
  var xref: container | paper
  var y: Double
  var yanchor: auto | top | middle | bottom
  var yref: container | paper
}

object AnonAuto {
  @scala.inline
  def apply(
    font: Partial[Font],
    pad: Partial[Padding],
    text: String,
    x: Double,
    xanchor: auto | left | center | right,
    xref: container | paper,
    y: Double,
    yanchor: auto | top | middle | bottom,
    yref: container | paper
  ): AnonAuto = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuto]
  }
}

