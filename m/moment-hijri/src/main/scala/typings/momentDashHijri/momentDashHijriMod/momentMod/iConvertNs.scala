package typings.momentDashHijri.momentDashHijriMod.momentMod

import typings.momentDashHijri.momentDashHijriMod.momentMod.iConvertNs.GregorianResult
import typings.momentDashHijri.momentDashHijriMod.momentMod.iConvertNs.HijriResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-hijri/moment", "iConvert")
@js.native
object iConvertNs extends js.Object {
  trait GregorianResult extends js.Object {
    var gd: Double
    var gm: Double
    var gy: Double
  }
  
  trait HijriResult extends js.Object {
    var hd: Double
    var hm: Double
    var hy: Double
  }
  
  def toGregorian(hy: Double, hm: Double, hd: Double): GregorianResult = js.native
  def toHijri(gy: Double, gm: Double, gd: Double): HijriResult = js.native
}

