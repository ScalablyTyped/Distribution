package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.removeFromGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesT extends StObject {
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: removeFromGroup
}
object NodesT {
  
  @scala.inline
  def apply(): NodesT = {
    val __obj = js.Dynamic.literal(t = "removeFromGroup")
    __obj.asInstanceOf[NodesT]
  }
  
  @scala.inline
  implicit class NodesTMutableBuilder[Self <: NodesT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setT(value: removeFromGroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
