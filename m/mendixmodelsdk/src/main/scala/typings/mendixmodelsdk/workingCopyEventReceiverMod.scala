package typings.mendixmodelsdk

import typings.eventsource.mod.^
import typings.mendixmodelsdk.anon.HandleError
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent
import typings.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/working-copy-events/WorkingCopyEventReceiver", JSImport.Namespace)
@js.native
object workingCopyEventReceiverMod extends js.Object {
  
  @js.native
  class WorkingCopyEventReceiver protected () extends js.Object {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
    
    var buildResultEventEmitter: js.Any = js.native
    
    var client: js.Any = js.native
    
    var errorHandler: js.Any = js.native
    
    var eventSource: ^  | Null = js.native
    
    def isRunning: Boolean = js.native
    
    def onBuildResultEvent(callback: js.Function1[/* buildResultEvent */ IBuildResultEvent, Unit]): Unit = js.native
    
    def onWorkingCopyDataEvent(callback: js.Function1[/* workingCopyDataEvent */ IWorkingCopyDataEvent, Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    var workingCopyDataEventEmitter: js.Any = js.native
    
    var workingCopyId: js.Any = js.native
  }
}
