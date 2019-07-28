package typings.openjscad.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Node")
@js.native
class Node protected () extends js.Object {
  def this(parent: Node) = this()
  var back: js.Any = js.native
  var front: js.Any = js.native
  var parent: Node = js.native
  var plane: Plane = js.native
  var polygontreenodes: js.Array[PolygonTreeNode] = js.native
  def addPolygonTreeNodes(polygontreenodes: js.Array[PolygonTreeNode]): Unit = js.native
  def clipPolygons(polygontreenodes: js.Array[PolygonTreeNode], alsoRemovecoplanarFront: Boolean): Unit = js.native
  def clipTo(tree: Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
  def getParentPlaneNormals(normals: js.Array[Vector3D], maxdepth: Double): Unit = js.native
  def invert(): Unit = js.native
}

