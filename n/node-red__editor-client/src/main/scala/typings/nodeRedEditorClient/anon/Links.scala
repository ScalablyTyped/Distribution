package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.createSubflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Links extends StObject {
  
  var links: js.UndefOr[js.Array[js.Object]] = js.native
  
  var nodes: js.UndefOr[js.Array[js.Object]] = js.native
  
  var removedLinks: js.UndefOr[js.Array[js.Object]] = js.native
  
  var subflow: js.Object = js.native
  
  var t: createSubflow = js.native
}
object Links {
  
  @scala.inline
  def apply(subflow: js.Object, t: createSubflow): Links = {
    val __obj = js.Dynamic.literal(subflow = subflow.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit class LinksMutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setRemovedLinks(value: js.Array[js.Object]): Self = StObject.set(x, "removedLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedLinksUndefined: Self = StObject.set(x, "removedLinks", js.undefined)
    
    @scala.inline
    def setRemovedLinksVarargs(value: js.Object*): Self = StObject.set(x, "removedLinks", js.Array(value :_*))
    
    @scala.inline
    def setSubflow(value: js.Object): Self = StObject.set(x, "subflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: createSubflow): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
