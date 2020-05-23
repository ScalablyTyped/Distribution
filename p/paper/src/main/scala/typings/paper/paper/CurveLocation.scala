package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * CurveLocation objects describe a location on {@link Curve} objects, as
  *     defined by the curve-time {@link #time}, a value between `0` (beginning
  *     of the curve) and `1` (end of the curve). If the curve is part of a
  *     {@link Path} item, its {@link #index} inside the {@link Path#curves}
  *     array is also provided.
  * 
  * The class is in use in many places, such as
  * {@link Path#getLocationAt},
  * {@link Path#getLocationOf},
  * {@link PathItem#getNearestLocation},
  * {@link PathItem#getIntersections},
  * etc.
  */
trait CurveLocation extends js.Object {
  /** 
    * The curvature of the {@link #curve} at the given location.
    */
  val curvature: Double
  /** 
    * The curve that this location belongs to.
    */
  val curve: Curve
  /** 
    * The length of the curve from its beginning up to the location described
    * by this object.
    */
  val curveOffset: Double
  /** 
    * The distance from the queried point to the returned location.
    * 
    * @see Curve#getNearestLocation(point)
    * @see PathItem#getNearestLocation(point)
    */
  val distance: Double
  /** 
    * The index of the {@link #curve} within the {@link Path#curves} list, if
    * it is part of a {@link Path} item.
    */
  val index: Double
  /** 
    * The curve location on the intersecting curve, if this location is the
    * result of a call to {@link PathItem#getIntersections} /
    * {@link Curve#getIntersections}.
    */
  val intersection: CurveLocation
  /** 
    * The normal vector to the {@link #curve} at the given location.
    */
  val normal: Point
  /** 
    * The length of the path from its beginning up to the location described
    * by this object. If the curve is not part of a path, then the length
    * within the curve is returned instead.
    */
  val offset: Double
  /** 
    * The path that this locations is situated on.
    */
  val path: Path
  /** 
    * The point which is defined by the {@link #curve} and
    * {@link #time}.
    */
  val point: Point
  /** 
    * The segment of the curve which is closer to the described location.
    */
  val segment: Segment
  /** 
    * The tangential vector to the {@link #curve} at the given location.
    */
  val tangent: Point
  /** 
    * The curve-time parameter, as used by various bezier curve calculations.
    * It is value between `0` (beginning of the curve) and `1` (end of the
    * curve).
    */
  val time: Double
  /** 
    * Checks whether tow CurveLocation objects are describing the same location
    * on a path, by applying the same tolerances as elsewhere when dealing with
    * curve-time parameters.
    * 
    * @return true if the locations are equal
    */
  def equals(location: CurveLocation): Boolean
  /** 
    * Checks if the location is an intersection with another curve and is
    * part of an overlap between the two involved paths.
    * 
    * @see #isCrossing()
    * @see #isTouching()
    * 
    * @return true if the location is an intersection that is
    * part of an overlap between the two involved paths
    */
  def hasOverlap(): Boolean
  /** 
    * Checks if the location is an intersection with another curve and is
    * crossing the other curve, as opposed to just touching it.
    * 
    * @see #isTouching()
    * 
    * @return true if the location is an intersection that is
    * crossing another curve
    */
  def isCrossing(): Boolean
  /** 
    * Checks if the location is an intersection with another curve and is
    * merely touching the other curve, as opposed to crossing it.
    * 
    * @see #isCrossing()
    * 
    * @return true if the location is an intersection that is
    * merely touching another curve
    */
  def isTouching(): Boolean
}

object CurveLocation {
  @scala.inline
  def apply(
    curvature: Double,
    curve: Curve,
    curveOffset: Double,
    distance: Double,
    equals: CurveLocation => Boolean,
    hasOverlap: () => Boolean,
    index: Double,
    intersection: CurveLocation,
    isCrossing: () => Boolean,
    isTouching: () => Boolean,
    normal: Point,
    offset: Double,
    path: Path,
    point: Point,
    segment: Segment,
    tangent: Point,
    time: Double
  ): CurveLocation = {
    val __obj = js.Dynamic.literal(curvature = curvature.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], curveOffset = curveOffset.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), hasOverlap = js.Any.fromFunction0(hasOverlap), index = index.asInstanceOf[js.Any], intersection = intersection.asInstanceOf[js.Any], isCrossing = js.Any.fromFunction0(isCrossing), isTouching = js.Any.fromFunction0(isTouching), normal = normal.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveLocation]
  }
}

