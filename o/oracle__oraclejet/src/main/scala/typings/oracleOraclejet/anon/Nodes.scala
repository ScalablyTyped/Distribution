package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var nodes: DataTypes
  
  var ports: DragEnd
}
object Nodes {
  
  inline def apply(nodes: DataTypes, ports: DragEnd): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  extension [Self <: Nodes](x: Self) {
    
    inline def setNodes(value: DataTypes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: DragEnd): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
