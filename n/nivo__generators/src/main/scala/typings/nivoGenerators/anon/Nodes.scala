package typings.nivoGenerators.anon

import typings.nivoGenerators.sankeyMod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var links: js.Array[Link]
  
  var nodes: js.Array[NodeColor]
}
object Nodes {
  
  inline def apply(links: js.Array[Link], nodes: js.Array[NodeColor]): Nodes = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  extension [Self <: Nodes](x: Self) {
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNodes(value: js.Array[NodeColor]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeColor*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
