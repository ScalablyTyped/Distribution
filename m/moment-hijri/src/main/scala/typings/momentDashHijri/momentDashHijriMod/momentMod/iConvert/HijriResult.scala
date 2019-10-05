package typings.momentDashHijri.momentDashHijriMod.momentMod.iConvert

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
    val __obj = js.Dynamic.literal(hd = hd, hm = hm, hy = hy)
  
    __obj.asInstanceOf[HijriResult]
  }
}

