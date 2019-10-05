package typings.paper.paper

import typings.paper.Anon_Factor
import typings.paper.Anon_Insert
import typings.paper.Anon_InsertTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.PathItem")
@js.native
class PathItem () extends Item {
  /**
    * Specifies whether the path as a whole is oriented clock-wise, by looking at the path’s area. Note that self-intersecting paths and sub-paths of different orientation can result in areas that cancel each other out.
    */
  var clockwise: Boolean = js.native
  /**
    * Returns a point that is guaranteed to be inside the path.
    */
  val interiorPoint: Point = js.native
  /**
    * The path's geometry, formatted as SVG style path data.
    */
  var pathData: String = js.native
  /**
    * Adds an arc from the position of the last segment in the path, passing through the specified through vector, to the specified to vector, all specified relatively to it by these given vectors, by adding one or more segments to the path.
    * @param through - the vector where the arc should pass through
    * @param to - the vector where the arc should end
    */
  def arcBy(through: Point, to: Point): Unit = js.native
  /**
    * Adds an arc from the position of the last segment in the path to the to vector specified relatively to it, by adding one or more segments to the path.
    * @param to - the vector where the arc should end
    * @param clockwise [optional] - specifies whether the arc should be drawn in clockwise direction. default: true
    */
  def arcBy(to: Point): Unit = js.native
  def arcBy(to: Point, clockwise: Boolean): Unit = js.native
  /**
    * Draws an arc from the position of the last segment point in the path that goes through the specified through point, to the specified to point by adding one or more segments to the path.
    * @param through - the point where the arc should pass through
    * @param to - the point where the arc should end
    */
  def arcTo(through: Point, to: Point): Unit = js.native
  /**
    * Draws an arc from the position of the last segment point in the path to the specified point by adding one or more segments to the path.
    * @param to - the point where the arc should end
    * @param clockwise [optional] - specifies whether the arc should be drawn in clockwise direction. default: true
    */
  def arcTo(to: Point): Unit = js.native
  def arcTo(to: Point, clockwise: Boolean): Unit = js.native
  /**
    * Closes the path. When closed, Paper.js connects the first and last segment of the path with an additional curve.
    * @param tolerance [optional] - the maximum distance allowed when merging the first and last locations in the newly closed path. default: 0
    */
  def closePath(): Unit = js.native
  def closePath(tolerance: Double): Unit = js.native
  /**
    * Compares the geometry of two paths to see if they describe the same shape, detecting cases where paths start in different segments or even use different amounts of curves to describe the same shape, as long as their orientation is the same, and their segments and handles really result in the same visual appearance of curves.
    * @param path - the path to compare this path’s geometry with
    */
  def compare(path: PathItem): Boolean = js.native
  /**
    * Adds a cubic bezier curve to the path, from the last segment to the to the specified to vector, with the curve itself defined by two specified handles.
    * @param handle1 - the location of the first handle of the newly added curve
    * @param handle2 - the location of the second handle of the newly added curve
    * @param to - the destination point of the newly added curve
    */
  def cubicCurveBy(handle1: Point, handle2: Point, to: Point): Unit = js.native
  /**
    * Adds a cubic bezier curve to the path, defined by two handles and a to point.
    * @param handle1 - The first control point handle for the curve
    * @param handle2 - The second control point handle for the curve
    * @param to - The end control point of the curve
    */
  def cubicCurveTo(handle1: Point, handle2: Point, to: Point): Unit = js.native
  /**
    * Adds a curve from the last segment in the path through the specified through vector, to the specified to vector, all specified relatively to it by these given vectors, by adding one segment to the path.
    * @param through - the vector through which the curve should pass
    * @param to - the destination vector of the newly added curve
    * @param time [optional] - the curve-time parameter at which the through point is to be located. default: 0.5
    */
  def curveBy(through: Point, to: Point): Unit = js.native
  def curveBy(through: Point, to: Point, time: Double): Unit = js.native
  /**
    * Draws a curve from the position of the last segment point in the path that goes through the specified through point, to the specified to point by adding one segment to the path.
    * @param through - the point through which the curve should go
    * @param to - the point where the curve should end
    * @param time [optional] - the curve-time parameter at which the through point is to be located. default: 0.5
    */
  def curveTo(through: Point, to: Point): Unit = js.native
  def curveTo(through: Point, to: Point, time: Double): Unit = js.native
  /**
    * Splits the geometry of this path along the geometry of the specified path returns the result as a new group item.
    * @param path - the path to divide by
    * @param options [optional] - the boolean operation options. default { insert: true, trace: true }
    * @param options.insert - whether the resulting item should be inserted back into the scene graph, above both paths involved in the operation.
    * @param options.trace - whether the tracing method is used, treating both paths as areas when determining which parts of the paths are to be kept in the result, or whether the first path is only to be split at intersections, keeping the parts of the curves that intersect with the area of the second path.
    */
  def divide(path: PathItem): PathItem = js.native
  def divide(path: PathItem, options: Anon_InsertTrace): PathItem = js.native
  /**
    * Excludes the intersection of the geometry of the specified path with this path's geometry and returns the result as a new group item.
    * @param path - the path to exclude the intersection of
    * @param options [optional] - the boolean operation options. default { insert: true }
    * @param options.insert - whether the resulting item should be inserted back into the scene graph, above both paths involved in the operation.
    */
  def exclude(path: PathItem): PathItem = js.native
  def exclude(path: PathItem, options: Anon_Insert): PathItem = js.native
  /**
    * Flattens the curves in path items to a sequence of straight lines, by subdividing them enough times until the specified maximum error is met.
    * @param flatness [optional] - the maximum error between the flattened lines and the original curves. default: 0.25
    */
  def flatten(): Unit = js.native
  def flatten(flatness: Double): Unit = js.native
  /**
    * Returns all crossings between two PathItem items as an array of CurveLocation objects. CompoundPath items are also supported. Crossings are intersections where the paths actually are crossing each other, as opposed to simply touching.
    * @param path - the other item to find the crossings with
    */
  def getCrossings(path: PathItem): js.Array[CurveLocation] = js.native
  /**
    * Returns all intersections between two PathItem items as an array of CurveLocation objects. CompoundPath items are also supported.
    * @param path - the other item to find the intersections with
    * @param include [optional] - a callback function that can be used to filter out undesired locations right while they are collected. When defined, it shall return true to include a location, false otherwise. — optional
    */
  def getIntersections(path: PathItem): js.Array[CurveLocation] = js.native
  def getIntersections(path: PathItem, include: js.Function1[/* location */ CurveLocation, Boolean]): js.Array[CurveLocation] = js.native
  /**
    * Returns the nearest location on the path item to the specified point.
    * @param point - the point for which we search the nearest location
    */
  def getNearestLocation(point: Point): CurveLocation = js.native
  /**
    * Returns the nearest point on the path item to the specified point.
    * @param point - the point for which we search the nearest point
    */
  def getNearestPoint(point: Point): Point = js.native
  /**
    * Interpolates between the two specified path items and uses the result as the geometry for this path item. The number of children and segments in the two paths involved in the operation should be the same.
    * @param from - the path item defining the geometry when factor is 0
    * @param to - the path item defining the geometry when factor is 1
    * @param factor - the interpolation coefficient, typically between 0 and 1, but extrapolation is possible too
    */
  def interpolate(from: PathItem, to: PathItem, factor: Double): Unit = js.native
  /**
    * Intersects the geometry of the specified path with this path's geometry and returns the result as a new path item.
    * @param path - the path to intersect with
    * @param options [optional] - the boolean operation options. default { insert: true, trace: true }
    * @param options.insert - whether the resulting item should be inserted back into the scene graph, above both paths involved in the operation.
    * @param options.trace - whether the tracing method is used, treating both paths as areas when determining which parts of the paths are to be kept in the result, or whether the first path is only to be split at intersections, keeping the parts of the curves that intersect with the area of the second path.
    */
  def intersect(path: PathItem): PathItem = js.native
  def intersect(path: PathItem, options: Anon_InsertTrace): PathItem = js.native
  /**
    * Adds a segment relative to the last segment point of the path.
    * @param point - the vector which is added to the position of the last segment of the path, to get to the position of the new segment.
    */
  def lineBy(point: Point): Unit = js.native
  /**
    * Draw a line from the current point to the given point
    * @param point - the end point of the line
    */
  def lineTo(point: Point): Unit = js.native
  /**
    * If called on a CompoundPath, a new Path is created as a child and a point is added as its first segment relative to the position of the last segment of the current path.
    * @param to -
    */
  def moveBy(to: Point): Unit = js.native
  /**
    * On a normal empty Path, the point is simply added as the path's first segment. If called on a CompoundPath, a new Path is created as a child and the point is added as its first segment.
    * @param point - the path's first segment
    */
  def moveTo(point: Point): Unit = js.native
  /**
    * Adds a quadratic bezier curve to the path, from the last segment to the specified destination point, with the curve itself defined by the specified handle.
    * Note that Paper.js only stores cubic curves, so the handle is actually converted.
    * @param handle - the handle of the newly added quadratic curve out of which the values for segment.handleOut of the resulting cubic curve’s first segment and segment.handleIn of its second segment are calculated
    * @param to - the destination point of the newly added curve
    */
  def quadraticCurveBy(handle: Point, to: Point): Unit = js.native
  /**
    * Adds a quadratic bezier curve to the path, defined by a handle and a to point.
    * @param handle - The control point for the curve
    * @param to - The end control point of the curve
    */
  def quadraticCurveTo(handle: Point, to: Point): Unit = js.native
  /**
    * Fixes the orientation of the sub-paths of a compound-path, assuming that non of its sub-paths intersect, by reorienting them so that they are of different winding direction than their containing paths, except for disjoint sub-paths, i.e. islands, which are oriented so that they have the same winding direction as the the biggest path.
    * @param nonZero [optional] - controls if the non-zero fill-rule is to be applied, by counting the winding of each nested path and discarding sub-paths that do not contribute to the final result. default: false
    * @param clockwise [optional] - if provided, the orientation of the root paths will be set to the orientation specified by clockwise, otherwise the orientation of the largest root child is used.
    */
  def reorient(): PathItem = js.native
  def reorient(nonZero: Boolean): PathItem = js.native
  def reorient(nonZero: Boolean, clockwise: Boolean): PathItem = js.native
  /**
    * Reverses the orientation of the path item. When called on CompoundPath items, each of the nested paths is reversed. On Path items, the sequence of path.segments is reversed.
    */
  def reverse(): Unit = js.native
  /**
    * Fits a sequence of as few curves as possible through the path’s anchor points, ignoring the path items’s curve-handles, with an allowed maximum error. When called on CompoundPath items, each of the nested paths is simplified. On Path items, the path.segments array is processed and replaced by the resulting sequence of fitted curves.
    * This method can be used to process and simplify the point data received from a mouse or touch device.
    * @param tolerance [optional] - the allowed maximum error when fitting the curves through the segment points. default: 2.5
    */
  def simplify(): Boolean = js.native
  def simplify(tolerance: Double): Boolean = js.native
  /**
    * Smooths the path item without changing the amount of segments in the path or moving the segments’ locations, by smoothing and adjusting the angle and length of the segments’ handles based on the position and distance of neighboring segments.
    * Smoothing works both for open paths and closed paths, and can be applied to the full path, as well as a sub-range of it. If a range is defined using the options.from and options.to properties, only the curve handles inside that range are touched. If one or both limits of the range are specified in negative indices, the indices are wrapped around the end of the curve. That way, a smoothing range in a close path can even wrap around the connection between the last and the first segment.
    * Four different smoothing methods are available:
    *   'continuous' smooths the path item by adjusting its curve handles so that the first and second derivatives of all involved curves are continuous across their boundaries.
    *      This method tends to result in the smoothest results, but does not allow for further parametrization of the handles.
    *   'asymmetric' is based on the same principle as 'continuous' but uses different factors so that the result is asymmetric. This used to the only method available until v0.10.0, and is currently still the default when no method is specified, for reasons of backward compatibility. It will eventually be removed.
    *   'catmull-rom' uses the Catmull-Rom spline to smooth the segment.
    *      The optionally passed factor controls the knot parametrization of the algorithm:
    *        0.0: the standard, uniform Catmull-Rom spline
    *        0.5: the centripetal Catmull-Rom spline, guaranteeing no self-intersections
    *        1.0: the chordal Catmull-Rom spline
    *   'geometric' use a simple heuristic and empiric geometric method to smooth the segment’s handles. The handles were weighted, meaning that big differences in distances between the segments will lead to probably undesired results.
    *      The optionally passed factor defines the tension parameter (0…1), controlling the amount of smoothing as a factor by which to scale each handle.
    * @param options [optional] - default { type:'asymmetric', factor: 0.5 for 'catmull-rom', 0.4 for 'geometric' }
    * @param options.type - the type of smoothing method: ‘continuous’, ‘asymmetric’, ‘catmull-rom’, ‘geometric’ — default: ‘asymmetric’
    * @param options.factor - the factor parameterizing the smoothing method — default: 0.5 for 'catmull-rom', 0.4 for 'geometric'
    * @param options.from - the segment or curve at which to start smoothing, if not the full path shall be smoothed (inclusive). This can either be a segment index, or a segment or curve object that is part of the path. If the passed number is negative, the index is wrapped around the end of the path.
    * @param options.to - the segment or curve to which the handles of the path shall be processed (inclusive). This can either be a segment index, or a segment or curve object that is part of the path. If the passed number is negative, the index is wrapped around the end of the path.
    */
  def smooth(): Unit = js.native
  def smooth(options: Anon_Factor): Unit = js.native
  /**
    * Subtracts the geometry of the specified path from this path's geometry and returns the result as a new path item.
    * @param path - the path to subtract
    * @param options [optional] - the boolean operation options. default { insert: true, trace: true }
    * @param options.insert - whether the resulting item should be inserted back into the scene graph, above both paths involved in the operation.
    * @param options.trace - whether the tracing method is used, treating both paths as areas when determining which parts of the paths are to be kept in the result, or whether the first path is only to be split at intersections, keeping the parts of the curves that intersect with the area of the second path.
    */
  def subtract(path: PathItem): PathItem = js.native
  def subtract(path: PathItem, options: Anon_InsertTrace): PathItem = js.native
  /**
    * Merges the geometry of the specified path from this path's geometry and returns the result as a new path item.
    * @param path - the path to unite with
    * @param options [optional] - the boolean operation options. default { insert: true }
    * @param options.insert - whether the resulting item should be inserted back into the scene graph, above both paths involved in the operation.
    */
  def unite(path: PathItem): PathItem = js.native
  def unite(path: PathItem, options: Anon_Insert): PathItem = js.native
}

/* static members */
@JSGlobal("paper.PathItem")
@js.native
object PathItem extends js.Object {
  /**
    * Creates a path item from the given object, determining if the contained information describes a plain path or a compound-path with multiple sub-paths.
    * @param object - an object containing the properties describing the item to be created
    */
  def create(`object`: js.Any): Path | CompoundPath = js.native
  /**
    * Creates a path item from the given SVG path-data, determining if the data describes a plain path or a compound-path with multiple sub-paths.
    * @param pathData - the SVG path-data to parse
    */
  def create(pathData: String): Path | CompoundPath = js.native
  /**
    * Creates a path item from the given segments array, determining if the array describes a plain path or a compound-path with multiple sub-paths.
    * @param segments - the segments array to parse
    */
  def create(segments: js.Array[_ | Double]): Path | CompoundPath = js.native
}

