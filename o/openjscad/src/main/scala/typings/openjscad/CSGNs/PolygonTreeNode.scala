package typings.openjscad.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.PolygonTreeNode")
@js.native
class PolygonTreeNode () extends js.Object {
  var children: js.Any = js.native
  var parent: js.Any = js.native
  var polygon: Polygon = js.native
  var removed: Boolean = js.native
  def _splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
  def addChild(polygon: Polygon): PolygonTreeNode = js.native
  def addPolygons(polygons: js.Any): Unit = js.native
  def getPolygon(): Polygon = js.native
  def getPolygons(result: js.Array[Polygon]): Unit = js.native
  def invert(): Unit = js.native
  def invertSub(): Unit = js.native
  def isRemoved(): Boolean = js.native
  def isRootNode(): Boolean = js.native
  def recursivelyInvalidatePolygon(): Unit = js.native
  def remove(): Unit = js.native
  def splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
}

