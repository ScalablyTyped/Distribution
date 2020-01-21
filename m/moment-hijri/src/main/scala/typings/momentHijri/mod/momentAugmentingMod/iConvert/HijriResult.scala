package typings.momentHijri.mod.momentAugmentingMod.iConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HijriResult extends js.Object {
  var hd: Double
  var hm: Double
  var hy: Double
}

object HijriResult {
  @scala.inline
  def apply(hd: Double, hm: Double, hy: Double): HijriResult = {
    val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any], hm = hm.asInstanceOf[js.Any], hy = hy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HijriResult]
  }
}

