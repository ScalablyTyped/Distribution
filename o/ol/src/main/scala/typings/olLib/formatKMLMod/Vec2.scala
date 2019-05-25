package typings
package olLib.formatKMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vec2 extends js.Object {
  var origin: olLib.styleIconOriginMod.IconOrigin
  var x: scala.Double
  var xunits: olLib.styleIconAnchorUnitsMod.IconAnchorUnits
  var y: scala.Double
  var yunits: olLib.styleIconAnchorUnitsMod.IconAnchorUnits
}

object Vec2 {
  @scala.inline
  def apply(
    origin: olLib.styleIconOriginMod.IconOrigin,
    x: scala.Double,
    xunits: olLib.styleIconAnchorUnitsMod.IconAnchorUnits,
    y: scala.Double,
    yunits: olLib.styleIconAnchorUnitsMod.IconAnchorUnits
  ): Vec2 = {
    val __obj = js.Dynamic.literal(origin = origin, x = x, xunits = xunits, y = y, yunits = yunits)
  
    __obj.asInstanceOf[Vec2]
  }
}

