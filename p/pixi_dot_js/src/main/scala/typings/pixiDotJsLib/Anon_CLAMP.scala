package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CLAMP extends js.Object {
  var CLAMP: scala.Double
  var MIRRORED_REPEAT: scala.Double
  var REPEAT: scala.Double
}

object Anon_CLAMP {
  @scala.inline
  def apply(CLAMP: scala.Double, MIRRORED_REPEAT: scala.Double, REPEAT: scala.Double): Anon_CLAMP = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CLAMP")(CLAMP)
    __obj.updateDynamic("MIRRORED_REPEAT")(MIRRORED_REPEAT)
    __obj.updateDynamic("REPEAT")(REPEAT)
    __obj.asInstanceOf[Anon_CLAMP]
  }
}

