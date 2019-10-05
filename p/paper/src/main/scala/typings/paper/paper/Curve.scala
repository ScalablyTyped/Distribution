package typings.paper.paper

import typings.paper.Anon_Roots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Curve")
@js.native
class Curve protected () extends Base {
  /**
    * Creates a new curve object.
    * @param segment1 -
    * @param segment2 -
    */
  def this(segment1: Segment, segment2: Segment) = this()
  /**
    * Creates a new curve object.
    * @param point1: Point
    * @param handle1: Point
    * @param handle2: Point
    * @param point2: Point
    */
  def this(point1: Point, handle1: Point, handle2: Point, point2: Point) = this()
  /**
    * The area that the curve’s geometry is covering.
    * Read only.
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
    * The index of the curve in the path.curves array.
    * Read Only.
    */
  val index: Double = js.native
  /**
    * The approximated length of the curve in points.
    * Read Only.
    */
  val length: Double = js.native
  /**
    * The next curve in the path.curves array that the curve belongs to.
    * Read Only
    */
  val next: Curve = js.native
  /**
    * The path that the curve belongs to.
    * Read only.
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
    * An array of 4 point objects, describing this curve’s geometry in absolute coordinates (point1, handle1, handle2, point2).
    * Note that the handles are converted to absolute coordinates.
    * Read only.
    */
  val points: js.Array[Point] = js.native
  /**
    * The previous curve in the path.curves array that the curve belongs to.
    * Read Only.
    */
  val previous: Curve = js.native
  /**
    * The first segment of the curve.
    * Read Only.
    */
  val segment1: Segment = js.native
  /**
    * The second segment of the curve.
    * Read only.
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
    * An array of 8 float values, describing this curve’s geometry in four absolute x/y pairs (point1, handle1, handle2, point2). This format is used internally for efficient processing of curve geometries, e.g. when calculating intersections or bounds.
    * Note that the handles are converted to absolute coordinates.
    * Read only.
    */
  val values: js.Array[Double] = js.native
  /**
    * Determines the type of cubic Bézier curve via discriminant classification, as well as the curve-time parameters of the associated points of inflection, loops, cusps, etc.
    * Returns  the curve classification information as an object
    *      type - the type of Bézier curve, possible values are: ‘line’, ‘quadratic’, ‘serpentine’, ‘cusp’, ‘loop’, ‘arch’
    *      roots - the curve-time parameters of the associated points of inflection for serpentine curves, loops, cusps, etc
    */
  def classify(): Anon_Roots = js.native
  /**
    * Clears the curve’s handles by setting their coordinates to zero, turning the curve into a straight line.
    */
  def clearHandles(): Unit = js.native
  /**
    * Divides the curve into two curves at the given offset. The curve itself is modified and becomes the first part, the second part is returned as a new curve. If the modified curve belongs to a path item, the second part is also added to the path.
    * @param offset [optional] - the offset on the curve at which to split, or the curve time parameter if isParameter is true. default: 0.5
    * @param isTime [optional] - pass true if offset is a curve time parameter. default: false
    * @returns the second part of the divided curve if the location is valid, {code null} otherwise
    */
  def divide(): Curve = js.native
  def divide(offset: Double): Curve = js.native
  def divide(offset: Double, isTime: Boolean): Curve = js.native
  /**
    * Divides the curve into two curves at the given offset or location. The curve itself is modified and becomes the first part, the second part is returned as a new curve. If the curve belongs to a path item, a new segment is inserted into the path at the given location, and the second part becomes a part of the path as well.
    * @param location - the offset or location on the curve at which to divide
    * @returns the second part of the divided curve if the location is valid, {code null} otherwise
    */
  def divideAt(location: Double): Curve = js.native
  def divideAt(location: CurveLocation): Curve = js.native
  /**
    * Divides the curve into two curves at the given offset or location. The curve itself is modified and becomes the first part, the second part is returned as a new curve. If the curve belongs to a path item, a new segment is inserted into the path at the given location, and the second part becomes a part of the path as well.
    * @param time - the curve-time parameter on the curve at which to divide
    * @param setHandles - whether to set handles on the new curves. default is the output of hasHandles().
    * @returns the second part of the divided curve if the location is valid, {code null} otherwise
    */
  def divideAtTime(time: Double): Curve = js.native
  def divideAtTime(time: Double, setHandles: Boolean): Curve = js.native
  /**
    * Calculates the curvature of the curve at the given offset. Curvatures indicate how sharply a curve changes direction. A straight line has zero curvature, where as a circle has a constant curvature. The curve's radius at the given offset is the reciprocal value of its curvature.
    * @param offset - the offset on the curve, or the curve time parameter if isParameter is true
    * @param isTime - pass true if offset is a curve time parameter. default: false
    */
  def getCurvatureAt(offset: Double): Point = js.native
  def getCurvatureAt(offset: Double, isTime: Boolean): Point = js.native
  /**
    * Returns all intersections between two Curve objects as an array of CurveLocation objects.
    * @param curve - the other curve to find the intersections with (if the curve itself or null is passed, the self intersection of the curve is returned, if it exists)
    */
  def getIntersections(curve: Curve): js.Array[CurveLocation] = js.native
  /**
    * Calculates the curve location at the specified offset or curve time parameter.
    * @param offset - the offset on the curve, or the curve time parameter if isParameter is true
    * @param isTime [optional] - pass true if offset is a curve time parameter.  default: false
    */
  def getLocationAt(offset: Double): CurveLocation = js.native
  def getLocationAt(offset: Double, isTime: Boolean): CurveLocation = js.native
  /**
    * Returns the curve location of the specified point if it lies on the curve, null otherwise.
    * @param point - the point on the curve
    */
  def getLocationOf(point: Point): CurveLocation = js.native
  /**
    * Returns the nearest location on the curve to the specified point.
    * @param point - the point for which we search the nearest location
    */
  def getNearestLocation(point: Point): CurveLocation = js.native
  /**
    * Returns the nearest point on the curve to the specified point.
    * @param point - the point for which we search the nearest point
    */
  def getNearestPoint(point: Point): Point = js.native
  /**
    * Calculates the normal vector of the curve at the given offset.
    * @param offset - the offset on the curve, or the curve time parameter if isParameter is true
    * @param isTime [optional] - pass true if offset is a curve time parameter. default: false
    */
  def getNormalAt(offset: Double): Point = js.native
  def getNormalAt(offset: Double, isTime: Boolean): Point = js.native
  /**
    * Calculates the curve offset at the specified curve-time parameter on the curve.
    * @param time - the curve-time parameter on the curve
    */
  def getOffsetAtTime(time: Double): Double = js.native
  /**
    * Returns the length of the path from its beginning up to up to the specified point if it lies on the path, null otherwise.
    * @param point - the point on the path.
    */
  def getOffsetOf(point: Point): Double = js.native
  /**
    * Calculates the curve time parameter of the specified offset on the path, relative to the provided start parameter. If offset is a negative value, the parameter is searched to the left of the start parameter. If no start parameter is provided, a default of 0 for positive values of offset and 1 for negative values of offset.
    * @param offset - the offset at which to find the curve-time, in curve length units
    * @param start [optional] - the curve-time in relation to which the offset is determined
    * @deprecated use getTimeAt instead
    */
  def getParameterAt(offset: Double): Double = js.native
  def getParameterAt(offset: Double, start: Double): Double = js.native
  /**
    * Returns the curve time parameter of the specified point if it lies on the curve, null otherwise.
    * @param point - the point on the curve.
    * @deprecated use getTimeOf instead
    */
  def getParameterOf(point: Point): Double = js.native
  /**
    * Creates a new curve as a sub-curve from this curve, its range defined by the given curve-time parameters. If from is larger than to, then the resulting curve will have its direction reversed.
    * @param from - the curve-time parameter at which the sub-curve starts
    * @param to - the curve-time parameter at which the sub-curve ends
    */
  def getPart(from: Double, to: Double): Curve = js.native
  /**
    * Calculates the point on the curve at the given offset.
    * @param offset - the offset on the curve, or the curve time parameter if isParameter is true
    * @param isTime [optional] - pass true if offset is a curve time parameter. default: false
    */
  def getPointAt(offset: Double): Point = js.native
  def getPointAt(offset: Double, isTime: Boolean): Point = js.native
  /**
    * Calculates the tangent vector of the curve at the given offset.
    * @param offset - the offset on the curve, or the curve time parameter if isParameter is true
    * @param isTime [optional] - pass true if offset is a curve time parameter. default: false
    */
  def getTangentAt(offset: Double): Point = js.native
  def getTangentAt(offset: Double, isTime: Boolean): Point = js.native
  /**
    * Calculates the curve-time parameter of the specified offset on the path, relative to the provided start parameter. If offset is a negative value, the parameter is searched to the left of the start parameter. If no start parameter is provided, a default of 0 for positive values of offset and 1 for negative values of offset.
    * @param offset - the offset at which to find the curve-time, in curve length units
    * @param start [optional] - the curve-time in relation to which the offset is determined
    */
  def getTimeAt(offset: Double): Double = js.native
  def getTimeAt(offset: Double, start: Double): Double = js.native
  /**
    * Returns the curve-time parameter of the specified point if it lies on the curve, null otherwise. Note that if there is more than one possible solution in a self-intersecting curve, the first found result is returned.
    * @param point - the point on the curve
    */
  def getTimeOf(point: Point): Double = js.native
  /**
    * Calculates the weighted normal vector of the curve at the given offset.
    * @param offset - the offset on the curve, or the curve time parameter if isParameter is true
    * @param isTime [optional] - pass true if offset is a curve time parameter. default: false
    */
  def getWeightedNormalAt(offset: Double): Point = js.native
  def getWeightedNormalAt(offset: Double, isTime: Boolean): Point = js.native
  /**
    * Calculates the weighted tangent vector of the curve at the given offset.
    * @param offset - the offset on the curve, or the curve time parameter if isParameter is true
    * @param isTime [optional] - pass true if offset is a curve time parameter. default: false
    */
  def getWeightedTangentAt(offset: Double): Point = js.native
  def getWeightedTangentAt(offset: Double, isTime: Boolean): Point = js.native
  /**
    * Checks if this curve has any curve handles set.
    */
  def hasHandles(): Boolean = js.native
  /**
    * Checks if this curve has any length.
    * @param epsilon [optional] - the epsilon against which to compare the curve’s length. default: 0
    */
  def hasLength(): Boolean = js.native
  def hasLength(epsilon: Double): Boolean = js.native
  /**
    * Checks if the the two curves describe straight lines that are collinear, meaning they run in parallel.
    * @param curve - the other curve to check against
    */
  def isCollinear(curve: Curve): Boolean = js.native
  /**
    * Checks if the this is the first curve in the path.curves array.
    */
  def isFirst(): Boolean = js.native
  /**
    * Checks if the curve is a straight horizontal line.
    */
  def isHorizontal(): Boolean = js.native
  /**
    * Checks if the this is the last curve in the path.curves array.
    */
  def isLast(): Boolean = js.native
  /**
    * Checks if this curve is linear, meaning it does not define any curve handle.
    */
  def isLinear(): Boolean = js.native
  /**
    * Checks if this curve appears as a straight line. This can mean that it has no handles defined, or that the handles run collinear with the line that connects the curve’s start and end point, not falling outside of the line.
    */
  def isStraight(): Boolean = js.native
  /**
    * Checks if the curve is a straight vertical line.
    */
  def isVertical(): Boolean = js.native
  /**
    * Removes the curve from the path that it belongs to, by removing its second segment and merging its handle with the first segment.
    */
  def remove(): Boolean = js.native
  /**
    * Returns a reversed version of the curve, without modifying the curve itself.
    */
  def reversed(): Curve = js.native
  /**
    * Splits the path this curve belongs to at the given offset. After splitting, the path will be open. If the path was open already, splitting will result in two paths.
    * @param offset [optional] - the offset on the curve at which to split, or the curve time parameter if isParameter is true default: 0.5
    * @param isParameter [optional] - pass true if offset is a curve time parameter. default: false
    */
  def split(): Path = js.native
  def split(offset: Double): Path = js.native
  def split(offset: Double, isParameter: Boolean): Path = js.native
  /**
    * Splits the path this curve belongs to at the given offset. After splitting, the path will be open. If the path was open already, splitting will result in two paths.
    * @param location - the offset or location on the curve at which to split
    * @returns the newly created path after splitting, if any
    */
  def splitAt(location: Double): Path = js.native
  def splitAt(location: CurveLocation): Path = js.native
  /**
    * Splits the path this curve belongs to at the given offset. After splitting, the path will be open. If the path was open already, splitting will result in two paths.
    * @param time - the curve-time parameter on the curve at which to split
    */
  def splitAtTime(time: Double): Path = js.native
}

