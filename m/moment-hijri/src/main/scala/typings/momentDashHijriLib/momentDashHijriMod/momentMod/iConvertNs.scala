package typings
package momentDashHijriLib.momentDashHijriMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-hijri/moment", "iConvert")
@js.native
object iConvertNs extends js.Object {
  trait GregorianResult extends js.Object {
    var gd: scala.Double
    var gm: scala.Double
    var gy: scala.Double
  }
  
  trait HijriResult extends js.Object {
    var hd: scala.Double
    var hm: scala.Double
    var hy: scala.Double
  }
  
  def toGregorian(hy: scala.Double, hm: scala.Double, hd: scala.Double): GregorianResult = js.native
  def toHijri(gy: scala.Double, gm: scala.Double, gd: scala.Double): HijriResult = js.native
}

