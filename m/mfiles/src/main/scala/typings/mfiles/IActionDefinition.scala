package typings.mfiles

import typings.mfiles.MFiles.MFActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionDefinition extends StObject {
  
  var ActionCreateSeparateAssignment: IActionCreateAssignment
  
  val ActionType: MFActionType
  
  def Clear(): Unit
  
  def Clone(): IActionDefinition
}
object IActionDefinition {
  
  inline def apply(
    ActionCreateSeparateAssignment: IActionCreateAssignment,
    ActionType: MFActionType,
    Clear: () => Unit,
    Clone: () => IActionDefinition
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal(ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone))
    __obj.asInstanceOf[IActionDefinition]
  }
  
  extension [Self <: IActionDefinition](x: Self) {
    
    inline def setActionCreateSeparateAssignment(value: IActionCreateAssignment): Self = StObject.set(x, "ActionCreateSeparateAssignment", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: MFActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setClone(value: () => IActionDefinition): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
  }
}
