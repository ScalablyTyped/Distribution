package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentOrder extends StObject {
  
  /**
    * A list of identityUserFlowAttribute object identifiers that determine the order in which attributes should be collected
    * within a user flow.
    */
  var order: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object AssignmentOrder {
  
  inline def apply(): AssignmentOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignmentOrder]
  }
  
  extension [Self <: AssignmentOrder](x: Self) {
    
    inline def setOrder(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
