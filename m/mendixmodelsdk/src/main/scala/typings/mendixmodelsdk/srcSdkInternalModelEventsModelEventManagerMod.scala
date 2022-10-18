package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalDeltasDeltaManagerMod.IDeltaManager
import typings.mendixmodelsdk.srcSdkInternalDeltasMod.DeltaProcessor
import typings.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IModelEvent
import typings.mendixmodelsdk.srcSdkInternalModelEventsModelEventReceiverMod.ModelEventReceiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalModelEventsModelEventManagerMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/model-events/ModelEventManager", "ModelEventManager")
  @js.native
  open class ModelEventManager protected ()
    extends StObject
       with IModelEventManager {
    def this(
      model: AbstractModel,
      deltaManager: IDeltaManager,
      deltaProcessor: DeltaProcessor,
      workingCopyId: String,
      currentEventId: Double
    ) = this()
    
    /* private */ var currentEventId: Any = js.native
    
    /* private */ var deltaProcessor: Any = js.native
    
    /* private */ var eventEmitter: Any = js.native
    
    /* private */ var eventQueue: Any = js.native
    
    var eventReceiver: ModelEventReceiver = js.native
    
    /* CompleteClass */
    override def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    /* private */ var loadUnitResults: Any = js.native
    
    /* CompleteClass */
    override def loadUnitStarted(): Unit = js.native
    
    /* private */ var modelChanged: Any = js.native
    
    /* CompleteClass */
    override def onEventProcessed(callback: IVoidCallback): Unit = js.native
    
    /* CompleteClass */
    override def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit = js.native
    
    /* private */ var onNewDelta: Any = js.native
    
    /* private */ var pendingUnits: Any = js.native
    
    /* private */ var processEventsQueue: Any = js.native
    
    /* private */ var processLoadedUnits: Any = js.native
    
    def scheduleEvent(modelEvent: IModelEvent): Unit = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait ILoadUnitResult extends StObject {
    
    def callback(): Unit
    @JSName("callback")
    var callback_Original: IVoidCallback
    
    var eventId: Double
  }
  object ILoadUnitResult {
    
    inline def apply(callback: () => Unit, eventId: Double): ILoadUnitResult = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), eventId = eventId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadUnitResult]
    }
    
    extension [Self <: ILoadUnitResult](x: Self) {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IModelEventManager extends StObject {
    
    def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit
    
    def loadUnitStarted(): Unit
    
    def onEventProcessed(callback: IVoidCallback): Unit
    
    def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object IModelEventManager {
    
    inline def apply(
      loadUnitCompleted: (Double, IVoidCallback, IErrorCallback) => Unit,
      loadUnitStarted: () => Unit,
      onEventProcessed: IVoidCallback => Unit,
      onFileChangesReceived: js.Function1[/* files */ js.Array[String], Unit] => Unit,
      start: () => Unit,
      stop: () => Unit
    ): IModelEventManager = {
      val __obj = js.Dynamic.literal(loadUnitCompleted = js.Any.fromFunction3(loadUnitCompleted), loadUnitStarted = js.Any.fromFunction0(loadUnitStarted), onEventProcessed = js.Any.fromFunction1(onEventProcessed), onFileChangesReceived = js.Any.fromFunction1(onFileChangesReceived), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[IModelEventManager]
    }
    
    extension [Self <: IModelEventManager](x: Self) {
      
      inline def setLoadUnitCompleted(value: (Double, IVoidCallback, IErrorCallback) => Unit): Self = StObject.set(x, "loadUnitCompleted", js.Any.fromFunction3(value))
      
      inline def setLoadUnitStarted(value: () => Unit): Self = StObject.set(x, "loadUnitStarted", js.Any.fromFunction0(value))
      
      inline def setOnEventProcessed(value: IVoidCallback => Unit): Self = StObject.set(x, "onEventProcessed", js.Any.fromFunction1(value))
      
      inline def setOnFileChangesReceived(value: js.Function1[/* files */ js.Array[String], Unit] => Unit): Self = StObject.set(x, "onFileChangesReceived", js.Any.fromFunction1(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
