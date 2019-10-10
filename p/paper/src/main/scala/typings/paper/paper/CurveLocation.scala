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
@JSGlobal("paper.CurveLocation")
@js.native
class CurveLocation protected () extends js.Object {
  /** 
    * Creates a new CurveLocation object.
    */
  def this(curve: Curve, time: Double) = this()
  def this(curve: Curve, time: Double, point: Point) = this()
  /** 
    * The curvature of the {@link #curve} at the given location.
    */
  val curvature: Double = js.native
  /** 
    * The curve that this location belongs to.
    */
  val curve: Curve = js.native
  /** 
    * The length of the curve from its beginning up to the location described
    * by this object.
    */
  val curveOffset: Double = js.native
  /** 
    * The distance from the queried point to the returned location.
    * 
    * @see Curve#getNearestLocation(point)
    * @see PathItem#getNearestLocation(point)
    */
  val distance: Double = js.native
  /** 
    * The index of the {@link #curve} within the {@link Path#curves} list, if
    * it is part of a {@link Path} item.
    */
  val index: Double = js.native
  /** 
    * The curve location on the intersecting curve, if this location is the
    * result of a call to {@link PathItem#getIntersections} /
    * {@link Curve#getIntersections}.
    */
  val intersection: CurveLocation = js.native
  /** 
    * The normal vector to the {@link #curve} at the given location.
    */
  val normal: Point = js.native
  /** 
    * The length of the path from its beginning up to the location described
    * by this object. If the curve is not part of a path, then the length
    * within the curve is returned instead.
    */
  val offset: Double = js.native
  /** 
    * The path that this locations is situated on.
    */
  val path: Path = js.native
  /** 
    * The point which is defined by the {@link #curve} and
    * {@link #time}.
    */
  val point: Point = js.native
  /** 
    * The segment of the curve which is closer to the described location.
    */
  val segment: Segment = js.native
  /** 
    * The tangential vector to the {@link #curve} at the given location.
    */
  val tangent: Point = js.native
  /** 
    * The curve-time parameter, as used by various bezier curve calculations.
    * It is value between `0` (beginning of the curve) and `1` (end of the
    * curve).
    */
  val time: Double = js.native
  /** 
    * Checks whether tow CurveLocation objects are describing the same location
    * on a path, by applying the same tolerances as elsewhere when dealing with
    * curve-time parameters.
    * 
    * @return true if the locations are equal
    */
  def equals(location: CurveLocation): Boolean = js.native
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
  def hasOverlap(): Boolean = js.native
  /** 
    * Checks if the location is an intersection with another curve and is
    * crossing the other curve, as opposed to just touching it.
    * 
    * @see #isTouching()
    * 
    * @return true if the location is an intersection that is
    * crossing another curve
    */
  def isCrossing(): Boolean = js.native
  /** 
    * Checks if the location is an intersection with another curve and is
    * merely touching the other curve, as opposed to crossing it.
    * 
    * @see #isCrossing()
    * 
    * @return true if the location is an intersection that is
    * merely touching another curve
    */
  def isTouching(): Boolean = js.native
}

