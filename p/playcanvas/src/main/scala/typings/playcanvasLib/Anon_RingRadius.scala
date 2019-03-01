package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RingRadius extends js.Object {
  var ringRadius: scala.Double
  var segments: scala.Double
  var sides: scala.Double
  var tubeRadius: scala.Double
}

object Anon_RingRadius {
  @scala.inline
  def apply(ringRadius: scala.Double, segments: scala.Double, sides: scala.Double, tubeRadius: scala.Double): Anon_RingRadius = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ringRadius")(ringRadius)
    __obj.updateDynamic("segments")(segments)
    __obj.updateDynamic("sides")(sides)
    __obj.updateDynamic("tubeRadius")(tubeRadius)
    __obj.asInstanceOf[Anon_RingRadius]
  }
}

