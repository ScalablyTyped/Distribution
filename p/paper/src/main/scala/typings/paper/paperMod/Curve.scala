package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Curve")
@js.native
class Curve protected ()
  extends typings.paper.paperNs.Curve {
  /**
    * Creates a new curve object.
    * @param segment1 -
    * @param segment2 -
    */
  def this(segment1: typings.paper.paperNs.Segment, segment2: typings.paper.paperNs.Segment) = this()
  /**
    * Creates a new curve object.
    * @param point1: Point
    * @param handle1: Point
    * @param handle2: Point
    * @param point2: Point
    */
  def this(
    point1: typings.paper.paperNs.Point,
    handle1: typings.paper.paperNs.Point,
    handle2: typings.paper.paperNs.Point,
    point2: typings.paper.paperNs.Point
  ) = this()
}

