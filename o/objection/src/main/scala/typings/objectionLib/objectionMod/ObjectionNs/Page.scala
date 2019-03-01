package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page[QM] extends js.Object {
  var results: js.Array[QM]
  var total: scala.Double
}

object Page {
  @scala.inline
  def apply[QM](results: js.Array[QM], total: scala.Double): Page[QM] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Page[QM]]
  }
}

