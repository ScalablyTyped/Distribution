package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nodes extends StObject {
  
  var nodes: DataTypes = js.native
  
  var ports: DragEnd = js.native
}
object Nodes {
  
  @scala.inline
  def apply(nodes: DataTypes, ports: DragEnd): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  @scala.inline
  implicit class NodesMutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: DataTypes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: DragEnd): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
