package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import typings.mendixmodelsdk.deltaManagerMod.IDeltaManager
import typings.mendixmodelsdk.deltasMod.DeltaProcessor
import typings.mendixmodelsdk.imodeleventMod.IDeltaEvent
import typings.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelEventManagerMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/model-events/ModelEventManager", "ModelEventManager")
  @js.native
  class ModelEventManager protected ()
    extends StObject
       with IModelEventManager {
    def this(
      model: AbstractModel,
      deltaManager: IDeltaManager,
      deltaProcessor: DeltaProcessor,
      workingCopyId: String,
      currentEventId: Double
    ) = this()
    
    var currentEventId: js.Any = js.native
    
    var deltaProcessor: js.Any = js.native
    
    var eventEmitter: js.Any = js.native
    
    var eventQueue: js.Any = js.native
    
    var eventReceiver: ModelEventReceiver = js.native
    
    /* CompleteClass */
    override def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    var loadUnitResults: js.Any = js.native
    
    /* CompleteClass */
    override def loadUnitStarted(): Unit = js.native
    
    var modelChanged: js.Any = js.native
    
    /* CompleteClass */
    override def onEventProcessed(callback: IVoidCallback): Unit = js.native
    
    /* CompleteClass */
    override def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit = js.native
    
    var onNewDelta: js.Any = js.native
    
    var pendingUnits: js.Any = js.native
    
    var processEventsQueue: js.Any = js.native
    
    var processLoadedUnits: js.Any = js.native
    
    def scheduleEvent(deltaEvent: IDeltaEvent): Unit = js.native
    
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
    
    @scala.inline
    def apply(callback: () => Unit, eventId: Double): ILoadUnitResult = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), eventId = eventId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadUnitResult]
    }
    
    @scala.inline
    implicit class ILoadUnitResultMutableBuilder[Self <: ILoadUnitResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IModelEventManagerMutableBuilder[Self <: IModelEventManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadUnitCompleted(value: (Double, IVoidCallback, IErrorCallback) => Unit): Self = StObject.set(x, "loadUnitCompleted", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadUnitStarted(value: () => Unit): Self = StObject.set(x, "loadUnitStarted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEventProcessed(value: IVoidCallback => Unit): Self = StObject.set(x, "onEventProcessed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFileChangesReceived(value: js.Function1[/* files */ js.Array[String], Unit] => Unit): Self = StObject.set(x, "onFileChangesReceived", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
