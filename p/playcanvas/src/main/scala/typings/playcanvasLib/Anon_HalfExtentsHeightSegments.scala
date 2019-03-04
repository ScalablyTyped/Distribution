package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HalfExtentsHeightSegments extends js.Object {
  var halfExtents: playcanvasLib.pcNs.Vec3
  var heightSegments: scala.Double
  var lengthSegments: scala.Double
  var widthSegments: scala.Double
}

object Anon_HalfExtentsHeightSegments {
  @scala.inline
  def apply(
    halfExtents: playcanvasLib.pcNs.Vec3,
    heightSegments: scala.Double,
    lengthSegments: scala.Double,
    widthSegments: scala.Double
  ): Anon_HalfExtentsHeightSegments = {
    val __obj = js.Dynamic.literal(halfExtents = halfExtents, heightSegments = heightSegments, lengthSegments = lengthSegments, widthSegments = widthSegments)
  
    __obj.asInstanceOf[Anon_HalfExtentsHeightSegments]
  }
}

