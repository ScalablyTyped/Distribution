package typings
package pixiDashSpineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  def fround(n: scala.Double): scala.Double
}

object Math {
  @scala.inline
  def apply(fround: js.Function1[scala.Double, scala.Double]): Math = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fround")(fround)
    __obj.asInstanceOf[Math]
  }
}

