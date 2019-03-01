package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LINELOOP extends js.Object {
  var LINES: scala.Double
  var LINE_LOOP: scala.Double
  var LINE_STRIP: scala.Double
  var POINTS: scala.Double
  var TRIANGLES: scala.Double
  var TRIANGLE_FAN: scala.Double
  var TRIANGLE_STRIP: scala.Double
}

object Anon_LINELOOP {
  @scala.inline
  def apply(
    LINES: scala.Double,
    LINE_LOOP: scala.Double,
    LINE_STRIP: scala.Double,
    POINTS: scala.Double,
    TRIANGLES: scala.Double,
    TRIANGLE_FAN: scala.Double,
    TRIANGLE_STRIP: scala.Double
  ): Anon_LINELOOP = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LINES")(LINES)
    __obj.updateDynamic("LINE_LOOP")(LINE_LOOP)
    __obj.updateDynamic("LINE_STRIP")(LINE_STRIP)
    __obj.updateDynamic("POINTS")(POINTS)
    __obj.updateDynamic("TRIANGLES")(TRIANGLES)
    __obj.updateDynamic("TRIANGLE_FAN")(TRIANGLE_FAN)
    __obj.updateDynamic("TRIANGLE_STRIP")(TRIANGLE_STRIP)
    __obj.asInstanceOf[Anon_LINELOOP]
  }
}

