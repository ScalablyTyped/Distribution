package typings.mfiles

import typings.mfiles.MFiles.MFEventHandlerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventHandler extends StObject {
  
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
  implicit class IEventHandlerMutableBuilder[Self <: IEventHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IEventHandler): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: MFEventHandlerType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetID(value: () => Double): Self = StObject.set(x, "GetID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVBScript(value: String): Self = StObject.set(x, "VBScript", value.asInstanceOf[js.Any])
  }
}
