package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontMetrics extends js.Object {
  var ascent: scala.Double
  var descent: scala.Double
  var fontSize: scala.Double
}

object FontMetrics {
  @scala.inline
  def apply(ascent: scala.Double, descent: scala.Double, fontSize: scala.Double): FontMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ascent")(ascent)
    __obj.updateDynamic("descent")(descent)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.asInstanceOf[FontMetrics]
  }
}

