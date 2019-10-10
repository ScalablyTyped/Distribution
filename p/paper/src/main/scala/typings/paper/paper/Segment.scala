package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Segment object represents the points of a path through which its
  * {@link Curve} objects pass. The segments of a path can be accessed through
  * its {@link Path#segments} array.
  * 
  * Each segment consists of an anchor point ({@link Segment#point}) and
  * optionaly an incoming and an outgoing handle ({@link Segment#handleIn} and
  * {@link Segment#handleOut}), describing the tangents of the two {@link Curve}
  * objects that are connected by this segment.
  */
@JSGlobal("paper.Segment")
@js.native
/** 
  * Creates a new Segment object.
  * 
  * @param point - the anchor point of the segment
  * @param handleIn - the handle point relative to the
  *     anchor point of the segment that describes the in tangent of the
  *     segment
  * @param handleOut - the handle point relative to the
  *     anchor point of the segment that describes the out tangent of the
  *     segment
  */
class Segment () extends js.Object {
  /** 
    * Creates a new Segment object.
    * 
    * @param object - an object containing properties to be set on the
    *     segment
    */
  def this(`object`: js.Object) = this()
  def this(point: Point) = this()
  def this(point: Point, handleIn: Point) = this()
  def this(point: Point, handleIn: Point, handleOut: Point) = this()
  /** 
    * The curve that the segment belongs to. For the last segment of an open
    * path, the previous segment is returned.
    */
  val curve: Curve = js.native
  /** 
    * The handle point relative to the anchor point of the segment that
    * describes the in tangent of the segment.
    */
  var handleIn: Point | Null = js.native
  /** 
    * The handle point relative to the anchor point of the segment that
    * describes the out tangent of the segment.
    */
  var handleOut: Point | Null = js.native
  /** 
    * The index of the segment in the {@link Path#segments} array that the
    * segment belongs to.
    */
  val index: Double = js.native
  /** 
    * The curve location that describes this segment's position on the path.
    */
  val location: CurveLocation = js.native
  /** 
    * The next segment in the {@link Path#segments} array that the segment
    * belongs to. If the segments belongs to a closed path, the first segment
    * is returned for the last segment of the path.
    */
  val next: Segment = js.native
  /** 
    * The path that the segment belongs to.
    */
  val path: Path = js.native
  /** 
    * The anchor point of the segment.
    */
  var point: Point | Null = js.native
  /** 
    * The previous segment in the {@link Path#segments} array that the
    * segment belongs to. If the segments belongs to a closed path, the last
    * segment is returned for the first segment of the path.
    */
  val previous: Segment = js.native
  /** 
    * Specifies whether the segment is selected.
    */
  var selected: Boolean | Null = js.native
  /** 
    * Clears the segment's handles by setting their coordinates to zero,
    * turning the segment into a corner.
    */
  def clearHandles(): Unit = js.native
  /** 
    * Checks if the segment has any curve handles set.
    * 
    * @see Segment#handleIn
    * @see Segment#handleOut
    * @see Curve#hasHandles()
    * @see Path#hasHandles()
    * 
    * @return true if the segment has handles set
    */
  def hasHandles(): Boolean = js.native
  /** 
    * Interpolates between the two specified segments and sets the point and
    * handles of this segment accordingly.
    * 
    * @param from - the segment defining the geometry when `factor` is
    *     `0`
    * @param to - the segment defining the geometry when `factor` is
    *     `1`
    * @param factor - the interpolation coefficient, typically between
    *     `0` and `1`, but extrapolation is possible too
    */
  def interpolate(from: Segment, to: Segment, factor: Double): Unit = js.native
  /** 
    * Checks if the this is the first segment in the {@link Path#segments}
    * array.
    * 
    * @return true if this is the first segment
    */
  def isFirst(): Boolean = js.native
  /** 
    * Checks if the this is the last segment in the {@link Path#segments}
    * array.
    * 
    * @return true if this is the last segment
    */
  def isLast(): Boolean = js.native
  /** 
    * Checks if the segment connects two curves smoothly, meaning that its two
    * handles are collinear and segment does not form a corner.
    * 
    * @see Point#isCollinear()
    * 
    * @return true if the segment is smooth
    */
  def isSmooth(): Boolean = js.native
  /** 
    * Removes the segment from the path that it belongs to.
    * 
    * @return true if the segment was removed
    */
  def remove(): Boolean = js.native
  /** 
    * Reverses the {@link #handleIn} and {@link #handleOut} vectors of this
    * segment, modifying the actual segment without creating a copy.
    * 
    * @return the reversed segment
    */
  def reverse(): Segment = js.native
  /** 
    * Returns the reversed the segment, without modifying the segment itself.
    * 
    * @return the reversed segment
    */
  def reversed(): Segment = js.native
  /** 
    * Smooths the bezier curves that pass through this segment by taking into
    * account the segment's position and distance to the neighboring segments
    * and changing the direction and length of the segment's handles
    * accordingly without moving the segment itself.
    * 
    * Two different smoothing methods are available:
    * 
    * - `'catmull-rom'` uses the Catmull-Rom spline to smooth the segment.
    * 
    *     The optionally passed factor controls the knot parametrization of the
    *     algorithm:
    * 
    *     - `0.0`: the standard, uniform Catmull-Rom spline
    *     - `0.5`: the centripetal Catmull-Rom spline, guaranteeing no
    *         self-intersections
    *     - `1.0`: the chordal Catmull-Rom spline
    * 
    * - `'geometric'` use a simple heuristic and empiric geometric method to
    *     smooth the segment's handles. The handles were weighted, meaning that
    *     big differences in distances between the segments will lead to
    *     probably undesired results.
    * 
    *     The optionally passed factor defines the tension parameter (`0...1`),
    *     controlling the amount of smoothing as a factor by which to scale
    *     each handle.
    * 
    * @see PathItem#smooth([options])
    * 
    * @option [options.type='catmull-rom'] {String} the type of smoothing
    *     method: {@values 'catmull-rom', 'geometric'}
    * @option options.factor {Number} the factor parameterizing the smoothing
    *     method — default: `0.5` for `'catmull-rom'`, `0.4` for `'geometric'`
    * 
    * @param options - the smoothing options
    */
  def smooth(): Unit = js.native
  def smooth(options: js.Object): Unit = js.native
  /** 
    * Transform the segment by the specified matrix.
    * 
    * @param matrix - the matrix to transform the segment by
    */
  def transform(matrix: Matrix): Unit = js.native
}

