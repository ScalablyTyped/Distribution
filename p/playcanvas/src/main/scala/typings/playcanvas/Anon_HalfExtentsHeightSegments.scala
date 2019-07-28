package typings.playcanvas

import typings.playcanvas.pcNs.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HalfExtentsHeightSegments extends js.Object {
  var halfExtents: Vec3
  var heightSegments: Double
  var lengthSegments: Double
  var widthSegments: Double
}

object Anon_HalfExtentsHeightSegments {
  @scala.inline
  def apply(halfExtents: Vec3, heightSegments: Double, lengthSegments: Double, widthSegments: Double): Anon_HalfExtentsHeightSegments = {
    val __obj = js.Dynamic.literal(halfExtents = halfExtents, heightSegments = heightSegments, lengthSegments = lengthSegments, widthSegments = widthSegments)
  
    __obj.asInstanceOf[Anon_HalfExtentsHeightSegments]
  }
}

