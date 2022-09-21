package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Approval
  extends StObject
     with Entity {
  
  // A collection of stages in the approval decision.
  var stages: js.UndefOr[NullableOption[js.Array[ApprovalStage]]] = js.undefined
}
object Approval {
  
  inline def apply(): Approval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Approval]
  }
  
  extension [Self <: Approval](x: Self) {
    
    inline def setStages(value: NullableOption[js.Array[ApprovalStage]]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesNull: Self = StObject.set(x, "stages", null)
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: ApprovalStage*): Self = StObject.set(x, "stages", js.Array(value*))
  }
}
