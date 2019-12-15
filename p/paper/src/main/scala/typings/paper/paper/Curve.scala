package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Curve object represents the parts of a path that are connected by
  * two following {@link Segment} objects. The curves of a path can be accessed
  * through its {@link Path#curves} array.
  * 
  * While a segment describe the anchor point and its incoming and outgoing
  * handles, a Curve object describes the curve passing between two such
  * segments. Curves and segments represent two different ways of looking at the
  * same thing, but focusing on different aspects. Curves for example offer many
  * convenient ways to work with parts of the path, finding lengths, positions or
  * tangents at given offsets.
  */
@JSGlobal("paper.Curve")
@js.native
class Curve protected () extends js.Object {
  /** 
    * Creates a new curve object.
    */
  def this(segment1: Segment, segment2: Segment) = this()
  /** 
    * Creates a new curve object.
    */
  def this(point1: Point, handle1: Point, handle2: Point, point2: Point) = this()
  /** 
    * The area that the curve's geometry is covering.
    */
  val area: Double = js.native
  /** 
    * The bounding rectangle of the curve excluding stroke width.
    */
  var bounds: Rectangle = js.native
  /** 
    * The handle point that describes the tangent in the first anchor point.
    */
  var handle1: Point = js.native
  /** 
    * The handle point that describes the tangent in the second anchor point.
    */
  var handle2: Point = js.native
  /** 
    * The bounding rectangle of the curve including handles.
    */
  var handleBounds: Rectangle = js.native
  /** 
    * The index of the curve in the {@link Path#curves} array.
    */
  val index: Double = js.native
  /** 
    * The approximated length of the curve.
    */
  val length: Double = js.native
  /** 
    * The next curve in the {@link Path#curves} array that the curve
    * belongs to.
    */
  val next: Curve = js.native
  /** 
    * The path that the curve belongs to.
    */
  val path: Path = js.native
  /** 
    * The first anchor point of the curve.
    */
  var point1: Point = js.native
  /** 
    * The second anchor point of the curve.
    */
  var point2: Point = js.native
  /** 
    * An array of 4 point objects, describing this curve's geometry in absolute
    * coordinates (point1, handle1, handle2, point2).
    * 
    * Note that the handles are converted to absolute coordinates.
    */
  val points: js.Array[Point] = js.native
  /** 
    * The previous curve in the {@link Path#curves} array that the curve
    * belongs to.
    */
  val previous: Curve = js.native
  /** 
    * The first segment of the curve.
    */
  val segment1: Segment = js.native
  /** 
    * The second segment of the curve.
    */
  val segment2: Segment = js.native
  /** 
    * Specifies whether the points and handles of the curve are selected.
    */
  var selected: Boolean = js.native
  /** 
    * The bounding rectangle of the curve including stroke width.
    */
  var strokeBounds: Rectangle = js.native
  /** 
    * An array of 8 float values, describing this curve's geometry in four
    * absolute x/y pairs (point1, handle1, handle2, point2). This format is
    * used internally for efficient processing of curve geometries, e.g. when
    * calculating intersections or bounds.
    * 
    * Note that the handles are converted to absolute coordinates.
    */
  val values: js.Array[Double] = js.native
  /** 
    * Determines the type of cubic Bézier curve via discriminant
    * classification, as well as the curve-time parameters of the associated
    * points of inflection, loops, cusps, etc.
    * 
    * @return the curve classification information as an object, see
    *     options
    */
  def classify(): js.Object = js.native
  /** 
    * Clears the curve's handles by setting their coordinates to zero,
    * turning the curve into a straight line.
    */
  def clearHandles(): Unit = js.native
  /** 
    * Divides the curve into two curves at the given offset or location. The
    * curve itself is modified and becomes the first part, the second part is
    * returned as a new curve. If the curve belongs to a path item, a new
    * segment is inserted into the path at the given location, and the second
    * part becomes a part of the path as well.
    * 
    * @see #divideAtTime(time)
    * 
    * @param location - the offset or location on the
    *     curve at which to divide
    * 
    * @return the second part of the divided curve if the location is
    *     valid, {code null} otherwise
    */
  def divideAt(location: Double): Curve = js.native
  def divideAt(location: CurveLocation): Curve = js.native
  /** 
    * Divides the curve into two curves at the given curve-time parameter. The
    * curve itself is modified and becomes the first part, the second part is
    * returned as a new curve. If the modified curve belongs to a path item,
    * the second part is also added to the path.
    * 
    * @see #divideAt(offset)
    * 
    * @param time - the curve-time parameter on the curve at which to
    *     divide
    * 
    * @return the second part of the divided curve, if the offset is
    *     within the valid range, {code null} otherwise.
    */
  def divideAtTime(time: Double): Curve = js.native
  /** 
    * Calculates the curvature of the curve at the given location. Curvatures
    * indicate how sharply a curve changes direction. A straight line has zero
    * curvature, where as a circle has a constant curvature. The curve's radius
    * at the given location is the reciprocal value of its curvature.
    * 
    * @param location - the offset or location on the
    *     curve
    * 
    * @return the curvature of the curve at the given location
    */
  def getCurvatureAt(location: Double): Double = js.native
  def getCurvatureAt(location: CurveLocation): Double = js.native
  /** 
    * Calculates the curvature of the curve at the given location. Curvatures
    * indicate how sharply a curve changes direction. A straight line has zero
    * curvature, where as a circle has a constant curvature. The curve's radius
    * at the given location is the reciprocal value of its curvature.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the curvature of the curve at the given location
    */
  def getCurvatureAtTime(time: Double): Double = js.native
  /** 
    * Returns all intersections between two {@link Curve} objects as an
    * array of {@link CurveLocation} objects.
    * 
    * @param curve - the other curve to find the intersections with
    *     (if the curve itself or `null` is passed, the self intersection
    *     of the curve is returned, if it exists)
    * 
    * @return the locations of all intersections between
    *     the curves
    */
  def getIntersections(curve: Curve): js.Array[CurveLocation] = js.native
  /** 
    * Calculates the curve location at the specified offset on the curve.
    * 
    * @param offset - the offset on the curve
    * 
    * @return the curve location at the specified the offset
    */
  def getLocationAt(offset: Double): CurveLocation = js.native
  /** 
    * Calculates the curve location at the specified curve-time parameter on
    * the curve.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the curve location at the specified the location
    */
  def getLocationAtTime(time: Double): CurveLocation = js.native
  /** 
    * Returns the curve location of the specified point if it lies on the
    * curve, `null` otherwise.
    * 
    * @param point - the point on the curve
    * 
    * @return the curve location of the specified point
    */
  def getLocationOf(point: Point): CurveLocation = js.native
  /** 
    * Returns the nearest location on the curve to the specified point.
    * 
    * @param point - the point for which we search the nearest location
    * 
    * @return the location on the curve that's the closest to
    * the specified point
    */
  def getNearestLocation(point: Point): CurveLocation = js.native
  /** 
    * Returns the nearest point on the curve to the specified point.
    * 
    * @param point - the point for which we search the nearest point
    * 
    * @return the point on the curve that's the closest to the
    * specified point
    */
  def getNearestPoint(point: Point): Point = js.native
  /** 
    * Calculates the normal vector of the curve at the given location.
    * 
    * @param location - the offset or location on the
    *     curve
    * 
    * @return the normal of the curve at the given location
    */
  def getNormalAt(location: Double): Point = js.native
  def getNormalAt(location: CurveLocation): Point = js.native
  /** 
    * Calculates the normal vector of the curve at the given location.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the normal of the curve at the given location
    */
  def getNormalAtTime(time: Double): Point = js.native
  /** 
    * Calculates the curve offset at the specified curve-time parameter on
    * the curve.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the curve offset at the specified the location
    */
  def getOffsetAtTime(time: Double): Double = js.native
  /** 
    * Returns the length of the path from its beginning up to up to the
    * specified point if it lies on the path, `null` otherwise.
    * 
    * @param point - the point on the path
    * 
    * @return the length of the path up to the specified point
    */
  def getOffsetOf(point: Point): Double = js.native
  /** 
    * Creates a new curve as a sub-curve from this curve, its range defined by
    * the given curve-time parameters. If `from` is larger than `to`, then
    * the resulting curve will have its direction reversed.
    * 
    * @param from - the curve-time parameter at which the sub-curve
    * starts
    * @param to - the curve-time parameter at which the sub-curve
    * ends
    * 
    * @return the newly create sub-curve
    */
  def getPart(from: Double, to: Double): Curve = js.native
  /** 
    * Calculates the point on the curve at the given location.
    * 
    * @param location - the offset or location on the
    *     curve
    * 
    * @return the point on the curve at the given location
    */
  def getPointAt(location: Double): Point = js.native
  def getPointAt(location: CurveLocation): Point = js.native
  /** 
    * Calculates the point on the curve at the given location.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the point on the curve at the given location
    */
  def getPointAtTime(time: Double): Point = js.native
  /** 
    * Calculates the normalized tangent vector of the curve at the given
    * location.
    * 
    * @param location - the offset or location on the
    *     curve
    * 
    * @return the normalized tangent of the curve at the given location
    */
  def getTangentAt(location: Double): Point = js.native
  def getTangentAt(location: CurveLocation): Point = js.native
  /** 
    * Calculates the normalized tangent vector of the curve at the given
    * location.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the normalized tangent of the curve at the given location
    */
  def getTangentAtTime(time: Double): Point = js.native
  /** 
    * Calculates the curve-time parameter of the specified offset on the path,
    * relative to the provided start parameter. If offset is a negative value,
    * the parameter is searched to the left of the start parameter. If no start
    * parameter is provided, a default of `0` for positive values of `offset`
    * and `1` for negative values of `offset`.
    * 
    * @param offset - the offset at which to find the curve-time, in
    *     curve length units
    * @param start - the curve-time in relation to which the offset is
    *     determined
    * 
    * @return the curve-time parameter at the specified location
    */
  def getTimeAt(offset: Double): Double = js.native
  def getTimeAt(offset: Double, start: Double): Double = js.native
  /** 
    * Returns the curve-time parameter of the specified point if it lies on the
    * curve, `null` otherwise.
    * Note that if there is more than one possible solution in a
    * self-intersecting curve, the first found result is returned.
    * 
    * @param point - the point on the curve
    * 
    * @return the curve-time parameter of the specified point
    */
  def getTimeOf(point: Point): Double = js.native
  /** 
    * Calculates the curve-time parameters where the curve is tangential to
    * provided tangent. Note that tangents at the start or end are included.
    * 
    * @param tangent - the tangent to which the curve must be tangential
    * 
    * @return at most two curve-time parameters, where the curve is
    * tangential to the given tangent
    */
  def getTimesWithTangent(tangent: Point): js.Array[Double] = js.native
  /** 
    * Calculates the weighted normal vector of the curve at the given location,
    * its length reflecting the curve velocity at that location.
    * 
    * @param location - the offset or location on the
    *     curve
    * 
    * @return the weighted normal of the curve at the given location
    */
  def getWeightedNormalAt(location: Double): Point = js.native
  def getWeightedNormalAt(location: CurveLocation): Point = js.native
  /** 
    * Calculates the weighted normal vector of the curve at the given location,
    * its length reflecting the curve velocity at that location.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the weighted normal of the curve at the given location
    */
  def getWeightedNormalAtTime(time: Double): Point = js.native
  /** 
    * Calculates the weighted tangent vector of the curve at the given
    * location, its length reflecting the curve velocity at that location.
    * 
    * @param location - the offset or location on the
    *     curve
    * 
    * @return the weighted tangent of the curve at the given location
    */
  def getWeightedTangentAt(location: Double): Point = js.native
  def getWeightedTangentAt(location: CurveLocation): Point = js.native
  /** 
    * Calculates the weighted tangent vector of the curve at the given
    * location, its length reflecting the curve velocity at that location.
    * 
    * @param time - the curve-time parameter on the curve
    * 
    * @return the weighted tangent of the curve at the given location
    */
  def getWeightedTangentAtTime(time: Double): Point = js.native
  /** 
    * Checks if this curve has any curve handles set.
    * 
    * @see Curve#handle1
    * @see Curve#handle2
    * @see Segment#hasHandles()
    * @see Path#hasHandles()
    * 
    * @return true if the curve has handles set
    */
  def hasHandles(): Boolean = js.native
  /** 
    * Checks if this curve has any length.
    * 
    * @param epsilon - the epsilon against which to compare the
    *     curve's length
    * 
    * @return true if the curve is longer than the given epsilon
    */
  def hasLength(): Boolean = js.native
  def hasLength(epsilon: Double): Boolean = js.native
  /** 
    * Checks if the the two curves describe straight lines that are
    * collinear, meaning they run in parallel.
    * 
    * @param curve - the other curve to check against
    * 
    * @return true if the two lines are collinear
    */
  def isCollinear(curve: Curve): Boolean = js.native
  /** 
    * Checks if the this is the first curve in the {@link Path#curves} array.
    * 
    * @return true if this is the first curve
    */
  def isFirst(): Boolean = js.native
  /** 
    * Checks if the curve is a straight horizontal line.
    * 
    * @return true if the line is horizontal
    */
  def isHorizontal(): Boolean = js.native
  /** 
    * Checks if the this is the last curve in the {@link Path#curves} array.
    * 
    * @return true if this is the last curve
    */
  def isLast(): Boolean = js.native
  /** 
    * Checks if this curve is parametrically linear, meaning that it is
    * straight and its handles are positioned at 1/3 and 2/3 of the total
    * length of the curve.
    * 
    * @return true if the curve is parametrically linear
    */
  def isLinear(): Boolean = js.native
  /** 
    * Checks if this curve appears as a straight line. This can mean that
    * it has no handles defined, or that the handles run collinear with the
    * line that connects the curve's start and end point, not falling
    * outside of the line.
    * 
    * @return true if the curve is straight
    */
  def isStraight(): Boolean = js.native
  /** 
    * Checks if the curve is a straight vertical line.
    * 
    * @return true if the line is vertical
    */
  def isVertical(): Boolean = js.native
  /** 
    * Removes the curve from the path that it belongs to, by removing its
    * second segment and merging its handle with the first segment.
    * 
    * @return true if the curve was removed
    */
  def remove(): Boolean = js.native
  /** 
    * Returns a reversed version of the curve, without modifying the curve
    * itself.
    * 
    * @return a reversed version of the curve
    */
  def reversed(): Curve = js.native
  /** 
    * Splits the path this curve belongs to at the given offset. After
    * splitting, the path will be open. If the path was open already, splitting
    * will result in two paths.
    * 
    * @see Path#splitAt(offset)
    * 
    * @param location - the offset or location on the
    *     curve at which to split
    * 
    * @return the newly created path after splitting, if any
    */
  def splitAt(location: Double): Path = js.native
  def splitAt(location: CurveLocation): Path = js.native
  /** 
    * Splits the path this curve belongs to at the given offset. After
    * splitting, the path will be open. If the path was open already, splitting
    * will result in two paths.
    * 
    * @see Path#splitAt(offset)
    * 
    * @param time - the curve-time parameter on the curve at which to
    *     split
    * 
    * @return the newly created path after splitting, if any
    */
  def splitAtTime(time: Double): Path = js.native
}

