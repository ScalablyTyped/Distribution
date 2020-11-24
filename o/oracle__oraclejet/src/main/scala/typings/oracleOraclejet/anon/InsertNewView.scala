package typings.oracleOraclejet.anon

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertNewView extends js.Object {
  
  def insertNewView(): js.UndefOr[scala.Nothing] = js.native
  
  var isInitial: Boolean = js.native
  
  var newViewModel: js.Object = js.native
  
  var newViewParent: Node = js.native
  
  var node: Node = js.native
  
  var oldDomNodes: js.Array[_] = js.native
  
  var oldViewModel: js.Object = js.native
  
  var oldViewParent: Node = js.native
  
  def removeOldView(): js.UndefOr[scala.Nothing] = js.native
}
object InsertNewView {
  
  @scala.inline
  def apply(
    insertNewView: () => js.UndefOr[scala.Nothing],
    isInitial: Boolean,
    newViewModel: js.Object,
    newViewParent: Node,
    node: Node,
    oldDomNodes: js.Array[_],
    oldViewModel: js.Object,
    oldViewParent: Node,
    removeOldView: () => js.UndefOr[scala.Nothing]
  ): InsertNewView = {
    val __obj = js.Dynamic.literal(insertNewView = js.Any.fromFunction0(insertNewView), isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], newViewParent = newViewParent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldDomNodes = oldDomNodes.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any], oldViewParent = oldViewParent.asInstanceOf[js.Any], removeOldView = js.Any.fromFunction0(removeOldView))
    __obj.asInstanceOf[InsertNewView]
  }
  
  @scala.inline
  implicit class InsertNewViewOps[Self <: InsertNewView] (val x: Self) extends AnyVal {
    
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
    def setInsertNewView(value: () => js.UndefOr[scala.Nothing]): Self = this.set("insertNewView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInitial(value: Boolean): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewViewModel(value: js.Object): Self = this.set("newViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewViewParent(value: Node): Self = this.set("newViewParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldDomNodesVarargs(value: js.Any*): Self = this.set("oldDomNodes", js.Array(value :_*))
    
    @scala.inline
    def setOldDomNodes(value: js.Array[_]): Self = this.set("oldDomNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldViewModel(value: js.Object): Self = this.set("oldViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldViewParent(value: Node): Self = this.set("oldViewParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveOldView(value: () => js.UndefOr[scala.Nothing]): Self = this.set("removeOldView", js.Any.fromFunction0(value))
  }
}
