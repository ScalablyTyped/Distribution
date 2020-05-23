package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonTreeNode extends js.Object {
  var children: js.Any
  var parent: js.Any
  var polygon: Polygon
  var removed: Boolean
  def _splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit
  def addChild(polygon: Polygon): PolygonTreeNode
  def addPolygons(polygons: js.Any): Unit
  def getPolygon(): Polygon
  def getPolygons(result: js.Array[Polygon]): Unit
  def invert(): Unit
  def invertSub(): Unit
  def isRemoved(): Boolean
  def isRootNode(): Boolean
  def recursivelyInvalidatePolygon(): Unit
  def remove(): Unit
  def splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit
}

object PolygonTreeNode {
  @scala.inline
  def apply(
    _splitByPlane: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    addChild: Polygon => PolygonTreeNode,
    addPolygons: js.Any => Unit,
    children: js.Any,
    getPolygon: () => Polygon,
    getPolygons: js.Array[Polygon] => Unit,
    invert: () => Unit,
    invertSub: () => Unit,
    isRemoved: () => Boolean,
    isRootNode: () => Boolean,
    parent: js.Any,
    polygon: Polygon,
    recursivelyInvalidatePolygon: () => Unit,
    remove: () => Unit,
    removed: Boolean,
    splitByPlane: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit
  ): PolygonTreeNode = {
    val __obj = js.Dynamic.literal(_splitByPlane = js.Any.fromFunction5(_splitByPlane), addChild = js.Any.fromFunction1(addChild), addPolygons = js.Any.fromFunction1(addPolygons), children = children.asInstanceOf[js.Any], getPolygon = js.Any.fromFunction0(getPolygon), getPolygons = js.Any.fromFunction1(getPolygons), invert = js.Any.fromFunction0(invert), invertSub = js.Any.fromFunction0(invertSub), isRemoved = js.Any.fromFunction0(isRemoved), isRootNode = js.Any.fromFunction0(isRootNode), parent = parent.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], recursivelyInvalidatePolygon = js.Any.fromFunction0(recursivelyInvalidatePolygon), remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], splitByPlane = js.Any.fromFunction5(splitByPlane))
    __obj.asInstanceOf[PolygonTreeNode]
  }
}

