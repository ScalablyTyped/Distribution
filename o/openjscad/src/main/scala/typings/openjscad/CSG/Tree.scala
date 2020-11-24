package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree extends js.Object {
  
  def addPolygons(polygons: js.Array[Polygon]): Unit = js.native
  
  def allPolygons(): js.Array[Polygon] = js.native
  
  def clipTo(tree: Tree): Unit = js.native
  def clipTo(tree: Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
  
  def invert(): Unit = js.native
  
  var polygonTree: PolygonTreeNode = js.native
  
  var rootnode: Node = js.native
}
