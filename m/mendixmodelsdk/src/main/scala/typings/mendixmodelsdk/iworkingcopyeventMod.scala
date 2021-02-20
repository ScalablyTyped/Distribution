package typings.mendixmodelsdk

import typings.mendixmodelsdk.anon.EventId
import typings.mendixmodelsdk.mendixmodelsdkStrings.buildResult
import typings.mendixmodelsdk.mendixmodelsdkStrings.workingCopyData
import typings.mendixmodelsdk.transportInterfacesMod.IWorkingCopy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iworkingcopyeventMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.mendixmodelsdkStrings.Failure
    - typings.mendixmodelsdk.mendixmodelsdkStrings.Success
  */
  trait BuildResultStatus extends StObject
  object BuildResultStatus {
    
    @scala.inline
    def Failure: typings.mendixmodelsdk.mendixmodelsdkStrings.Failure = "Failure".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.Failure]
    
    @scala.inline
    def Success: typings.mendixmodelsdk.mendixmodelsdkStrings.Success = "Success".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.Success]
  }
  
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
    implicit class IBuildResultEventMutableBuilder[Self <: IBuildResultEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: EventId): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: buildResult): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class IWorkingCopyDataEventMutableBuilder[Self <: IWorkingCopyDataEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: IWorkingCopy): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: workingCopyData): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent
    - typings.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent
  */
  trait IWorkingCopyEvent extends StObject
  object IWorkingCopyEvent {
    
    @scala.inline
    def IBuildResultEvent(data: EventId, `type`: buildResult): typings.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent]
    }
    
    @scala.inline
    def IWorkingCopyDataEvent(data: IWorkingCopy, `type`: workingCopyData): typings.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent]
    }
  }
}
