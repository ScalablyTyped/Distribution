package typings.nivoGenerators.anon

import typings.nivoGenerators.distTypesNetworkMod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  var links: js.Array[Link]
  
  var nodes: js.Array[Color]
}
object Links {
  
  inline def apply(links: js.Array[Link], nodes: js.Array[Color]): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNodes(value: js.Array[Color]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Color*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
