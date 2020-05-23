package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var back: js.Any
  var front: js.Any
  var parent: Node
  var plane: Plane
  var polygontreenodes: js.Array[PolygonTreeNode]
  def addPolygonTreeNodes(polygontreenodes: js.Array[PolygonTreeNode]): Unit
  def clipPolygons(polygontreenodes: js.Array[PolygonTreeNode], alsoRemovecoplanarFront: Boolean): Unit
  def clipTo(tree: Tree, alsoRemovecoplanarFront: Boolean): Unit
  def getParentPlaneNormals(normals: js.Array[Vector3D], maxdepth: Double): Unit
  def invert(): Unit
}

object Node {
  @scala.inline
  def apply(
    addPolygonTreeNodes: js.Array[PolygonTreeNode] => Unit,
    back: js.Any,
    clipPolygons: (js.Array[PolygonTreeNode], Boolean) => Unit,
    clipTo: (Tree, Boolean) => Unit,
    front: js.Any,
    getParentPlaneNormals: (js.Array[Vector3D], Double) => Unit,
    invert: () => Unit,
    parent: Node,
    plane: Plane,
    polygontreenodes: js.Array[PolygonTreeNode]
  ): Node = {
    val __obj = js.Dynamic.literal(addPolygonTreeNodes = js.Any.fromFunction1(addPolygonTreeNodes), back = back.asInstanceOf[js.Any], clipPolygons = js.Any.fromFunction2(clipPolygons), clipTo = js.Any.fromFunction2(clipTo), front = front.asInstanceOf[js.Any], getParentPlaneNormals = js.Any.fromFunction2(getParentPlaneNormals), invert = js.Any.fromFunction0(invert), parent = parent.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], polygontreenodes = polygontreenodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

