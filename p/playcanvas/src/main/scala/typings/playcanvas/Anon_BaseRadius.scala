package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseRadius extends js.Object {
  var baseRadius: Double
  var capSegments: Double
  var height: Double
  var heightSegments: Double
  var peakRadius: Double
}

object Anon_BaseRadius {
  @scala.inline
  def apply(
    baseRadius: Double,
    capSegments: Double,
    height: Double,
    heightSegments: Double,
    peakRadius: Double
  ): Anon_BaseRadius = {
    val __obj = js.Dynamic.literal(baseRadius = baseRadius, capSegments = capSegments, height = height, heightSegments = heightSegments, peakRadius = peakRadius)
  
    __obj.asInstanceOf[Anon_BaseRadius]
  }
}

