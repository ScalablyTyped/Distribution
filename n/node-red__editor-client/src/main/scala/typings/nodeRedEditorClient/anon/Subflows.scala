package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subflows extends StObject {
  
  var links: js.Array[js.Object] = js.native
  
  var nodes: js.Array[js.Object] = js.native
  
  var subflows: js.Array[js.Object] = js.native
}
object Subflows {
  
  @scala.inline
  def apply(links: js.Array[js.Object], nodes: js.Array[js.Object], subflows: js.Array[js.Object]): Subflows = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], subflows = subflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subflows]
  }
  
  @scala.inline
  implicit class SubflowsMutableBuilder[Self <: Subflows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value :_*))
  }
}
