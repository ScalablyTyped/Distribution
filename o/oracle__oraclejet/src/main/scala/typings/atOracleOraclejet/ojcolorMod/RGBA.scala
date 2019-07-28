package typings.atOracleOraclejet.ojcolorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RGBA extends js.Object {
  var a: js.UndefOr[Double] = js.undefined
  var b: Double
  var g: Double
  var r: Double
}

object RGBA {
  @scala.inline
  def apply(b: Double, g: Double, r: Double, a: Int | Double = null): RGBA = {
    val __obj = js.Dynamic.literal(b = b, g = g, r = r)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

