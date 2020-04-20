package typings.momentHijri.mod.momentAugmentingMod.iConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GregorianResult extends js.Object {
  var gd: Double
  var gm: Double
  var gy: Double
}

object GregorianResult {
  @scala.inline
  def apply(gd: Double, gm: Double, gy: Double): GregorianResult = {
    val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GregorianResult]
  }
}

