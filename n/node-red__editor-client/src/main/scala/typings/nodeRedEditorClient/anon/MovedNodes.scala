package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.deleteSubflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovedNodes extends StObject {
  
  var createdLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var movedNodes: js.UndefOr[js.Array[js.Object]] = js.native
  
  var subflow: js.UndefOr[js.Object] = js.native
  
  var subflows: js.UndefOr[js.Array[js.Object]] = js.native
  
  var t: deleteSubflow = js.native
}
object MovedNodes {
  
  @scala.inline
  def apply(t: deleteSubflow): MovedNodes = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovedNodes]
  }
  
  @scala.inline
  implicit class MovedNodesMutableBuilder[Self <: MovedNodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "createdLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedLinksUndefined: Self = StObject.set(x, "createdLinks", js.undefined)
    
    @scala.inline
    def setCreatedLinksVarargs(value: js.Object*): Self = StObject.set(x, "createdLinks", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setMovedNodes(value: js.Array[js.Object]): Self = StObject.set(x, "movedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovedNodesUndefined: Self = StObject.set(x, "movedNodes", js.undefined)
    
    @scala.inline
    def setMovedNodesVarargs(value: js.Object*): Self = StObject.set(x, "movedNodes", js.Array(value :_*))
    
    @scala.inline
    def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowUndefined: Self = StObject.set(x, "subflow", js.undefined)
    
    @scala.inline
    def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowsUndefined: Self = StObject.set(x, "subflows", js.undefined)
    
    @scala.inline
    def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value :_*))
    
    @scala.inline
    def setT(value: deleteSubflow): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
