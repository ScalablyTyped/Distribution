package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPlan extends StObject {
  
  /** The nodes in the query plan. Plan nodes are returned in pre-order starting with the plan root. Each PlanNode's `id` corresponds to its index in `plan_nodes`. */
  var planNodes: js.UndefOr[js.Array[PlanNode]] = js.undefined
}
object QueryPlan {
  
  inline def apply(): QueryPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryPlan]
  }
  
  extension [Self <: QueryPlan](x: Self) {
    
    inline def setPlanNodes(value: js.Array[PlanNode]): Self = StObject.set(x, "planNodes", value.asInstanceOf[js.Any])
    
    inline def setPlanNodesUndefined: Self = StObject.set(x, "planNodes", js.undefined)
    
    inline def setPlanNodesVarargs(value: PlanNode*): Self = StObject.set(x, "planNodes", js.Array(value*))
  }
}
