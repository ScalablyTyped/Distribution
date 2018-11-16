package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.PolygonTreeNode")
@js.native
class PolygonTreeNode () extends js.Object {
  var children: js.Any = js.native
  var parent: js.Any = js.native
  var polygon: Polygon = js.native
  var removed: scala.Boolean = js.native
  def _splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): scala.Unit = js.native
  def addChild(polygon: Polygon): PolygonTreeNode = js.native
  def addPolygons(polygons: js.Any): scala.Unit = js.native
  def getPolygon(): Polygon = js.native
  def getPolygons(result: js.Array[Polygon]): scala.Unit = js.native
  def invert(): scala.Unit = js.native
  def invertSub(): scala.Unit = js.native
  def isRemoved(): scala.Boolean = js.native
  def isRootNode(): scala.Boolean = js.native
  def recursivelyInvalidatePolygon(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): scala.Unit = js.native
}

