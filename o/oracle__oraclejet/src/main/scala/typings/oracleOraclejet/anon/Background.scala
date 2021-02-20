package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Background extends StObject {
  
  var background: DragEnter = js.native
  
  var links: DragEnter = js.native
  
  var nodes: DragEnter = js.native
  
  var ports: DragLeave = js.native
}
object Background {
  
  @scala.inline
  def apply(background: DragEnter, links: DragEnter, nodes: DragEnter, ports: DragLeave): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: DragEnter): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: DragEnter): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: DragEnter): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: DragLeave): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
