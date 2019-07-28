package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.CurveLocation")
@js.native
class CurveLocation protected () extends Base {
  /**
    * Creates a new CurveLocation object.
    * @param curve -
    * @param time -
    * @param point [optional]
    */
  def this(curve: Curve, time: Double) = this()
  def this(curve: Curve, time: Double, point: Point) = this()
  /**
    * The curvature of the curve at the given location.
    * Read only.
    */
  val curvature: Double = js.native
  /**
    * The curve that this location belongs to.
    * Read Only
    */
  val curve: Curve = js.native
  /**
    * The length of the curve from its beginning up to the location described by this object.
    * Read Only.
    */
  val curveOffset: Double = js.native
  /**
    * The distance from the queried point to the returned location.
    * Read Only.
    */
  val distance: Double = js.native
  /**
    * The index of the curve within the path.curves list, if the curve is part of a Path item.
    * Read Only.
    */
  val index: Double = js.native
  /**
    * The curve location on the intersecting curve, if this location is the result of a call to pathItem.getIntersections(path) / Curve#getIntersections(curve).
    * Read Only.
    */
  val intersection: CurveLocation = js.native
  /**
    * The normal vector to the curve at the given location.
    * Read only.
    */
  val normal: Point = js.native
  /**
    * The length of the path from its beginning up to the location described by this object. If the curve is not part of a path, then the length within the curve is returned instead.
    * Read only.
    */
  val offset: Double = js.native
  /**
    * The curve parameter, as used by various bezier curve calculations. It is value between 0 (beginning of the curve) and 1 (end of the curve).
    * Read only.
    * @deprecated use time instead
    */
  val parameter: Double = js.native
  /**
    * The path this curve belongs to, if any.
    * Read Only
    */
  val path: Path = js.native
  /**
    * The point which is defined by the curve and time.
    * Read Only.
    */
  val point: Point = js.native
  /**
    * The segment of the curve which is closer to the described location.
    * Read Only
    */
  val segment: Segment = js.native
  /**
    * The tangential vector to the curve at the given location.
    * Read only.
    */
  val tangent: Point = js.native
  /**
    * The curve-time parameter, as used by various bezier curve calculations. It is value between 0 (beginning of the curve) and 1 (end of the curve).
    * Read Only.
    */
  val time: Double = js.native
  /**
    * Checks whether two CurveLocation objects are describing the same location on a path, by applying the same tolerances as elsewhere when dealing with curve time parameters.
    * @param location CurveLocation
    */
  def equals(location: CurveLocation): Boolean = js.native
  /**
    * Checks if the location is an intersection with another curve and is part of an overlap between the two involved paths.
    */
  def hasOverlap(): Boolean = js.native
  /**
    * Checks if the location is an intersection with another curve and is crossing the other curve, as opposed to just touching it.
    */
  def isCrossing(): Boolean = js.native
  /**
    * Checks if the location is an intersection with another curve and is merely touching the other curve, as opposed to crossing it.
    */
  def isTouching(): Boolean = js.native
}

