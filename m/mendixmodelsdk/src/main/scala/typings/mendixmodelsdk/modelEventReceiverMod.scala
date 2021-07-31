package typings.mendixmodelsdk

import typings.eventsource.mod.^
import typings.mendixmodelsdk.anon.HandleError
import typings.mendixmodelsdk.imodeleventMod.IDeltaEvent
import typings.mendixmodelsdk.imodeleventMod.IFileEvent
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelEventReceiverMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/model-events/ModelEventReceiver", "ModelEventReceiver")
  @js.native
  class ModelEventReceiver protected () extends StObject {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
    
    var client: js.Any = js.native
    
    var deltaEventEmitter: js.Any = js.native
    
    var errorHandler: js.Any = js.native
    
    var eventSource: ^ | Null = js.native
    
    var fileEventEmitter: js.Any = js.native
    
    def isRunning: Boolean = js.native
    
    def onDeltaEvent(callback: js.Function1[/* modelEvent */ IDeltaEvent, Unit]): Unit = js.native
    
    def onFileEvent(callback: js.Function1[/* modelEvent */ IFileEvent, Unit]): Unit = js.native
    
    def start(lastEventId: Double): Unit = js.native
    
    def stop(): Unit = js.native
    
    var workingCopyId: js.Any = js.native
  }
}
