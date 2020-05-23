package typings.officeUiFabricReact.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRGB extends js.Object {
  /** Alpha, range 0 (transparent)-100. Usually assumed to be 100 if not specified. */
  var a: js.UndefOr[Double] = js.undefined
  /** Blue, range 0-255. */
  var b: Double
  /** Green, range 0-255. */
  var g: Double
  /** Red, range 0-255. */
  var r: Double
}

object IRGB {
  @scala.inline
  def apply(b: Double, g: Double, r: Double, a: js.UndefOr[Double] = js.undefined): IRGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRGB]
  }
}

