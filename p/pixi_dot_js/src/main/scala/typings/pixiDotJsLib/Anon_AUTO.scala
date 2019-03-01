package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUTO extends js.Object {
  var AUTO: scala.Double
  var MANUAL: scala.Double
}

object Anon_AUTO {
  @scala.inline
  def apply(AUTO: scala.Double, MANUAL: scala.Double): Anon_AUTO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AUTO")(AUTO)
    __obj.updateDynamic("MANUAL")(MANUAL)
    __obj.asInstanceOf[Anon_AUTO]
  }
}

