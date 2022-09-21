package typings.piscina

import typings.node.workerThreadsMod.MessagePort
import typings.piscina.piscinaBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("piscina/dist/src/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object commonState {
    
    @JSImport("piscina/dist/src/common", "commonState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("piscina/dist/src/common", "commonState.isWorkerThread")
    @js.native
    def isWorkerThread: Boolean = js.native
    inline def isWorkerThread_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWorkerThread")(x.asInstanceOf[js.Any])
    
    @JSImport("piscina/dist/src/common", "commonState.workerData")
    @js.native
    def workerData: Unit = js.native
    inline def workerData_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerData")(x.asInstanceOf[js.Any])
  }
  
  inline def isMovable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMovable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTaskQueue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaskQueue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTransferable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransferable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("piscina/dist/src/common", "kFieldCount")
  @js.native
  val kFieldCount: /* 2 */ Double = js.native
  
  @JSImport("piscina/dist/src/common", "kQueueOptions")
  @js.native
  val kQueueOptions: js.Symbol = js.native
  
  @JSImport("piscina/dist/src/common", "kRequestCountField")
  @js.native
  val kRequestCountField: /* 0 */ Double = js.native
  
  @JSImport("piscina/dist/src/common", "kResponseCountField")
  @js.native
  val kResponseCountField: /* 1 */ Double = js.native
  
  @JSImport("piscina/dist/src/common", "kTransferable")
  @js.native
  val kTransferable: js.Symbol = js.native
  
  @JSImport("piscina/dist/src/common", "kValue")
  @js.native
  val kValue: js.Symbol = js.native
  
  inline def markMovable(value: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markMovable")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ReadyMessage extends StObject {
    
    var ready: `true`
  }
  object ReadyMessage {
    
    inline def apply(): ReadyMessage = {
      val __obj = js.Dynamic.literal(ready = true)
      __obj.asInstanceOf[ReadyMessage]
    }
    
    extension [Self <: ReadyMessage](x: Self) {
      
      inline def setReady(value: `true`): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestMessage extends StObject {
    
    var filename: String
    
    var name: String
    
    var task: Any
    
    var taskId: Double
  }
  object RequestMessage {
    
    inline def apply(filename: String, name: String, task: Any, taskId: Double): RequestMessage = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestMessage]
    }
    
    extension [Self <: RequestMessage](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTask(value: Any): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseMessage extends StObject {
    
    var error: js.Error | Null
    
    var result: Any
    
    var taskId: Double
  }
  object ResponseMessage {
    
    inline def apply(result: Any, taskId: Double): ResponseMessage = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[ResponseMessage]
    }
    
    extension [Self <: ResponseMessage](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartupMessage extends StObject {
    
    var filename: String | Null
    
    var name: String
    
    var niceIncrement: Double
    
    var port: MessagePort
    
    var sharedBuffer: js.typedarray.Int32Array
    
    var useAtomics: Boolean
  }
  object StartupMessage {
    
    inline def apply(
      name: String,
      niceIncrement: Double,
      port: MessagePort,
      sharedBuffer: js.typedarray.Int32Array,
      useAtomics: Boolean
    ): StartupMessage = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], niceIncrement = niceIncrement.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], sharedBuffer = sharedBuffer.asInstanceOf[js.Any], useAtomics = useAtomics.asInstanceOf[js.Any], filename = null)
      __obj.asInstanceOf[StartupMessage]
    }
    
    extension [Self <: StartupMessage](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNiceIncrement(value: Double): Self = StObject.set(x, "niceIncrement", value.asInstanceOf[js.Any])
      
      inline def setPort(value: MessagePort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSharedBuffer(value: js.typedarray.Int32Array): Self = StObject.set(x, "sharedBuffer", value.asInstanceOf[js.Any])
      
      inline def setUseAtomics(value: Boolean): Self = StObject.set(x, "useAtomics", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Task extends StObject
  
  trait TaskQueue extends StObject {
    
    def push(task: Task): Unit
    
    def remove(task: Task): Unit
    
    def shift(): Task | Null
    
    val size: Double
  }
  object TaskQueue {
    
    inline def apply(push: Task => Unit, remove: Task => Unit, shift: () => Task | Null, size: Double): TaskQueue = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), shift = js.Any.fromFunction0(shift), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueue]
    }
    
    extension [Self <: TaskQueue](x: Self) {
      
      inline def setPush(value: Task => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setRemove(value: Task => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setShift(value: () => Task | Null): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transferable extends StObject
}
