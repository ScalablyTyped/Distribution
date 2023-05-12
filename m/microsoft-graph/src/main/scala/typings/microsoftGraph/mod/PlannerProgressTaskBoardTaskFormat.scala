package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerProgressTaskBoardTaskFormat
  extends StObject
     with Entity {
  
  /**
    * Hint value used to order the task on the progress view of the task board. For details about the supported format, see
    * Using order hints in Planner.
    */
  var orderHint: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerProgressTaskBoardTaskFormat {
  
  inline def apply(): PlannerProgressTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerProgressTaskBoardTaskFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerProgressTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    
    inline def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
  }
}
