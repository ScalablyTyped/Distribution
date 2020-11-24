package typings.mfiles

import typings.mfiles.MFiles.MFEventHandlerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventHandler extends js.Object {
  
  var Active: Boolean = js.native
  
  def Clone(): IEventHandler = js.native
  
  var Description: String = js.native
  
  var EventType: MFEventHandlerType = js.native
  
  val GUID: String = js.native
  
  def GetID(): Double = js.native
  
  var VBScript: String = js.native
}
object IEventHandler {
  
  @scala.inline
  def apply(
    Active: Boolean,
    Clone: () => IEventHandler,
    Description: String,
    EventType: MFEventHandlerType,
    GUID: String,
    GetID: () => Double,
    VBScript: String
  ): IEventHandler = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], GetID = js.Any.fromFunction0(GetID), VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventHandler]
  }
  
  @scala.inline
  implicit class IEventHandlerOps[Self <: IEventHandler] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IEventHandler): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: MFEventHandlerType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUID(value: String): Self = this.set("GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetID(value: () => Double): Self = this.set("GetID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVBScript(value: String): Self = this.set("VBScript", value.asInstanceOf[js.Any])
  }
}
