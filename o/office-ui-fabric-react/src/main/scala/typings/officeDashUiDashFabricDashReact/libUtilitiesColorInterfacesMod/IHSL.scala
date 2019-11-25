package typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHSL extends js.Object {
  /** Hue, range 0-359. */
  var h: Double
  /** Lightness, range 0-100. */
  var l: Double
  /** Saturation, range 0-100. */
  var s: Double
}

object IHSL {
  @scala.inline
  def apply(h: Double, l: Double, s: Double): IHSL = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHSL]
  }
}

