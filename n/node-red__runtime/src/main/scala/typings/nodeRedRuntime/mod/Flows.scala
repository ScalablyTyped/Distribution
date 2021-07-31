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
  
  @scala.inline
  def apply(flows: js.Array[js.Object], rev: String): Flows = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flows]
  }
  
  @scala.inline
  implicit class FlowsMutableBuilder[Self <: Flows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlows(value: js.Array[js.Object]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowsVarargs(value: js.Object*): Self = StObject.set(x, "flows", js.Array(value :_*))
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
