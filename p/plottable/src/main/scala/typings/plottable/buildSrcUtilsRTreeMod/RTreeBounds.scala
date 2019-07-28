package typings.plottable.buildSrcUtilsRTreeMod

import typings.plottable.buildSrcCoreInterfacesMod.Bounds
import typings.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typings.plottable.buildSrcCoreInterfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTree", "RTreeBounds")
@js.native
class RTreeBounds protected () extends js.Object {
  def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
  var areaCached: js.Any = js.native
  var height: Double = js.native
  var width: Double = js.native
  var xh: Double = js.native
  var xl: Double = js.native
  var yh: Double = js.native
  var yl: Double = js.native
  def area(): Double = js.native
  def contains(xy: Point): Boolean = js.native
}

/* static members */
@JSImport("plottable/build/src/utils/rTree", "RTreeBounds")
@js.native
object RTreeBounds extends js.Object {
  /**
    * Returns the orthogonal absolute distance in the x-dimension from point
    * `p` to the farthest edge of `bounds`.
    *
    * If `p.x` is inside the bounds returns `0`.
    */
  def absoluteDistanceToFarEdgeX(bounds: RTreeBounds, p: Point): Double = js.native
  /**
    * Returns the orthogonal absolute distance in the y-dimension from point
    * `p` to the farthest edge of `bounds`.
    *
    * If `p.y` is inside the bounds returns `0`.
    */
  def absoluteDistanceToFarEdgeY(bounds: RTreeBounds, p: Point): Double = js.native
  /**
    * Returns the orthogonal absolute distance in the x-dimension from point
    * `p` to the nearest edge of `bounds`.
    *
    * If `p.x` is inside the bounds returns `0`.
    */
  def absoluteDistanceToNearEdgeX(bounds: RTreeBounds, p: Point): Double = js.native
  /**
    * Returns the orthogonal absolute distance in the y-dimension from point
    * `p` to the nearest edge of `bounds`.
    *
    * If `p.y` is inside the bounds returns `0`.
    */
  def absoluteDistanceToNearEdgeY(bounds: RTreeBounds, p: Point): Double = js.native
  def bounds(bounds: Bounds): RTreeBounds = js.native
  def distanceSquaredToFarEdge(bounds: RTreeBounds, p: Point): Double = js.native
  /**
    * Returns the distance squared from `p` to the nearest edge of `bounds`. If
    * the point touches or is inside the bounds, returns `0`;
    *
    * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
    */
  def distanceSquaredToNearEdge(bounds: RTreeBounds, p: Point): Double = js.native
  def entityBounds(bounds: IEntityBounds): RTreeBounds = js.native
  /**
    * Returns true if `a` overlaps `b` in the x and y axes.
    *
    * Touching counts as overlap.
    */
  def isBoundsOverlapBounds(a: RTreeBounds, b: RTreeBounds): Boolean = js.native
  /**
    * Returns true if `a` overlaps `b` in the x axis only.
    *
    * Touching counts as overlap.
    */
  def isBoundsOverlapX(a: RTreeBounds, b: RTreeBounds): Boolean = js.native
  /**
    * Returns true if `a` overlaps `b` in the y axis only.
    *
    * Touching counts as overlap.
    */
  def isBoundsOverlapY(a: RTreeBounds, b: RTreeBounds): Boolean = js.native
  def pointPair(p0: Point, p1: Point): RTreeBounds = js.native
  def points(points: js.Array[Point]): RTreeBounds = js.native
  def union(b0: RTreeBounds, b1: RTreeBounds): RTreeBounds = js.native
  def unionAll(bounds: js.Array[RTreeBounds]): RTreeBounds = js.native
  def xywh(x: Double, y: Double, w: Double, h: Double): RTreeBounds = js.native
}

