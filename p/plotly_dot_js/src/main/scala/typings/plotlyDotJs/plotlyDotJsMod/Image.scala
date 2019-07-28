package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.above
import typings.plotlyDotJs.plotlyDotJsStrings.below
import typings.plotlyDotJs.plotlyDotJsStrings.bottom
import typings.plotlyDotJs.plotlyDotJsStrings.center
import typings.plotlyDotJs.plotlyDotJsStrings.contain
import typings.plotlyDotJs.plotlyDotJsStrings.fill
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.middle
import typings.plotlyDotJs.plotlyDotJsStrings.paper
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.plotlyDotJs.plotlyDotJsStrings.stretch
import typings.plotlyDotJs.plotlyDotJsStrings.top
import typings.plotlyDotJs.plotlyDotJsStrings.x
import typings.plotlyDotJs.plotlyDotJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var layer: above | below
  var opacity: Double
  var sizex: Double
  var sizey: Double
  var sizing: fill | contain | stretch
  var source: String
  var visible: Boolean
  var x: Double | String
  var xanchor: left | center | right
  var xref: paper | x
  var y: Double | String
  var yanchor: top | middle | bottom
  var yref: paper | y
}

object Image {
  @scala.inline
  def apply(
    layer: above | below,
    opacity: Double,
    sizex: Double,
    sizey: Double,
    sizing: fill | contain | stretch,
    source: String,
    visible: Boolean,
    x: Double | String,
    xanchor: left | center | right,
    xref: paper | x,
    y: Double | String,
    yanchor: top | middle | bottom,
    yref: paper | y
  ): Image = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], opacity = opacity, sizex = sizex, sizey = sizey, sizing = sizing.asInstanceOf[js.Any], source = source, visible = visible, x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Image]
  }
}

