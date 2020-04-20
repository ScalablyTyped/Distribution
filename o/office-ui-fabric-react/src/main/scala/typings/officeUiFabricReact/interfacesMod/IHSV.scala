package typings.officeUiFabricReact.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHSV extends js.Object {
  /** Hue, range 0-359. */
  var h: Double
  /** Saturation, range 0-100. */
  var s: Double
  /** Value, range 0-100. */
  var v: Double
}

object IHSV {
  @scala.inline
  def apply(h: Double, s: Double, v: Double): IHSV = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHSV]
  }
}

