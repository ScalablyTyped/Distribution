package typings
package mojiLib.mojiMod.mojiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MojisyuRange extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object MojisyuRange {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): MojisyuRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[MojisyuRange]
  }
}

