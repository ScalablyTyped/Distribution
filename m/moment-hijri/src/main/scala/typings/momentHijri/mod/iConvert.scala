package typings.momentHijri.mod

import typings.momentHijri.mod.momentAugmentingMod.iConvert.GregorianResult
import typings.momentHijri.mod.momentAugmentingMod.iConvert.HijriResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-hijri", "iConvert")
@js.native
object iConvert extends js.Object {
  def toGregorian(hy: Double, hm: Double, hd: Double): GregorianResult = js.native
  def toHijri(gy: Double, gm: Double, gd: Double): HijriResult = js.native
}

