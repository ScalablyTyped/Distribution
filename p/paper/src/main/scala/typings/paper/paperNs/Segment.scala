package typings.paper.paperNs

import typings.paper.Anon_FactorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Segment")
@js.native
/**
  * Creates a new Segment object.
  * @param point [optional] - the anchor point of the segment default: {x: 0, y: 0}
  * @param handleIn [optional] - the handle point relative to the anchor point of the segment that describes the in tangent of the segment default: {x: 0, y: 0}
  * @param handleOut [optional] - the handle point relative to the anchor point of the segment that describes the out tangent of the segment default: {x: 0, y: 0}
  */
class Segment () extends Base {
  def this(`object`: js.Any) = this()
  def this(point: Point) = this()
  def this(point: Point, handleIn: Point) = this()
  def this(point: Point, handleIn: Point, handleOut: Point) = this()
  /**
    * The curve that the segment belongs to. For the last segment of an open path, the previous segment is returned.
    * Read only.
    */
  val curve: Curve = js.native
  /**
    * The handle point relative to the anchor point of the segment that describes the in tangent of the segment.
    */
  var handleIn: Point = js.native
  /**
    * The handle point relative to the anchor point of the segment that describes the out tangent of the segment.
    */
  var handleOut: Point = js.native
  /**
    * The index of the segment in the path.segments array that the segment belongs to.
    * Read Only
    */
  val index: Double = js.native
  /**
    * The curve location that describes this segment's position ont the path.
    * Read Only.
    */
  val location: CurveLocation = js.native
  /**
    * The next segment in the path.segments array that the segment belongs to. If the segments belongs to a closed path, the first segment is returned for the last segment of the path.
    * Read Only.
    */
  val next: Segment = js.native
  /**
    * The path that the segment belongs to.
    * Read Only
    */
  val path: Path = js.native
  /**
    * The anchor point of the segment.
    */
  var point: Point = js.native
  /**
    * The previous segment in the path.segments array that the segment belongs to. If the segments belongs to a closed path, the last segment is returned for the first segment of the path.
    * Read Only.
    */
  val previous: Segment = js.native
  /**
    * Specifies whether the point of the segment is selected.
    */
  var selected: Boolean = js.native
  /**
    * Clears the segment’s handles by setting their coordinates to zero, turning the segment into a corner.
    */
  def clearHandles(): Unit = js.native
  /**
    * Checks whether the segment is equal to that of the supplied segment.
    * @param segment - the segment to check against
    */
  def equals(segment: Segment): Boolean = js.native
  /**
    * Checks if the segment has any curve handles set.
    */
  def hasHandles(): Boolean = js.native
  /**
    * Interpolates between the two specified segments and sets the point and handles of this segment accordingly.
    * @param from - the segment defining the geometry when factor is 0
    * @param to - the segment defining the geometry when factor is 1
    * @param factor - the interpolation coefficient, typically between 0 and 1, but extrapolation is possible too
    */
  def interpolate(from: Segment, to: Segment, factor: Double): Unit = js.native
  /**
    * Checks if the this is the first segment in the path.segments array.
    */
  def isFirst(): Boolean = js.native
  /**
    * Checks if the this is the last segment in the path.segments array.
    */
  def isLast(): Boolean = js.native
  /**
    * Checks if the segment connects two curves smoothly, meaning that its two handles are collinear and segment does not form a corner.
    */
  def isSmooth(): Boolean = js.native
  /**
    * Removes the segment from the path that it belongs to.
    */
  def remove(): Boolean = js.native
  /**
    * Returns the reversed the segment, without modifying the segment itself.
    */
  def reverse(): Segment = js.native
  /**
    * Returns the reversed the segment, without modifying the segment itself.
    */
  def reversed(): Segment = js.native
  /**
    * Smooths the bezier curves that pass through this segment by taking into account the segment’s position and distance to the neighboring segments and changing the direction and length of the segment’s handles accordingly without moving the segment itself.
    * Two different smoothing methods are available:
    *   'catmull-rom' uses the Catmull-Rom spline to smooth the segment.
    *      The optionally passed factor controls the knot parametrization of the algorithm:
    *        0.0: the standard, uniform Catmull-Rom spline
    *        0.5: the centripetal Catmull-Rom spline, guaranteeing no self-intersections
    *        1.0: the chordal Catmull-Rom spline
    *   'geometric' use a simple heuristic and empiric geometric method to smooth the segment’s handles. The handles were weighted, meaning that big differences in distances between the segments will lead to probably undesired results.
    * The optionally passed factor defines the tension parameter (0…1), controlling the amount of smoothing as a factor by which to scale each handle.
    * @param options [optional] - the smoothing options. default { type: 'catmull-rom', factor: 0.5 for 'catmull-rom', 0.4 for 'geometric'}
    * @param options.type - the type of smoothing method: ‘catmull-rom’, ‘geometric’
    * @param options.factor - the factor parameterizing the smoothing method — default: 0.5 for 'catmull-rom', 0.4 for 'geometric'
    */
  def smooth(): Unit = js.native
  def smooth(options: Anon_FactorType): Unit = js.native
  /**
    * Transform the segment by the specified matrix.
    * @param matrix - the matrix to transform the segment by
    */
  def transform(matrix: Matrix): Unit = js.native
}

