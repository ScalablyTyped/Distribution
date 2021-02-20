package typings.piscina

import typings.node.workerThreadsMod.MessagePort
import typings.piscina.piscinaBooleans.`true`
import typings.std.Error
import typings.std.Int32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  object commonState {
    
    @JSImport("piscina/dist/src/common", "commonState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("piscina/dist/src/common", "commonState.isWorkerThread")
    @js.native
    def isWorkerThread: Boolean = js.native
    @scala.inline
    def isWorkerThread_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWorkerThread")(x.asInstanceOf[js.Any])
    
    @JSImport("piscina/dist/src/common", "commonState.workerData")
    @js.native
    def workerData: js.UndefOr[scala.Nothing] = js.native
    @scala.inline
    def workerData_=(x: js.UndefOr[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerData")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("piscina/dist/src/common", "isMovable")
  @js.native
  def isMovable(value: js.Any): Boolean = js.native
  
  @JSImport("piscina/dist/src/common", "isTaskQueue")
  @js.native
  def isTaskQueue(value: js.Any): Boolean = js.native
  
  @JSImport("piscina/dist/src/common", "isTransferable")
  @js.native
  def isTransferable(value: js.Any): Boolean = js.native
  
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
  
  @JSImport("piscina/dist/src/common", "markMovable")
  @js.native
  def markMovable(value: js.Object): Unit = js.native
  
  @js.native
  trait ReadyMessage extends StObject {
    
    var ready: `true` = js.native
  }
  object ReadyMessage {
    
    @scala.inline
    def apply(ready: `true`): ReadyMessage = {
      val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadyMessage]
    }
    
    @scala.inline
    implicit class ReadyMessageMutableBuilder[Self <: ReadyMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReady(value: `true`): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestMessage extends StObject {
    
    var filename: String = js.native
    
    var task: js.Any = js.native
    
    var taskId: Double = js.native
  }
  object RequestMessage {
    
    @scala.inline
    def apply(filename: String, task: js.Any, taskId: Double): RequestMessage = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestMessage]
    }
    
    @scala.inline
    implicit class RequestMessageMutableBuilder[Self <: RequestMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: js.Any): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseMessage extends StObject {
    
    var error: Error | Null = js.native
    
    var result: js.Any = js.native
    
    var taskId: Double = js.native
  }
  object ResponseMessage {
    
    @scala.inline
    def apply(result: js.Any, taskId: Double): ResponseMessage = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseMessage]
    }
    
    @scala.inline
    implicit class ResponseMessageMutableBuilder[Self <: ResponseMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartupMessage extends StObject {
    
    var filename: String | Null = js.native
    
    var niceIncrement: Double = js.native
    
    var port: MessagePort = js.native
    
    var sharedBuffer: Int32Array = js.native
    
    var useAtomics: Boolean = js.native
  }
  object StartupMessage {
    
    @scala.inline
    def apply(niceIncrement: Double, port: MessagePort, sharedBuffer: Int32Array, useAtomics: Boolean): StartupMessage = {
      val __obj = js.Dynamic.literal(niceIncrement = niceIncrement.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], sharedBuffer = sharedBuffer.asInstanceOf[js.Any], useAtomics = useAtomics.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartupMessage]
    }
    
    @scala.inline
    implicit class StartupMessageMutableBuilder[Self <: StartupMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setNiceIncrement(value: Double): Self = StObject.set(x, "niceIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: MessagePort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedBuffer(value: Int32Array): Self = StObject.set(x, "sharedBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAtomics(value: Boolean): Self = StObject.set(x, "useAtomics", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Task extends StObject
  
  @js.native
  trait TaskQueue extends StObject {
    
    def push(task: Task): Unit = js.native
    
    def remove(task: Task): Unit = js.native
    
    def shift(): Task | Null = js.native
    
    val size: Double = js.native
  }
  object TaskQueue {
    
    @scala.inline
    def apply(push: Task => Unit, remove: Task => Unit, shift: () => Task | Null, size: Double): TaskQueue = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), shift = js.Any.fromFunction0(shift), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueue]
    }
    
    @scala.inline
    implicit class TaskQueueMutableBuilder[Self <: TaskQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPush(value: Task => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: Task => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShift(value: () => Task | Null): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transferable extends StObject
}
