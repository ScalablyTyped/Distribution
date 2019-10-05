package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Tree")
@js.native
class Tree protected () extends js.Object {
  def this(polygons: js.Array[Polygon]) = this()
  var polygonTree: PolygonTreeNode = js.native
  var rootnode: Node = js.native
  def addPolygons(polygons: js.Array[Polygon]): Unit = js.native
  def allPolygons(): js.Array[Polygon] = js.native
  def clipTo(tree: Tree): Unit = js.native
  def clipTo(tree: Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
  def invert(): Unit = js.native
}

