package typings.ol.formatKMLMod

import typings.ol.styleIconAnchorUnitsMod.IconAnchorUnits
import typings.ol.styleIconOriginMod.IconOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vec2 extends js.Object {
  var origin: IconOrigin
  var x: Double
  var xunits: IconAnchorUnits
  var y: Double
  var yunits: IconAnchorUnits
}

object Vec2 {
  @scala.inline
  def apply(origin: IconOrigin, x: Double, xunits: IconAnchorUnits, y: Double, yunits: IconAnchorUnits): Vec2 = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xunits = xunits.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yunits = yunits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Vec2]
  }
}

