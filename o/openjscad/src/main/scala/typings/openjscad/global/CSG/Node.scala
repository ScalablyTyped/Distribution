package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Node")
@js.native
class Node protected ()
  extends typings.openjscad.CSG.Node {
  def this(parent: typings.openjscad.CSG.Node) = this()
  /* CompleteClass */
  override var back: js.Any = js.native
  /* CompleteClass */
  override var front: js.Any = js.native
  /* CompleteClass */
  override var parent: typings.openjscad.CSG.Node = js.native
  /* CompleteClass */
  override var plane: typings.openjscad.CSG.Plane = js.native
  /* CompleteClass */
  override var polygontreenodes: js.Array[typings.openjscad.CSG.PolygonTreeNode] = js.native
  /* CompleteClass */
  override def addPolygonTreeNodes(polygontreenodes: js.Array[typings.openjscad.CSG.PolygonTreeNode]): Unit = js.native
  /* CompleteClass */
  override def clipPolygons(
    polygontreenodes: js.Array[typings.openjscad.CSG.PolygonTreeNode],
    alsoRemovecoplanarFront: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def clipTo(tree: typings.openjscad.CSG.Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
  /* CompleteClass */
  override def getParentPlaneNormals(normals: js.Array[typings.openjscad.CSG.Vector3D], maxdepth: Double): Unit = js.native
  /* CompleteClass */
  override def invert(): Unit = js.native
}

