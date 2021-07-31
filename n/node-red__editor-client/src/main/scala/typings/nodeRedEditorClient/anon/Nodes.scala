package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.addToGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: addToGroup
}
object Nodes {
  
  @scala.inline
  def apply(): Nodes = {
    val __obj = js.Dynamic.literal(t = "addToGroup")
    __obj.asInstanceOf[Nodes]
  }
  
  @scala.inline
  implicit class NodesMutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setT(value: addToGroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
