package typings.mendixmodelsdk.iworkingcopyeventMod

import typings.mendixmodelsdk.anon.EventId
import typings.mendixmodelsdk.mendixmodelsdkStrings.buildResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBuildResultEvent extends IWorkingCopyEvent {
  
  var data: EventId = js.native
  
  var `type`: buildResult = js.native
}
object IBuildResultEvent {
  
  @scala.inline
  def apply(data: EventId, `type`: buildResult): IBuildResultEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuildResultEvent]
  }
  
  @scala.inline
  implicit class IBuildResultEventOps[Self <: IBuildResultEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: EventId): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: buildResult): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
