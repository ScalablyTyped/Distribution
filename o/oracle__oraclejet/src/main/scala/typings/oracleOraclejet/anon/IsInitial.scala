package typings.oracleOraclejet.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInitial extends StObject {
  
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
  implicit class IsInitialMutableBuilder[Self <: IsInitial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsInitial(value: Boolean): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewViewModel(value: js.Object): Self = StObject.set(x, "newViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldViewModel(value: js.Object): Self = StObject.set(x, "oldViewModel", value.asInstanceOf[js.Any])
  }
}
