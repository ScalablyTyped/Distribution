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
  
  inline def apply(): Nodes = {
    val __obj = js.Dynamic.literal(t = "addToGroup")
    __obj.asInstanceOf[Nodes]
  }
  
  extension [Self <: Nodes](x: Self) {
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setT(value: addToGroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
