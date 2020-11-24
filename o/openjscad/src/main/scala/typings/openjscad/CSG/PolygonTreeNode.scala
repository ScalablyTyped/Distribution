package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonTreeNode extends js.Object {
  
  def _splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
  
  def addChild(polygon: Polygon): PolygonTreeNode = js.native
  
  def addPolygons(polygons: js.Any): Unit = js.native
  
  var children: js.Any = js.native
  
  def getPolygon(): Polygon = js.native
  
  def getPolygons(result: js.Array[Polygon]): Unit = js.native
  
  def invert(): Unit = js.native
  
  def invertSub(): Unit = js.native
  
  def isRemoved(): Boolean = js.native
  
  def isRootNode(): Boolean = js.native
  
  var parent: js.Any = js.native
  
  var polygon: Polygon = js.native
  
  def recursivelyInvalidatePolygon(): Unit = js.native
  
  def remove(): Unit = js.native
  
  var removed: Boolean = js.native
  
  def splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
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
  
  @scala.inline
  implicit class PolygonTreeNodeOps[Self <: PolygonTreeNode] (val x: Self) extends AnyVal {
    
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
    def set_splitByPlane(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = this.set("_splitByPlane", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddChild(value: Polygon => PolygonTreeNode): Self = this.set("addChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPolygons(value: js.Any => Unit): Self = this.set("addPolygons", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPolygon(value: () => Polygon): Self = this.set("getPolygon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPolygons(value: js.Array[Polygon] => Unit): Self = this.set("getPolygons", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvert(value: () => Unit): Self = this.set("invert", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvertSub(value: () => Unit): Self = this.set("invertSub", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRemoved(value: () => Boolean): Self = this.set("isRemoved", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRootNode(value: () => Boolean): Self = this.set("isRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon(value: Polygon): Self = this.set("polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursivelyInvalidatePolygon(value: () => Unit): Self = this.set("recursivelyInvalidatePolygon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitByPlane(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = this.set("splitByPlane", js.Any.fromFunction5(value))
  }
}
