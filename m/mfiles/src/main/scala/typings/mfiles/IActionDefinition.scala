package typings.mfiles

import typings.mfiles.MFiles.MFActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionDefinition extends js.Object {
  
  var ActionCreateSeparateAssignment: IActionCreateAssignment = js.native
  
  val ActionType: MFActionType = js.native
  
  def Clear(): Unit = js.native
  
  def Clone(): IActionDefinition = js.native
}
object IActionDefinition {
  
  @scala.inline
  def apply(
    ActionCreateSeparateAssignment: IActionCreateAssignment,
    ActionType: MFActionType,
    Clear: () => Unit,
    Clone: () => IActionDefinition
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal(ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone))
    __obj.asInstanceOf[IActionDefinition]
  }
  
  @scala.inline
  implicit class IActionDefinitionOps[Self <: IActionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionCreateSeparateAssignment(value: IActionCreateAssignment): Self = this.set("ActionCreateSeparateAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionType(value: MFActionType): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone(value: () => IActionDefinition): Self = this.set("Clone", js.Any.fromFunction0(value))
  }
}
