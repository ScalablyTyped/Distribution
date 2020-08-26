package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
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
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddPolygonTreeNodes(value: js.Array[PolygonTreeNode] => Unit): Self = this.set("addPolygonTreeNodes", js.Any.fromFunction1(value))
    @scala.inline
    def setBack(value: js.Any): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def setClipPolygons(value: (js.Array[PolygonTreeNode], Boolean) => Unit): Self = this.set("clipPolygons", js.Any.fromFunction2(value))
    @scala.inline
    def setClipTo(value: (Tree, Boolean) => Unit): Self = this.set("clipTo", js.Any.fromFunction2(value))
    @scala.inline
    def setFront(value: js.Any): Self = this.set("front", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetParentPlaneNormals(value: (js.Array[Vector3D], Double) => Unit): Self = this.set("getParentPlaneNormals", js.Any.fromFunction2(value))
    @scala.inline
    def setInvert(value: () => Unit): Self = this.set("invert", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: Node): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlane(value: Plane): Self = this.set("plane", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygontreenodesVarargs(value: PolygonTreeNode*): Self = this.set("polygontreenodes", js.Array(value :_*))
    @scala.inline
    def setPolygontreenodes(value: js.Array[PolygonTreeNode]): Self = this.set("polygontreenodes", value.asInstanceOf[js.Any])
  }
  
}

