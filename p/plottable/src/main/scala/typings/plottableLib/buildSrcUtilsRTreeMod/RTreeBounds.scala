package typings
package plottableLib.buildSrcUtilsRTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTree", "RTreeBounds")
@js.native
class RTreeBounds protected () extends js.Object {
  def this(xl: scala.Double, yl: scala.Double, xh: scala.Double, yh: scala.Double) = this()
  var areaCached: js.Any = js.native
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  var xh: scala.Double = js.native
  var xl: scala.Double = js.native
  var yh: scala.Double = js.native
  var yl: scala.Double = js.native
  def area(): scala.Double = js.native
  def contains(xy: plottableLib.buildSrcCoreInterfacesMod.Point): scala.Boolean = js.native
}

@JSImport("plottable/build/src/utils/rTree", "RTreeBounds")
@js.native
object RTreeBounds extends js.Object {
  /**
       * Returns the orthogonal absolute distance in the x-dimension from point
       * `p` to the farthest edge of `bounds`.
       *
       * If `p.x` is inside the bounds returns `0`.
       */
  def absoluteDistanceToFarEdgeX(
    bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    p: plottableLib.buildSrcCoreInterfacesMod.Point
  ): scala.Double = js.native
  /**
       * Returns the orthogonal absolute distance in the y-dimension from point
       * `p` to the farthest edge of `bounds`.
       *
       * If `p.y` is inside the bounds returns `0`.
       */
  def absoluteDistanceToFarEdgeY(
    bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    p: plottableLib.buildSrcCoreInterfacesMod.Point
  ): scala.Double = js.native
  /**
       * Returns the orthogonal absolute distance in the x-dimension from point
       * `p` to the nearest edge of `bounds`.
       *
       * If `p.x` is inside the bounds returns `0`.
       */
  def absoluteDistanceToNearEdgeX(
    bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    p: plottableLib.buildSrcCoreInterfacesMod.Point
  ): scala.Double = js.native
  /**
       * Returns the orthogonal absolute distance in the y-dimension from point
       * `p` to the nearest edge of `bounds`.
       *
       * If `p.y` is inside the bounds returns `0`.
       */
  def absoluteDistanceToNearEdgeY(
    bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    p: plottableLib.buildSrcCoreInterfacesMod.Point
  ): scala.Double = js.native
  def bounds(bounds: plottableLib.buildSrcCoreInterfacesMod.Bounds): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  def distanceSquaredToFarEdge(
    bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    p: plottableLib.buildSrcCoreInterfacesMod.Point
  ): scala.Double = js.native
  /**
       * Returns the distance squared from `p` to the nearest edge of `bounds`. If
       * the point touches or is inside the bounds, returns `0`;
       *
       * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
       */
  def distanceSquaredToNearEdge(
    bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    p: plottableLib.buildSrcCoreInterfacesMod.Point
  ): scala.Double = js.native
  def entityBounds(bounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  /**
       * Returns true if `a` overlaps `b` in the x and y axes.
       *
       * Touching counts as overlap.
       */
  def isBoundsOverlapBounds(
    a: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    b: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
  ): scala.Boolean = js.native
  /**
       * Returns true if `a` overlaps `b` in the x axis only.
       *
       * Touching counts as overlap.
       */
  def isBoundsOverlapX(
    a: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    b: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
  ): scala.Boolean = js.native
  /**
       * Returns true if `a` overlaps `b` in the y axis only.
       *
       * Touching counts as overlap.
       */
  def isBoundsOverlapY(
    a: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    b: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
  ): scala.Boolean = js.native
  def pointPair(p0: plottableLib.buildSrcCoreInterfacesMod.Point, p1: plottableLib.buildSrcCoreInterfacesMod.Point): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  def points(points: js.Array[plottableLib.buildSrcCoreInterfacesMod.Point]): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  def union(
    b0: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
    b1: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
  ): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  def unionAll(bounds: js.Array[plottableLib.buildSrcUtilsRTreeMod.RTreeBounds]): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  def xywh(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
}

