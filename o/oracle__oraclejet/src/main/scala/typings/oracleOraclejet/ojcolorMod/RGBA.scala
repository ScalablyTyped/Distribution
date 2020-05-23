package typings.oracleOraclejet.ojcolorMod

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
  def apply(b: Double, g: Double, r: Double, a: js.UndefOr[Double] = js.undefined): RGBA = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

