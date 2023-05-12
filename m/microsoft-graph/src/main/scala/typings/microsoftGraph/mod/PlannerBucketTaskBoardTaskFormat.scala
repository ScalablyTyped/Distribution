package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerBucketTaskBoardTaskFormat
  extends StObject
     with Entity {
  
  /**
    * Hint used to order tasks in the bucket view of the task board. For details about the supported format, see Using order
    * hints in Planner.
    */
  var orderHint: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerBucketTaskBoardTaskFormat {
  
  inline def apply(): PlannerBucketTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerBucketTaskBoardTaskFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerBucketTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    
    inline def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
  }
}
