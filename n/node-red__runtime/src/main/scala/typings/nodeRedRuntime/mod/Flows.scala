package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flows extends StObject {
  
  /** the flow configuration, an array of node configuration objects */
  var flows: js.Array[js.Object]
  
  /** the flow revision identifier */
  var rev: String
}
object Flows {
  
  inline def apply(flows: js.Array[js.Object], rev: String): Flows = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flows] (val x: Self) extends AnyVal {
    
    inline def setFlows(value: js.Array[js.Object]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsVarargs(value: js.Object*): Self = StObject.set(x, "flows", js.Array(value*))
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
