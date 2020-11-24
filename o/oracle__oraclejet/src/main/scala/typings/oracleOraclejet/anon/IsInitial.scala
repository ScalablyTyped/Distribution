package typings.oracleOraclejet.anon

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInitial extends js.Object {
  
  var isInitial: Boolean = js.native
  
  var newViewModel: js.Object = js.native
  
  var node: Node = js.native
  
  var oldViewModel: js.Object = js.native
}
object IsInitial {
  
  @scala.inline
  def apply(isInitial: Boolean, newViewModel: js.Object, node: Node, oldViewModel: js.Object): IsInitial = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInitial]
  }
  
  @scala.inline
  implicit class IsInitialOps[Self <: IsInitial] (val x: Self) extends AnyVal {
    
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
    def setIsInitial(value: Boolean): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewViewModel(value: js.Object): Self = this.set("newViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldViewModel(value: js.Object): Self = this.set("oldViewModel", value.asInstanceOf[js.Any])
  }
}
