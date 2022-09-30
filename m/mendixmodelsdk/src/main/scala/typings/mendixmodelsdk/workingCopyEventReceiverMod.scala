package typings.mendixmodelsdk

import typings.eventsource.mod.^
import typings.mendixmodelsdk.anon.HandleError
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent
import typings.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workingCopyEventReceiverMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/working-copy-events/WorkingCopyEventReceiver", "WorkingCopyEventReceiver")
  @js.native
  open class WorkingCopyEventReceiver protected () extends StObject {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
    
    /* private */ var buildResultEventEmitter: Any = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var errorHandler: Any = js.native
    
    var eventSource: ^ | Null = js.native
    
    def isRunning: Boolean = js.native
    
    def onBuildResultEvent(callback: js.Function1[/* buildResultEvent */ IBuildResultEvent, Unit]): Unit = js.native
    
    def onWorkingCopyDataEvent(callback: js.Function1[/* workingCopyDataEvent */ IWorkingCopyDataEvent, Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var workingCopyDataEventEmitter: Any = js.native
    
    /* private */ var workingCopyId: Any = js.native
  }
}
