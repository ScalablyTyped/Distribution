package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Curve")
@js.native
class Curve protected ()
  extends paperLib.paperNs.Curve {
  /**
           * Creates a new curve object.
           * @param segment1 -
           * @param segment2 -
           */
  def this(segment1: paperLib.paperNs.Segment, segment2: paperLib.paperNs.Segment) = this()
  /**
           * Creates a new curve object.
           * @param point1: Point
           * @param handle1: Point
           * @param handle2: Point
           * @param point2: Point
           */
  def this(point1: paperLib.paperNs.Point, handle1: paperLib.paperNs.Point, handle2: paperLib.paperNs.Point, point2: paperLib.paperNs.Point) = this()
}

