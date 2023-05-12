package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var nodes: js.Array[Double]
}
object Nodes {
  
  inline def apply(nodes: js.Array[Double]): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[Double]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Double*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
