package typings.mendixmodelsdk

import typings.eventsource.mod.^
import typings.mendixmodelsdk.imodeleventMod.IModelEvent
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/model-events/ModelEventReceiver", JSImport.Namespace)
@js.native
object modelEventReceiverMod extends js.Object {
  @js.native
  class ModelEventReceiver protected () extends js.Object {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: AnonErrorCallback) = this()
    var client: js.Any = js.native
    var errorHandler: js.Any = js.native
    var eventEmitter: js.Any = js.native
    var eventSource: ^  | Null = js.native
    var workingCopyId: js.Any = js.native
    def isRunning(): Boolean = js.native
    def onNewModelEvent(callback: js.Function1[/* modelEvent */ IModelEvent, Unit]): Unit = js.native
    def start(lastEventId: Double): Unit = js.native
    def stop(): Unit = js.native
  }
  
}

