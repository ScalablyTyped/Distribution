package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLine extends js.Object {
  var color: java.lang.String
  var dash: Dash
  var width: scala.Double
}

object ShapeLine {
  @scala.inline
  def apply(color: java.lang.String, dash: Dash, width: scala.Double): ShapeLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("dash")(dash)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ShapeLine]
  }
}

