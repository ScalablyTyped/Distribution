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
    val __obj = js.Dynamic.literal(color = color, dash = dash, width = width)
  
    __obj.asInstanceOf[ShapeLine]
  }
}

