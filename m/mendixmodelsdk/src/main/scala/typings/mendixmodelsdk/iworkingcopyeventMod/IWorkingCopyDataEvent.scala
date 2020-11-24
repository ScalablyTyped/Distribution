package typings.mendixmodelsdk.iworkingcopyeventMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.workingCopyData
import typings.mendixmodelsdk.transportInterfacesMod.IWorkingCopy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkingCopyDataEvent extends IWorkingCopyEvent {
  
  var data: IWorkingCopy = js.native
  
  var `type`: workingCopyData = js.native
}
object IWorkingCopyDataEvent {
  
  @scala.inline
  def apply(data: IWorkingCopy, `type`: workingCopyData): IWorkingCopyDataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyDataEvent]
  }
  
  @scala.inline
  implicit class IWorkingCopyDataEventOps[Self <: IWorkingCopyDataEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: IWorkingCopy): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: workingCopyData): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
