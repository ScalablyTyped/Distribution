package typings.playcanvas

import typings.playcanvas.pcNs.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HalfExtents extends js.Object {
  var halfExtents: Vec2
  var lenghtSegments: Double
  var widthSegments: Double
}

object Anon_HalfExtents {
  @scala.inline
  def apply(halfExtents: Vec2, lenghtSegments: Double, widthSegments: Double): Anon_HalfExtents = {
    val __obj = js.Dynamic.literal(halfExtents = halfExtents, lenghtSegments = lenghtSegments, widthSegments = widthSegments)
  
    __obj.asInstanceOf[Anon_HalfExtents]
  }
}

