package typings.officeUiFabricReact.colorPickerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/utilities/color/interfaces.IColor, 'r' | 'g' | 'b' | 'a' | 'hex'> */
trait IRGBHex extends js.Object {
  var a: js.UndefOr[Double] = js.undefined
  var b: Double
  var g: Double
  var hex: String
  var r: Double
}

object IRGBHex {
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double, a: Int | Double = null): IRGBHex = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRGBHex]
  }
}

