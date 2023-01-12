package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: DragEnter
  
  var links: DragEnter
  
  var nodes: DragEnter
  
  var ports: DragLeave
}
object Background {
  
  inline def apply(background: DragEnter, links: DragEnter, nodes: DragEnter, ports: DragLeave): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: DragEnter): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: DragEnter): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: DragEnter): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: DragLeave): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
