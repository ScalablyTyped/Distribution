package typings.plottable.buildSrcUtilsRTreeMod

import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcUtilsRTreeSplitStrategiesMod.IRTreeSplitStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTree", "RTree")
@js.native
class RTree[T] () extends js.Object {
  def this(maxNodeChildren: Double) = this()
  def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
  var maxNodeChildren: js.Any = js.native
  var root: js.Any = js.native
  var size: js.Any = js.native
  var splitStrategy: js.Any = js.native
  def clear(): Unit = js.native
  def getRoot(): RTreeNode[T] = js.native
  def insert(bounds: RTreeBounds, value: T): RTreeNode[T] = js.native
  def intersect(bounds: RTreeBounds): js.Array[T] = js.native
  def intersectX(bounds: RTreeBounds): js.Array[T] = js.native
  def intersectY(bounds: RTreeBounds): js.Array[T] = js.native
  def locate(xy: Point): js.Array[T] = js.native
  /**
    * Returns an array of `T` values that are the "nearest" to the query point.
    *
    * Nearness is measured as the absolute distance from the query point to the
    * nearest edge of the node bounds. If the node bounds contains the query
    * point, the distance is 0.
    */
  def locateNearest(xy: Point): js.Array[T] = js.native
  /**
    * Returns an array of `T` values that are the "nearest" to the query point.
    *
    * Nearness is measured as the 1-dimensional absolute distance from the
    * query's x point to the nearest edge of the node bounds. If the node
    * bounds contains the query point, the distance is 0.
    *
    * The results are sorted by y-coordinate nearness.
    */
  def locateNearestX(xy: Point): js.Array[T] = js.native
  /**
    * Returns an array of `T` values that are the "nearest" to the query point.
    *
    * Nearness is measured as the 1-dimensional absolute distance from the
    * query's y point to the nearest edge of the node bounds. If the node
    * bounds contains the query point, the distance is 0.
    *
    * The results are sorted by x-coordinate nearness.
    */
  def locateNearestY(xy: Point): js.Array[T] = js.native
  def query(predicate: js.Function1[/* b */ RTreeBounds, Boolean]): js.Array[T] = js.native
  def queryNodes(predicate: js.Function1[/* b */ RTreeNode[T], QueryPredicateResult]): js.Array[RTreeNode[T]] = js.native
}

