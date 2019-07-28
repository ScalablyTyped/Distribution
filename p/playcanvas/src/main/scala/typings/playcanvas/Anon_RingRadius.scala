package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RingRadius extends js.Object {
  var ringRadius: Double
  var segments: Double
  var sides: Double
  var tubeRadius: Double
}

object Anon_RingRadius {
  @scala.inline
  def apply(ringRadius: Double, segments: Double, sides: Double, tubeRadius: Double): Anon_RingRadius = {
    val __obj = js.Dynamic.literal(ringRadius = ringRadius, segments = segments, sides = sides, tubeRadius = tubeRadius)
  
    __obj.asInstanceOf[Anon_RingRadius]
  }
}

