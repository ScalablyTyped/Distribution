package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinksNodes extends StObject {
  
  var links: js.Array[js.Object] = js.native
  
  var nodes: js.Array[js.Object] = js.native
}
object LinksNodes {
  
  @scala.inline
  def apply(links: js.Array[js.Object], nodes: js.Array[js.Object]): LinksNodes = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksNodes]
  }
  
  @scala.inline
  implicit class LinksNodesMutableBuilder[Self <: LinksNodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
