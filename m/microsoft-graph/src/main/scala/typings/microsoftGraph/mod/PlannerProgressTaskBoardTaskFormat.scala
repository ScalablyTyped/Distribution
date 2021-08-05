package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerProgressTaskBoardTaskFormat
  extends StObject
     with Entity {
  
  // Hint value used to order the task on the Progress view of the Task Board. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.undefined
}
object PlannerProgressTaskBoardTaskFormat {
  
  inline def apply(): PlannerProgressTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerProgressTaskBoardTaskFormat]
  }
  
  extension [Self <: PlannerProgressTaskBoardTaskFormat](x: Self) {
    
    inline def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
  }
}
