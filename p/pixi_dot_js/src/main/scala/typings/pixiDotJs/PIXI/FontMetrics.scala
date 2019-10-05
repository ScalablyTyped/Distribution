package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontMetrics extends js.Object {
  var ascent: Double
  var descent: Double
  var fontSize: Double
}

object FontMetrics {
  @scala.inline
  def apply(ascent: Double, descent: Double, fontSize: Double): FontMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent, descent = descent, fontSize = fontSize)
  
    __obj.asInstanceOf[FontMetrics]
  }
}

