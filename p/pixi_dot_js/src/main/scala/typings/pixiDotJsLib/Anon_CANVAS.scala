package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CANVAS extends js.Object {
  var CANVAS: scala.Double
  var UNKNOWN: scala.Double
  var WEBGL: scala.Double
}

object Anon_CANVAS {
  @scala.inline
  def apply(CANVAS: scala.Double, UNKNOWN: scala.Double, WEBGL: scala.Double): Anon_CANVAS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CANVAS")(CANVAS)
    __obj.updateDynamic("UNKNOWN")(UNKNOWN)
    __obj.updateDynamic("WEBGL")(WEBGL)
    __obj.asInstanceOf[Anon_CANVAS]
  }
}

